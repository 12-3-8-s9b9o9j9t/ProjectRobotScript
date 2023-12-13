import { VarDecl } from './generated/ast.js'

export type Scope = Map<string, { varDecl: VarDecl; isUsed: boolean }>

export class TreeScope {
    constructor(
        private parent?: TreeScope,
        private local: Scope = new Map()
    ) {}

    public addDecl(varDecl: VarDecl): boolean {
        const name = varDecl.name
        if (this.local.has(name)) {
            return false
        }
        this.local.set(name, { varDecl, isUsed: false })
        return true
    }

    public addUse(name: string): boolean {
        if (this.local.has(name)) {
            this.local.get(name)!.isUsed = true
            return true
        }
        if (this.parent) {
            return this.parent.addUse(name)
        }
        return false
    }

    public getLocalUnused(): VarDecl[] {
        const unused: VarDecl[] = []
        this.local.forEach((value) => {
            if (!value.isUsed) {
                unused.push(value.varDecl)
            }
        })
        return unused
    }
}
