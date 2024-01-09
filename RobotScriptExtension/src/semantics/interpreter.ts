import { evalBin, evalUn } from '../language/robot-script-utils.js'
import { getBaseScene, Scene } from '../web/simulator/scene.js'
import {
    AnyType,
    AssignVar,
    BinExpr,
    Block,
    Distance,
    EntryPoint,
    FunCall,
    FunDef,
    GetSpeed,
    Group,
    IfStmt,
    Linear,
    Lit,
    Ref,
    ReturnStmt,
    RobotScriptVisitor,
    Rotation,
    SetSpeed,
    Time,
    UnExpr,
    UnitCast,
    VarDecl,
    WhileStmt,
} from './visitor.js'
import * as AST from '../language/generated/ast.js'
import { UsageRestrictedFunCall, getPcval } from '../language/robot-script-validator.js'
import { ScopeNode, Symb, SymbState, TreeScope } from '../language/tree-scope.js'

/**
 * Classe permettant de gérer les scopes au cours de l'interprétation
 */
class StackedScope {
    private local: Map<string, number | boolean | 'nothing'> = new Map()

    private constructor(
        private creator?: StackedScope,
        private isRelated: boolean = true,
    ) {}

    public static createRoot(): StackedScope {
        const root = new StackedScope()
        return root
    }

    public createChild(): StackedScope {
        const child = new StackedScope(this)
        return child
    }

    public createStranger(): StackedScope {
        const stranger = new StackedScope(this, false)
        return stranger
    }

    public pop(): StackedScope | undefined {
        return this.creator
    }

    public get(name: string): number | boolean {
        const val = this.local.get(name)
        if (val === 'nothing') {
            throw new Error(`Variable '${name}' not initialized`)
        } else if (val === undefined && this.creator && this.isRelated) {
            return this.creator.get(name)
        } else if (val === undefined) {
            throw new Error(`Variable '${name}' not found in scope`)
        }
        return val
    }

    public create(name: string, data?: { type: AnyType['name']; val: number | boolean }): void {
        if (this.local.has(name)) {
            throw new Error(`Variable '${name}' already exists locally`)
        }

        let val: number | boolean | 'nothing' = 'nothing'
        if (data) {
            val = convert(data.val, data.type)
        }
        this.local.set(name, val)
    }

    public update(name: string, data: { type: AnyType['name']; val: number | boolean }): void {
        if (this.local.has(name)) {
            const val = convert(data.val, data.type)
            this.local.set(name, val)
        } else if (this.creator && this.isRelated) {
            this.creator.update(name, data)
        } else {
            throw new Error(`Variable '${name}' not found in scope`)
        }
    }
}

/**
 * Fonction permettant de convertir une valeur en un type donné
 * @param val La valeur à convertir
 * @param type Le type de la valeur
 * @returns La valeur convertie
 */
function convert(val: number | boolean, type: AnyType['name']): number | boolean {
    switch (type) {
        case 'number':
            return +val
        case 'bool':
            return !!val
        default:
            throw new Error(`Cannot convert to ${type}`)
    }
}

export class Interpreter implements RobotScriptVisitor {
    private scene: Scene = getBaseScene()
    private scopeStack: StackedScope | undefined
    private forwarded: Array<number | boolean> = []

    constructor(private pcScope: TreeScope) {}

    visitEntryPoint(ep: EntryPoint): Scene {
        const main = ep.funs.find((fun) => fun.name === 'main')
        if (!main) {
            throw new Error('No main function found')
        }

        const tmp = this.pcScope.getAssociated(main as ScopeNode)
        if (!tmp) {
            throw new Error('Precomputed scope not found for main function')
        }
        const prevPcScope = this.pcScope
        this.pcScope = tmp

        this.scopeStack = StackedScope.createRoot()
        main.accept(this)
        this.scopeStack.pop()

        this.pcScope = prevPcScope
        return this.scene
    }

    visitFunDef(fun: FunDef): void {
        fun.params.forEach((param, i) => {
            if (this.scopeStack === undefined) {
                throw new Error(`Scope stack is undefined in function '${fun.name}'`)
            }
            const expr = this.forwarded.pop()
            if (expr === undefined) {
                throw new Error(`Missing parameter ${i} in call to function '${fun.name}'`)
            }
            param.accept(this)
            const type = param.type.accept(this) as AnyType['name']
            const val = convert(expr, type)
            this.scopeStack.update(param.name, { type, val })
        })
        if (this.forwarded.length !== 0) {
            throw new Error(
                `Remains ${this.forwarded.length} parameters in call to function '${fun.name}'`,
            )
        }

        fun.body.accept(this)
    }

    visitAnyType(type: AnyType): AnyType['name'] {
        return type.name
    }

