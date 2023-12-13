import * as ASTInterfaces from '../language/generated/ast.js';
import { Reference } from 'langium';

export interface RobotScriptVisitor{
    // TODO : create one visit method for each concept of the language
    visitConcept(node : Concept) : any;
}

// TODO : create one concrete class for each concept
export class Concept implements ASTInterfaces.Concept {
    // the constructor must take all attribute of the implemented interface 
    constructor(public $type: 'Type'){}
    accept (visitor: RobotScriptVisitor) : any {}
}