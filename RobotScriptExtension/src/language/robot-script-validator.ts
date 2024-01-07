import type { AstNode, LangiumDocument, ValidationAcceptor, ValidationChecks } from 'langium'
import type { RobotScriptServices } from './robot-script-module.js'
import { evalBin, evalUn } from './robot-script-utils.js'
import { SymbState, TreeScope } from './tree-scope.js'
import { AnyType, BinExpr, EntryPoint, Expression, FunCall, FunDef, Ref, RobotScriptAstType, Statement, VarDecl, isAssignVar, isBinExpr, isBlock, isFunCall, isFunDef, isGroup, isIfStmt, isLit, isRef, isReturnStmt, isSetSpeed, isUnExpr, isVarDecl, isWhileStmt } from './generated/ast.js'

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobotScriptServices) {
    const registry = services.validation.ValidationRegistry
    const validator = services.validation.RobotScriptValidator
    const checks: ValidationChecks<RobotScriptAstType> = {
        EntryPoint: [validator.checkScope],
        FunDef: [
            validator.checkMainSignature,
            validator.checkReturn
        ],
        FunCall: [
            validator.checkFunCallParamNumber,
            validator.checkFunCallExprNotVoid
        ],
        VarDecl: [validator.checkVarDeclInsideBlock],
    }
    registry.register(checks, validator)
}

/**
 * Type permettant de stocker le scope calculé dans le document
 */
export type DocWithScope<T extends AstNode> = LangiumDocument<T> & { scope: TreeScope }

/**
 * Type permettant de savoir si un appel de fonction est utilisé comme une expression ou une instruction
 */
export type UsageRestrictedFunCall = FunCall & { usage?: 'stmt' | 'expr'}

/**
 * Type permettant de stocker une valeur précalculée
 */
export type Precomputed<T extends AstNode> = T & { pcval?: number | boolean }

/**
     * Fonction permettant de récupérer la valeur précalculée d'un noeud
     * @param node Un noeud de l'AST
     * @returns La valeur précalculée du noeud ou `undefined` si elle n'existe pas
     */
export function getPcval<T extends Expression>(node: T|undefined): number | boolean | undefined {
    if (isLit(node)) {
        return node.val
    }
    return (node as Precomputed<T>)?.pcval
}

/**
 * Implementation of custom validations.
 */
export class RobotScriptValidator {

    /**
     * Permet de vérifier que le scope est correctement défini.
     * De plus, précalcule les valeurs des expressions constantes.
     * @param ep Le noeud de point d'entrée
     * @param accept le callback permettant de signaler une erreur
     */
    checkScope(ep: EntryPoint, accept: ValidationAcceptor): void {
        const scope = TreeScope.createRoot()
        ep.funs?.forEach((fun) => {
            if (fun?.name) {
                scope.addSymb(fun, true) ||
                    accept('error', `Duplicate function '${fun.name}'.`, {
                        node: fun,
                        property: 'name',
                    })
            }
        })
        ep.funs?.forEach((fun) => {
            this.checkScopeFun(fun, accept, scope)
        })

        const main = ep.funs?.find((fun) => fun?.name === 'main')
        if (main) {
            scope.setUsed(main)
        } else {
            accept('error', "Function 'main' is not defined.", {
                node: ep,
                range: {
                    start: { line: 0, character: 0 },
                    end: { line: 0, character: 0 },
                }
            })
        }

        scope.getLocalUnused().forEach((def) => {
            def.name &&
                accept('warning', `Unused function '${def.name}'.`, {
                    node: def,
                    property: 'name',
                    tags: [1],
                })
        })

        const doc = ep.$document as DocWithScope<EntryPoint>
        doc.scope = scope
    }

    /**
     * Fonction auxiliaire de `checkScope` permettant de vérifier le scope d'une fonction
     * @param fun Un noeud de fonction
     * @param accept Le callback permettant de signaler une erreur
     * @param scope Le scope parent
     */
    private checkScopeFun(
        fun: FunDef,
        accept: ValidationAcceptor,
        outScope: TreeScope
    ): void {
        const scope = outScope.createChild(fun)

        fun.params?.forEach((param) => {
            if (param?.name && !scope.addSymb(param, true)) {
                accept('error', `Duplicate parameter '${param.name}'.`, {
                    node: param,
                    property: 'name',
                })
            }
        })

        this.checkScopeStatement(fun.body, accept, scope)
    }