    /**
     * Permet de gérer la déclaration d'une variable
     * @param decl Un noeud de déclaration de variable
     * @returns false pour indiquer qu'il ne s'agit pas d'une instruction de retour
     */
    visitVarDecl(decl: VarDecl): false {
        if (this.scopeStack === undefined) {
            throw new Error(`Scope stack is undefined in declaration of variable '${decl.name}'`)
        }
        const status = this.pcScope.getStatus(decl as Symb)
        if (status === SymbState.used) {
            if (decl.expr) {
                const type = decl.type.accept(this) as AnyType['name']
                const val = decl.expr.accept(this) as number | boolean
                this.scopeStack.create(decl.name, { type, val })
            } else {
                this.scopeStack.create(decl.name)
            }
        }
        return false
    }

    /**
     * Permet de récupérer la valeur d'une expression binaire
     * @param binex Un noeud d'expression binaire
     * @returns La valeur de l'expression binaire
     */
    visitBinExpr(binex: BinExpr): number | boolean {
        const pc = getPcval(binex as AST.Expression)
        if (pc !== undefined) {
            return pc
        }
        const left = binex.expr1.accept(this) as number | boolean
        const right = binex.expr2.accept(this) as number | boolean
        return evalBin(binex.op, left, right)
    }

    /**
     * Permet de récupérer la valeur d'une expression unaire
     * @param unex Un noeud d'expression unaire
     * @returns La valeur de l'expression unaire
     */
    visitUnExpr(unex: UnExpr): number | boolean {
        const pc = getPcval(unex as AST.Expression)
        if (pc !== undefined) {
            return pc
        }
        const expr = unex.expr.accept(this) as number | boolean
        return evalUn(unex.op, expr)
    }

    /**
     * Permet de récupérer la valeur d'un littéral
     * @param lit Un noeud de littéral
     * @returns La valeur du littéral
     */
    visitLit(lit: Lit): number | boolean {
        return lit.val
    }

    /**
     * Permet de récupérer la valeur d'un groupe
     * @param group Un noeud de groupe
     * @returns La valeur du groupe
     */
    visitGroup(group: Group): number | boolean {
        const pc = getPcval(group as AST.Expression)
        return pc ?? group.expr.accept(this)
    }

    /**
     * Permet de récupérer la valeur d'une référence
     * @param ref Un noeud de référence
     * @returns La valeur de la référence
     */
    visitRef(ref: Ref): number | boolean {
        const pc = getPcval(ref as AST.Expression)
        if (pc !== undefined) {
            return pc
        }
        const rvar = ref.val.ref
        if (rvar === undefined) {
            throw new Error('Reference to refered variable is broken')
        } else if (this.scopeStack === undefined) {
            throw new Error(`Scope stack is undefined in reference to variable '${rvar.name}'`)
        }
        const val = this.scopeStack.get(rvar.name)
        return val
    }

    /**
     * Permet de récupérer la vitesse
     * @param speed Un noeud de vitesse
     * @returns La vitesse
     */
    visitGetSpeed(speed: GetSpeed): number {
        const factor = speed.unit?.accept(this) || 1
        return this.scene.robot.speed / factor
    }

    visitDistance(dist: Distance) {
        throw new Error('Method not implemented.')
    }

    /**
     * Permet de récupérer le temps écoulé
     * @param time Un noeud de temps
     * @returns Le temps écoulé
     */
    visitTime(time: Time): number {
        return this.scene.time
    }

    /**
     * Permet de gérer un appel de fonction
     * @param call Un noeud d'appel de fonction
     * @returns La valeur de retour de la fonction si elle est utilisée dans une expression,
     *         sinon false pour indiquer qu'il ne s'agit pas d'une instruction de retour
     */
    visitFunCall(call: FunCall): number | boolean {
        const fun = call.fun.ref
        if (fun === undefined) {
            throw new Error('Reference to called function is broken')
        }
        const tmp = this.pcScope.getAssociated(fun as ScopeNode)
        if (!tmp) {
            throw new Error(`Precomputed scope not found for function '${fun.name}'`)
        }
        if (this.scopeStack === undefined) {
            throw new Error(`Unexpected undefined scope stack in call to function '${fun.name}'`)
        }
        const prevPcScope = this.pcScope
        this.pcScope = tmp

        call.params.forEach((param) => this.forwarded.push(param.accept(this))) // sends the parameters
        this.forwarded.reverse() // To pop in the right order

        this.scopeStack = this.scopeStack.createStranger() // creates a new scope for the function
        fun.accept(this)
        this.scopeStack = this.scopeStack.pop() // destroys the scope for the function

        this.pcScope = prevPcScope

        const usage = (call as UsageRestrictedFunCall).usage
        switch (usage) {
            case 'expr':
                const type = fun.type.accept(this) as AnyType['name']
                const val = this.forwarded.pop() // rerieves the returned value
                if (val === undefined) {
                    throw new Error(`No return value found in call to function '${fun.name}'`)
                }
                return convert(val, type) // returns the value to be used in the expression
            case 'stmt':
                this.forwarded.pop() // ignores the returned value (if any)
                return false // signifies that this is not a return statement
            default:
                throw new Error(`Unknown usage '${usage}' in call to function '${fun.name}'`) // should never happen
        }
    }

