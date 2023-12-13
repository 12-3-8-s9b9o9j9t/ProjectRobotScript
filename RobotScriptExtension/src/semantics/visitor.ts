import { CstNode, LangiumDocument, AstNode, Reference } from 'langium';
import * as ASTInterfaces from '../language/generated/ast.js'
import {isAssignVar, isSetSpeed } from '../language/generated/ast.js'

//import { Reference } from 'langium';

export interface RobotScriptVisitor {
    visitAnyType(node: AnyType): any;
    // visitAssign(node: Assign): any;
    visitAssignVar(node: AssignVar): any;
    visitBinExpr(node: BinExpr): any;
    visitBlock(node: Block): any;
    visitDistance(node: Distance): any;
    visitEntryPoint(node: EntryPoint): any;
    // visitExpression(node: Expression): any;
    visitFunCall(node: FunCall): any;
    visitFunDef(node: FunDef): any;
    visitGetSpeed(node: GetSpeed): any;
    visitIfStmt(node: IfStmt): any;
    visitLinear(node: Linear): any;
    visitLit(node: Lit): any;
    visitRef(node: Ref): any;
    visitReturnStmt(node: ReturnStmt): any;
    visitRotation(node: Rotation): any;
    visitSensor(node: Sensor): any;
    visitSetSpeed(node: SetSpeed): any;
    visitSpeed(node: Speed): any;
    visitStatement(node: Statement): any;
    visitTime(node: Time): any;
    visitUnExpr(node: UnExpr): any;
    visitUnitCast(node: UnitCast): any;
    visitVarDecl(node: VarDecl): any;
    visitWhileStmt(node: WhileStmt): any;
}


/** 
export class EntryPointVisitor implements ASTInterfaces.EntryPoint {
    // the constructor must take all attribute of the implemented interface
    constructor(public $type: 'EntryPoint') {}
    funs: ASTInterfaces.FunDef[] = []
    accept(visitor: RobotScriptVisitor): any {
        console.log('EntryPointVisitor')
        visitor.visitEntryPoint(this);
        this.funs.forEach(fun => fun.accept(visitor));
    }
}
*/

export class AnyType implements ASTInterfaces.AnyType {
    constructor(public $type: 'AnyType') {
    }
    $container!: ASTInterfaces.FunDef | ASTInterfaces.VarDecl;
    name!: 'number' | 'bool' | 'void';
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;

    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitAnyType(this);
    }
}


// AssignVar : Block | IfStmt | WhileStmt
export class AssignVar implements ASTInterfaces.AssignVar {
    constructor(public $type: 'AssignVar') {}
    $container!: ASTInterfaces.IfStmt | ASTInterfaces.Block | ASTInterfaces.WhileStmt;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    expr!: ASTInterfaces.Expression;
    ref!: Reference<ASTInterfaces.VarDecl>;

    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitAssignVar(this);
    }
}

// BinExpr : AssignVar | BinExpr | FunCall | IfStmt | Linear | ReturnStmt | Rotation | SetSpeed | UnExpr | VarDecl | WhileStmt
export class BinExpr implements ASTInterfaces.BinExpr {
    constructor(public $type: 'BinExpr') {}
    $container!: ASTInterfaces.AssignVar | ASTInterfaces.BinExpr | ASTInterfaces.FunCall | ASTInterfaces.IfStmt | ASTInterfaces.Linear | ASTInterfaces.ReturnStmt | ASTInterfaces.Rotation | ASTInterfaces.SetSpeed | ASTInterfaces.UnExpr | ASTInterfaces.VarDecl | ASTInterfaces.WhileStmt;
    expr1!: ASTInterfaces.Expression
    expr2!: ASTInterfaces.Expression
    op!: '!=' | '&&' | '*' | '+' | '-' | '/' | '<' | '<=' | '==' | '>' | '>=' | '||'

    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitBinExpr(this);
    }
}


// Block
export class Block implements ASTInterfaces.Block {
    constructor(public $type: 'Block') {}
    $container!: ASTInterfaces.FunDef | ASTInterfaces.IfStmt | ASTInterfaces.Block | ASTInterfaces.WhileStmt;
    stmts!: ASTInterfaces.Statement[];
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    type!: 'Block';
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitBlock(this);
    }
}

// Distance
export class Distance implements ASTInterfaces.Distance {
    constructor(public $type: 'Distance') {}
    val!: 'Distance';
    $container?: AstNode | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitDistance(this);
    }
}

// EntryPoint
export class EntryPoint implements ASTInterfaces.EntryPoint {
    constructor(public $type: 'EntryPoint') {}
    funs!: ASTInterfaces.FunDef[];
    $container?: AstNode | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitEntryPoint(this);
    }
}



