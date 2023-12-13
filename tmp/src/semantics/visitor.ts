import * as ASTInterfaces from '../language/generated/ast.js'
//import { Reference } from 'langium';

export interface RoboScriptVisitor {
    // TODO : create one visit method for each concept of the language
    visitEntryPoint(node: EntryPointVisitor): any
}

// TODO : create one concrete class for each concept
export class EntryPointVisitor implements ASTInterfaces.EntryPoint {
    // the constructor must take all attribute of the implemented interface
    constructor(public $type: 'EntryPoint') {}
    funs: ASTInterfaces.FunDef[] = []
    accept(visitor: RoboScriptVisitor): any {
        console.log('EntryPointVisitor')
    }
}
