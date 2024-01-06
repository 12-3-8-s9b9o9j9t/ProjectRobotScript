import { Block, FunDef, VarDecl, isFunDef } from './generated/ast.js'

export type Symb = FunDef | VarDecl
export type SymbType = Symb['$type']
export enum SymbState { undeclared, undefined, unused, used, precomputed }
export type SymbData = {symb: Symb, state: SymbState, pcval?: number|boolean}
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

    public addSymb(symb: Symb, isDef = false, pcval = undefined): boolean {
        const name = `${symb.name}-${symb.$type}`
        if (this.local.has(name)) {
            return false
        }
        this.local.set(name, {
            symb,
            state: isDef ? SymbState.unused : SymbState.undefined,
            pcval
        })
        return true
    }

    public setUsed(symb: Symb): SymbState {
        const name = `${symb.name}-${symb.$type}`
        const value = this.local.get(name)
        if (value) {
            const prev = value.state
            const next = value.pcval === undefined ? SymbState.used : SymbState.precomputed
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

    public setPcval(symb: Symb, pcval: number|boolean|undefined): void {
        const name = `${symb.name}-${symb.$type}`
        const value = this.local.get(name)
        if (value) {
            const prev = value.state
            const next = prev === SymbState.undefined || prev === SymbState.unused
                ? SymbState.unused
                : pcval === undefined ? SymbState.used : SymbState.precomputed
            this.local.set(name, {...value, state: next, pcval})
        }
        if (this.parent) {
            return this.parent.setPcval(symb, pcval)
        }
        throw new Error(`Symb ${symb.name} not found trying to set pcval`)
    }

    public getPcval(symb: Symb): number|boolean|undefined {
        const name = `${symb.name}-${symb.$type}`
        const value = this.local.get(name)
        if (value) {
            return value.pcval
        }
        if (this.parent) {
            return this.parent.getPcval(symb)
        }
        throw new Error(`Symb ${symb.name} not found trying to get pcval`)
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
/*
    public isUsed(symb: Symb): boolean {
        const name = TreeScope.formatName(symb)
        const value = this.local.get(name)
        if (value) {
            return value.state === SymbState.used
        }
        if (this.parent) {
            return this.parent.isUsed(symb)
        }
        throw new Error(`Symb ${name} not found trying to check if it is used`)
    }*/
}