    /**
     * Fonction auxiliaire de `checkScope` permettant de vérifier le scope d'une instruction
     * @param stmt Un noeud d'instruction
     * @param accept Le callback permettant de signaler une erreur
     * @param outScope Le scope parent
     */
    private checkScopeStatement(
        stmt: Statement,
        accept: ValidationAcceptor,
        outScope: TreeScope
    ): void {
        if (isBlock(stmt)) {
            const scope = isFunDef(stmt.$container)
                ? outScope
                : outScope.createChild(stmt)

            stmt.stmts?.forEach((stmt) => {
                this.checkScopeStatement(stmt, accept, scope)
            })

            scope.getLocalUnused().forEach((def) => {
                accept('warning', `Unused ${isFunDef(def.$container) ? 'parameter' : 'variable'} '${def.name}'.`, {
                    node: def,
                    property: 'name',
                    tags: [1],
                })
            })
        } else if (isVarDecl(stmt)) {
            stmt.expr && this.checkScopeExpr(stmt.expr, accept, outScope)
            if (stmt.name && !outScope.addSymb(stmt, !!stmt.expr, getPcval(stmt.expr))) {
                accept('error', `Duplicate variable '${stmt.name}'.`, {
                    node: stmt,
                    property: 'name',
                })
            }
        } else if (isWhileStmt(stmt)) {
            this.checkScopeExpr(stmt.expr, accept, outScope)
            this.checkScopeStatement(stmt.stmt, accept, outScope)
        } else if (isIfStmt(stmt)) {
            this.checkScopeExpr(stmt.expr, accept, outScope)
            this.checkScopeStatement(stmt.stmt1, accept, outScope)
            stmt.stmt2 && this.checkScopeStatement(stmt.stmt2, accept, outScope)
        } else if (isFunCall(stmt)) {
            this.checkScopeExpr(stmt, accept, outScope)
        } else if (isAssignVar(stmt)) {
            if (stmt.expr) {
                this.checkScopeExpr(stmt.expr, accept, outScope)
                const rvar = stmt.ref.ref
                if (rvar) {
                    const prevPcval = outScope.getPcval(rvar)
                    let nextPcval = getPcval(stmt.expr)
                    if (stmt.op !== '=' && prevPcval !== undefined && nextPcval !== undefined) {
                        try {
                            nextPcval = evalBin(stmt.op.slice(0, -1) as BinExpr['op'], prevPcval, nextPcval)
                        } catch (e: any) {
                            nextPcval = undefined
                            accept('error', 'Division by zero detected.', {
                                node: stmt,
                                property: 'op',
                            })
                        }
                    }
                    outScope.setPcval(rvar, nextPcval)
                }
            }
        } else if (isSetSpeed(stmt)) {
            if (stmt.expr) {
                const pc = getPcval(stmt.expr)
                if (pc !== undefined && +pc < 0) {
                    accept('error', 'Negative speed detected.', {
                        node: stmt.expr,
                        property: 'val',
                    })
                }
            }
            
        } else {
            stmt?.expr && this.checkScopeExpr(stmt.expr, accept, outScope)
        }
    }

    /**
     * Fonction auxiliaire de `checkScope` permettant de vérifier le scope d'une expression
     * @param expr Un noeud d'expression
     * @param accept Le callback permettant de signaler une erreur
     * @param outScope Le scope parent
     */
    private checkScopeExpr(
        expr: Expression,
        accept: ValidationAcceptor,
        outScope: TreeScope
    ): void {
        if (isFunCall(expr)) {
            const ref = expr.fun?.ref
            if (ref?.name === 'main') {
                accept('error', "Function 'main' cannot be called.", {
                    node: expr,
                    property: 'fun',
                })
            } else if(ref) {
                outScope.setUsed(ref)
                expr.params?.forEach((param) => {
                    this.checkScopeExpr(param, accept, outScope)
                })
            }
        } else if (isBinExpr(expr)) {
            this.checkScopeExpr(expr.expr1, accept, outScope)
            this.checkScopeExpr(expr.expr2, accept, outScope)
            const pce = expr as Precomputed<Expression>
            pce.pcval = this.preCompute(expr, accept)
        } else if (isUnExpr(expr)) {
            this.checkScopeExpr(expr.expr, accept, outScope)
            const pce = expr as Precomputed<Expression>
            pce.pcval = this.preCompute(expr, accept)
        } else if (isGroup(expr)) {
            this.checkScopeExpr(expr.expr, accept, outScope)
            const pce = expr as Precomputed<Expression>
            pce.pcval = getPcval(expr.expr)
        } else if (isRef(expr)) {
            const rvar = expr.val?.ref
            if (rvar?.name) {
                const state = outScope.setUsed(rvar)
                if (state === SymbState.undefined) {
                    accept('error', `Variable '${rvar.name}' used before being defined.`, {
                        node: expr,
                        property: 'val',
                    })
                } else if (state === SymbState.undeclared) {
                    accept('error', `Variable '${rvar.name}' used before being declared.`, {
                        node: expr,
                        property: 'val',
                    })
                }
                const pcr = expr as Precomputed<Ref>
                pcr.pcval = outScope.getPcval(rvar)
            }
        }
    }

