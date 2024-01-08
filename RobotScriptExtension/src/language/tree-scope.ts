import { Block, FunDef, VarDecl, isFunDef } from './generated/ast.js'

export type Symb = FunDef | VarDecl
export type SymbType = Symb['$type']
export enum SymbState { undeclared, undefined, unused, used }
export type SymbData = {symb: Symb, state: SymbState}
export type ScopeNode = Block | FunDef
export type Scope = Map<string, SymbData>

export class TreeScope {
    private local: Scope = new Map()
    private children: Map<ScopeNode, TreeScope> = new Map()
    
    private constructor(
        private parent?: TreeScope
    ) {}

    public static createRoot(): TreeScope {
        return new TreeScope()
    }

    public createChild(node: ScopeNode): TreeScope {
        const child = new TreeScope(this)
        this.children.set(node, child)
        return child
    }

    public getAssociated(node: ScopeNode): TreeScope | undefined {
        const asso = this.children.get(node)
        if (!asso && isFunDef(node)) {
            return this.parent?.getAssociated(node)
        }
        return asso
    }

    public addSymb(symb: Symb, isDef = false): boolean {
        const name = `${symb.name}-${symb.$type}`
        if (this.local.has(name)) {
            return false
        }
        this.local.set(name, {
            symb,
            state: isDef ? SymbState.unused : SymbState.undefined
        })
        return true
    }

    public setUsed(symb: Symb): SymbState {
        const name = `${symb.name}-${symb.$type}`
        const value = this.local.get(name)
        if (value) {
            const prev = value.state
            const next = SymbState.used
            this.local.set(name, {...value, state: next})
            if (prev === SymbState.undefined) {
                return SymbState.undefined
            }
            return next
        }
        if (this.parent) {
            return this.parent.setUsed(symb)
        }
        return SymbState.undeclared
    }

    public getStatus(symb: Symb): SymbState {
        const name = `${symb.name}-${symb.$type}`
        const value = this.local.get(name)
        if (value) {
            return value.state
        }
        if (this.parent) {
            return this.parent.getStatus(symb)
        }
        return SymbState.undeclared
    }

    public findAllLocal(predicate: (v: SymbData) => boolean = () => true): Symb[] {
        const res: Symb[] = []
        this.local.forEach((value) => {
            if (predicate(value)) {
                res.push(value.symb)
            }
        })
        return res
    }

    public getLocalUnused(): Symb[] {
        return this.findAllLocal((v) => v.state === SymbState.unused)
    }

}
