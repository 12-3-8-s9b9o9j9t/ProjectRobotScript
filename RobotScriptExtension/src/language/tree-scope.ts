import { Block, FunDef, VarDecl, isFunDef } from './generated/ast.js'

export type Symb = FunDef | VarDecl
export type Node = FunDef | Block
export enum SymbState { undeclared, undefined, defined, used }
export type Scope = Map<string, {symb: Symb, state: SymbState}>

export class TreeScope {
    private parent?: TreeScope
    private local: Scope = new Map()
    private children: Map<FunDef | Block, TreeScope> = new Map()
    
    private constructor() {}

    public static createRoot(): TreeScope {
        return new TreeScope()
    }

    public createChild(node: Node): TreeScope {
        const child = new TreeScope()
        child.parent = this
        this.children.set(node, child)
        return child
    }

    public getChild(node: Node): TreeScope | undefined {
        return this.children.get(node)
    }

    public addSymb(symb: Symb, isDef = false): boolean {
        const name = TreeScope.formatName(symb)
        if (this.local.has(name)) {
            return false
        }
        this.local.set(name, {symb, state: isDef ? SymbState.defined : SymbState.undefined})
        return true
    }

    public setState(symb: Symb, state: SymbState): SymbState {
        const name = TreeScope.formatName(symb)
        const value = this.local.get(name)
        if (value) {
            const prev = value.state
            this.local.set(name, {symb, state})
            if (prev === SymbState.undefined && state === SymbState.used) {
                return SymbState.undefined
            }
            return state
        }
        if (this.parent) {
            return this.parent.setState(symb, state)
        }
        return SymbState.undeclared
    }

    public getLocalUnused(): Symb[] {
        const unused: Symb[] = []
        this.local.forEach((value) => {
            if (value.state !== SymbState.used) {
                unused.push(value.symb)
            }
        })
        return unused
    }

    private static formatName(symb: Symb): string {
        if (isFunDef(symb)) {
            return 'f_' + symb.name
        } else {
            return 'v_' + symb.name
        }
    }
}