    /**
     * Permet de gérer un bloc de code
     * @param block Un noeud de bloc de code
     * @returns un boolean indiquant si une instruction de retour a été exécutée
     */
    visitBlock(block: Block): boolean {
        if (!AST.isFunDef(block.$container)) {
            const tmp = this.pcScope.getAssociated(block as ScopeNode)
            if (!tmp) {
                throw new Error('Precomputed scope not found for block')
            }
            if (this.scopeStack === undefined) {
                throw new Error('Unexpected undefined scope stack in block')
            }
            const prevPcScope = this.pcScope
            this.pcScope = tmp

            this.scopeStack = this.scopeStack.createChild() // creates a new scope for the block
            const returned = block.stmts.some((stmt) => stmt.accept(this) as boolean)
            this.scopeStack = this.scopeStack.pop() // destroys the scope for the block

            this.pcScope = prevPcScope
            return returned
        } else {
            return block.stmts.some((stmt) => stmt.accept(this) as boolean)
        }
    }

    /**
     * Permet de gérer l'assignation à une variable
     * @param assign Un noeud d'assignation
     * @returns false pour indiquer qu'il ne s'agit pas d'une instruction de retour
     */
    visitAssignVar(assign: AssignVar): false {
        const rvar = assign.ref.ref
        if (rvar === undefined) {
            throw new Error('Reference to assigned variable is broken')
        } else if (this.scopeStack === undefined) {
            throw new Error(`Scope stack is undefined in assignment to variable '${rvar.name}'`)
        }

        const status = this.pcScope.getStatus(rvar as Symb)

        if (status === SymbState.used) {
            let val = assign.expr.accept(this) as number | boolean
            if (assign.op !== '=') {
                const op = assign.op.slice(0, -1) as BinExpr['op']
                val = evalBin(op, this.scopeStack.get(rvar.name), val)
            }

            const type = rvar.type.accept(this) as AnyType['name']
            this.scopeStack.update(rvar.name, { type, val })
        }

        return false
    }

    /**
     * Permet de gérer l'instruction de changement de vitesse
     * @param set Un noeud de changement de vitesse
     * @returns false pour indiquer qu'il ne s'agit pas d'une instruction de retour
     */
    visitSetSpeed(set: SetSpeed): false {
        let speed = set.expr.accept(this) as number | boolean

        if (set.op !== '=') {
            const op = set.op.replace('=', '') as BinExpr['op']
            speed = evalBin(op, speed, speed)
        }

        if (+speed < 0) {
            throw new Error(`Negative speed: ${speed}`)
        }

        const factor = set.unit?.accept(this) || 1
        this.scene.robot.speed = +speed * factor
        return false
    }

    /**
     * Permet de gérer la boucle while
     * @param stmt Un noeud de boucle while
     * @returns un boolean indiquant si une instruction de retour a été exécutée
     */
    visitWhileStmt(stmt: WhileStmt): boolean {
        while (stmt.expr.accept(this)) {
            const returned = stmt.stmt.accept(this) as boolean
            if (returned) {
                return true
            }
        }
        return false
    }

    /**
     * Permet de gérer l'instruction if/else
     * @param stmt Un noeud de if/else
     * @returns un boolean indiquant si une instruction de retour a été exécutée
     */
    visitIfStmt(stmt: IfStmt): boolean {
        if (stmt.expr.accept(this)) {
            return stmt.stmt1.accept(this) as boolean
        } else if (stmt.stmt2) {
            return stmt.stmt2.accept(this) as boolean
        }
        return false
    }

    /**
     * Permet de gérer l'instruction de retour
     * @param stmt Un noeud de retour
     * @returns true pour indiquer qu'il s'agit d'une instruction de retour
     */
    visitReturnStmt(stmt: ReturnStmt): true {
        const val = stmt.expr?.accept(this)
        if (val !== undefined) {
            this.forwarded.push(val)
        }
        return true
    }

    /**
     * Permet de gérer le déplacement
     * @param lin Un noeud de déplacement
     * @returns false pour indiquer qu'il ne s'agit pas d'une instruction de retour
     */
    visitLinear(lin: Linear): false {
        const factor = lin.unit?.accept(this) || 1
        const dist = +lin.expr.accept(this) * factor
        switch (lin.dir) {
            case 'Forward':
                dist && this.scene.robot.move(dist)
                break
            case 'Sideways':
                dist && this.scene.robot.side(dist)
                break
            default:
                throw new Error('Unknown direction')
        }
        return false
    }

    /**
     * Permet de gérer la rotation
     * @param rot Un noeud de rotation
     * @returns false pour indiquer qu'il ne s'agit pas d'une instruction de retour
     */
    visitRotation(rot: Rotation): false {
        const angle = +rot.expr.accept(this)
        angle && this.scene.robot.turn(angle)
        return false
    }

    /**
     * Permet de récupérer le facteur de conversion d'un noeud de cast
     * @param cast Un noeud de cast
     * @returns Le facteur de conversion
     */
    visitUnitCast(cast: UnitCast): number {
        switch (cast.unit) {
            case 'm':
                return 1000
            case 'dm':
                return 100
            case 'cm':
                return 10
            case 'mm':
                return 1
            default:
                throw new Error('Unknown unit')
        }
    }
}