    /**
     * Fonction permettant de précalculer une expression
     * @param expr Un noeud d'expression
     * @param accept Le callback permettant de signaler une erreur
     * @returns La valeur précalculée de l'expression ou `undefined` si elle ne peut pas être précalculée
     */
    private preCompute(expr: Expression, accept: ValidationAcceptor): number | boolean | undefined {
        if (isUnExpr(expr)) {
            const val = getPcval(expr.expr)
            if (val !== undefined && expr.op) {
                return evalUn(expr.op, val)
            }
        } else if (isBinExpr(expr)) {
            const val1 = getPcval(expr.expr1)
            const val2 = getPcval(expr.expr2)
            if (val1 !== undefined && val2 !== undefined && expr.op) {
                try {
                    return evalBin(expr.op, val1, val2)
                } catch (e: any) {
                    accept('error', 'Division by zero detected.', {
                        node: expr,
                        property: 'op',
                    })
                }
            }
        }
        return undefined
    }

    /**
     * Permet de vérifier que la signature de la fonction main est correcte
     * @param fun Un noeud de fonction
     * @param accept Le callback permettant de signaler une erreur
     */
    checkMainSignature(fun: FunDef, accept: ValidationAcceptor): void {
        if (fun.name === 'main') {
            fun.params?.length === 0 ||
                accept('error', "Function 'main' cannot have parameters.", {
                    node: fun,
                    property: 'name',
                })

            fun.type?.name === 'void' ||
                accept('error', "Function 'main' must return void.", {
                    node: fun,
                    property: 'name',
                })
        }
    }

    /**
     * Permet de vérifier qu'une fonction retourne une valeur conforme à son type
     * @param fun Un noeud de fonction
     * @param accept Le callback permettant de signaler une erreur
     */
    checkReturn(fun: FunDef, accept: ValidationAcceptor): void {
        if (fun.name) {
            this.checkReturnRec(fun.body, accept, fun.type) ||
            fun.type?.name === 'void' ||
                accept('error',
                    `Function '${fun.name}' must return a value of type '${fun.type.name}'.`,
                    { node: fun, property: 'type' }
                )
        }
    }

