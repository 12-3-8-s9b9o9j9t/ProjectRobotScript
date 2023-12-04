import { VarDecl } from "./generated/ast.js";


export type Scope = Map<string, {varDecl : VarDecl, isUsed: boolean}>

export class TreeScope {
    constructor (
        public parent?: TreeScope,
        public scope: Scope = new Map())
    {}

    public has(name: string): boolean {
        return this.scope.has(name) || (this.parent !== undefined && this.parent.has(name))
    }

    public set(name: string, data: {varDecl: VarDecl, isUsed: boolean} ): void {
        this.scope.set(name, data)
    }

    public get(name: string): {varDecl: VarDecl, isUsed: boolean} | undefined {
        return this.scope.get(name) || (this.parent && this.parent.get(name))
    }

}