// FunCall
export class FunCall implements ASTInterfaces.FunCall {
    constructor(public $type: 'FunCall') {}
    $container!: ASTInterfaces.AssignVar | ASTInterfaces.BinExpr | ASTInterfaces.Block | ASTInterfaces.FunCall | ASTInterfaces.IfStmt | ASTInterfaces.Linear | ASTInterfaces.ReturnStmt | ASTInterfaces.Rotation | ASTInterfaces.SetSpeed | ASTInterfaces.UnExpr | ASTInterfaces.VarDecl | ASTInterfaces.WhileStmt;
    fun!: Reference<ASTInterfaces.FunDef>
    params!: Array<ASTInterfaces.Expression>
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitFunCall(this);
    }
}


//FunDef
export class FunDef implements ASTInterfaces.FunDef {
    constructor(public $type: 'FunDef') {}
    $container!: ASTInterfaces.EntryPoint;
    body!: ASTInterfaces.Block;
    name!: string;
    params!: ASTInterfaces.VarDecl[];
    type!: ASTInterfaces.AnyType;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitFunDef(this);
    }
}

// GetSpeed
export class GetSpeed implements ASTInterfaces.GetSpeed {
    constructor(public $type: 'GetSpeed') {}
    unit!: ASTInterfaces.Unit;
    $container?: AstNode | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitGetSpeed(this);
    }
}

// IfStmt
export class IfStmt implements ASTInterfaces.IfStmt {
    constructor(public $type: 'IfStmt') {}
    $container!: ASTInterfaces.Block | ASTInterfaces.IfStmt | ASTInterfaces.WhileStmt;
    expr!: ASTInterfaces.Expression;
    stmt1!: ASTInterfaces.Statement;
    stmt2?: ASTInterfaces.Statement | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitIfStmt(this);
    }
}

// Linear
export class Linear implements ASTInterfaces.Linear {
    constructor(public $type: 'Linear') {}
    dir!: 'Forward' | 'Sideways';
    expr!: ASTInterfaces.Expression;
    $container?: AstNode | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitLinear(this);
    }
}


// Lit
export class Lit implements ASTInterfaces.Lit {
    constructor(public $type: 'Lit') {}
    $container?: AssignVar | BinExpr | FunCall | IfStmt | Linear | ReturnStmt | Rotation | SetSpeed | UnExpr | VarDecl | WhileStmt;
    $type: 'Lit';
    val!: boolean | number
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitLit(this);
    }
}


// Ref
export class Ref implements ASTInterfaces.Ref {
    constructor(public $type: 'Ref') {}
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitRef(this);
    }
}


// ReturnStmt
export class ReturnStmt implements ASTInterfaces.ReturnStmt {
    constructor(public $type: 'ReturnStmt') {}
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitReturnStmt(this);
    }
}



// Rotation
export class Rotation implements ASTInterfaces.Rotation {
    constructor(public $type: 'Rotation') {}
    $container!: ASTInterfaces.Block | ASTInterfaces.IfStmt | ASTInterfaces.WhileStmt;
    expr!: ASTInterfaces.Expression;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitRotation(this);
    }
}




// SetSpeed
export class SetSpeed implements ASTInterfaces.SetSpeed {
    constructor(public $type: 'SetSpeed') {}
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitSetSpeed(this);
    }
}


// Speed
export class Speed implements ASTInterfaces.Speed {
    constructor(public $type: 'Speed') {}
    val!: 'Speed';
    unit!: ASTInterfaces.Unit;
    $container?: AstNode | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    expr!: ASTInterfaces.Expression;
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitSpeed(this);
    }
}


// Time
export class Time implements ASTInterfaces.Time {
    constructor(public $type: 'Time') {}
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitTime(this);
    }
}

// UnExpr
export class UnExpr implements ASTInterfaces.UnExpr {
    constructor(public $type: 'UnExpr') {}
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitUnExpr(this);
    }
}

// UnitCast
export class UnitCast implements ASTInterfaces.UnitCast {
    constructor(public $type: 'UnitCast') {}
    unit!: ASTInterfaces.Unit;
    val!: 'Distance';
    $container?: AstNode | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    dir!: 'Forward' | 'Sideways';
    expr!: ASTInterfaces.Expression;
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitUnitCast(this);
    }
}

// VarDecl
export class VarDecl implements ASTInterfaces.VarDecl {
    constructor(public $type: 'VarDecl') {}
    $container!: ASTInterfaces.Block | ASTInterfaces.IfStmt | ASTInterfaces.WhileStmt | ASTInterfaces.FunDef;
    expr?: ASTInterfaces.Expression | undefined;
    name!: string;
    type!: ASTInterfaces.AnyType;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitVarDecl(this);
    }
}


// WhileStmt
export class WhileStmt implements ASTInterfaces.WhileStmt {
    constructor(public $type: 'WhileStmt') {}
    $container!: ASTInterfaces.Block | ASTInterfaces.IfStmt | ASTInterfaces.WhileStmt;
    expr!: ASTInterfaces.Expression;
    stmt!: ASTInterfaces.Statement;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    $document?: LangiumDocument<AstNode> | undefined;
    accept(visitor: RobotScriptVisitor): any {
        return visitor.visitWhileStmt(this);
    }
}