    /**
     * Fonction auxiliaire de `checkReturn` permettant de vérifier qu'une fonction retourne une valeur conforme à son type
     * @param stmt Un noeud d'instruction
     * @param accept Le callback permettant de signaler une erreur
     * @param type Le type de retour de la fonction
     * @returns `true` si le noeud retourne une valeur, `false` sinon
     */
    private checkReturnRec(
        stmt: Statement,
        accept: ValidationAcceptor,
        type: AnyType
    ): boolean {
        if (isReturnStmt(stmt)) {
            if (stmt.expr && type?.name === 'void') {
                accept('error', "Cannot assign a value to type 'void'.", {
                    node: stmt,
                })
            } else if (!stmt.expr && type?.name !== 'void') {
                type?.name &&
                    accept('error',
                        `Cannot assign a value of type 'void' to type '${type.name}'.`,
                        { node: stmt }
                    )
            }
            return true
        } else if (isWhileStmt(stmt)) {
            const cond = getPcval(stmt.expr)
            if (cond !== undefined) {
                accept(cond ? 'hint' : 'warning', `Loop condition will always evaluate to ${!!cond}.`, {
                    node: stmt.expr,
                    tags: [1],
                })
                stmt.stmt &&
                    accept('hint', 'Unreachable code.', {
                        node: stmt.stmt,
                        tags: [1],
                    })
            } else if (stmt.stmt) {
                return (
                    this.checkReturnRec(stmt.stmt, accept, type) &&
                    cond !== undefined // if cond is undefined we cannot be sure that the loop will run
                )
            }
        } else if (isIfStmt(stmt)) {
            const cond = getPcval(stmt.expr)
            if (cond !== undefined) {
                accept('hint', `If condition will always evaluate to ${!!cond}.`, {
                    node: stmt.expr,
                    tags: [1],
                })
            }
            if (cond === undefined) {
                const ifRet = this.checkReturnRec(stmt.stmt1, accept, type)
                const elseRet =
                    stmt.stmt2 !== undefined &&
                    this.checkReturnRec(stmt.stmt2, accept, type)
                return ifRet && elseRet
            } else if (cond) {
                stmt.stmt2 &&
                    accept('hint', 'Unreachable code.', {
                        node: stmt.stmt2,
                        tags: [1],
                    })
                return this.checkReturnRec(stmt.stmt1, accept, type)
            } else {
                stmt.stmt1 &&
                    accept('hint', 'Unreachable code.', {
                        node: stmt.stmt1,
                        tags: [1],
                    })
                return (
                    stmt.stmt2 !== undefined &&
                    this.checkReturnRec(stmt.stmt2, accept, type)
                )
            }
        } else if (isBlock(stmt) && stmt.stmts?.length > 0) {
            const retStmt = stmt.stmts.find(
                (stmt) => this.checkReturnRec(stmt, accept, type)
            )

            if (
                retStmt?.$containerIndex !== undefined &&
                retStmt.$containerIndex !== stmt.stmts.length - 1
            ) {
                const startNode = stmt.stmts[retStmt.$containerIndex + 1].$cstNode
                const endNode = stmt.stmts[stmt.stmts.length - 1].$cstNode

                startNode &&
                    endNode &&
                    accept('warning', 'Unreachable code.', {
                        node: stmt,
                        range: {
                            start: startNode.range.start,
                            end: endNode.range.end,
                        },
                        tags: [1],
                    })
            }
            return retStmt !== undefined
        }
        return false
    }

    /**
     * Permet de vérifier que le nombre de paramètres d'un appel de fonction est correct
     * @param call Un noeud d'appel de fonction
     * @param accept Le callback permettant de signaler une erreur
     */
    checkFunCallParamNumber(call: FunCall, accept: ValidationAcceptor): void {
        if (
            call.fun.ref?.params &&
            call.fun.ref.name &&
            call.params
        ) {
            const ref = call.fun.ref
            const expected = ref.params.length
            const actual = call.params.length
            expected === actual ||
                accept(
                    'error',
                    `Function '${ref.name}' expects ${expected} parameter${
                        expected === 1 ? '' : 's'
                    }, but ${actual} ${actual === 1 ? 'was' : 'were'} given.`,
                    { node: call, property: 'params' }
                )
        }
    }

    /**
     * Permet de vérifier que la déclaration d'une variable est bien effectuée dans un bloc
     * @param varDecl Un noeud de déclaration de variable
     * @param accept Le callback permettant de signaler une erreur
     */
    checkVarDeclInsideBlock(
        varDecl: VarDecl,
        accept: ValidationAcceptor
    ): void {
        const container = varDecl.$container
        if (!isFunDef(container) && !isBlock(container)) {
            accept('error', 'Variable declaration must be inside a block.', {
                node: varDecl,
            })
        }
    }

    /**
     * Permet de vérifier qu'un appel de fonction n'est pas utilisé comme une expression si la fonction retourne 'void'
     * @param call Un noeud d'appel de fonction
     * @param accept Le callback permettant de signaler une erreur
     */
    checkFunCallExprNotVoid(
        call: FunCall,
        accept: ValidationAcceptor
    ): void {
        const restr = call as UsageRestrictedFunCall
        const container = call.$container
        if (isBlock(container) || (isIfStmt(container) || isWhileStmt(container)) && container.expr !== call) {
            restr.usage = 'stmt'
        } else{
            restr.usage = 'expr'
            const fun = call.fun.ref
            if (fun && fun.type?.name === 'void') {
                accept('error', "Function retuning 'void' cannot be used as an expression.", {
                    node: call,
                    property: 'fun',
                })
            }
        }
    }
}
