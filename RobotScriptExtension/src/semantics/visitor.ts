import { CstNode, AstNode, Reference } from 'langium';
import * as AST from '../language/generated/ast.js';

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
    // visitSensor(node: Sensor): any;
    visitSetSpeed(node: SetSpeed): any;
    visitSpeed(node: Speed): any;
    // visitStatement(node: Statement): any;
    visitTime(node: Time): any;
    visitUnExpr(node: UnExpr): any;
    visitUnitCast(node: UnitCast): any;
    visitVarDecl(node: VarDecl): any;
    visitWhileStmt(node: WhileStmt): any;
}

export class AnyType implements AST.AnyType {
    constructor(public $type: 'AnyType') {
    }
    $container!: AST.FunDef | AST.VarDecl;
    name!: 'number' | 'bool' | 'void';
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    
}

export class AssignVar implements AST.AssignVar {
    constructor(public $type: 'AssignVar') {}
    $container!: AST.IfStmt | AST.Block | AST.WhileStmt;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    expr!: AST.Expression;
    ref!: Reference<AST.VarDecl>;
}

export class BinExpr implements AST.BinExpr {
    constructor(public $type: 'BinExpr') {}
    $container!: AST.AssignVar | AST.BinExpr | AST.FunCall | AST.IfStmt | AST.Linear | AST.ReturnStmt | AST.Rotation | AST.SetSpeed | AST.UnExpr | AST.VarDecl | AST.WhileStmt;
    expr1!: AST.Expression
    expr2!: AST.Expression
    op!: '!=' | '&&' | '*' | '+' | '-' | '/' | '<' | '<=' | '==' | '>' | '>=' | '||'
}

export class Block implements AST.Block {
    constructor(public $type: 'Block') {}
    $container!: AST.FunDef | AST.IfStmt | AST.Block | AST.WhileStmt;
    stmts!: AST.Statement[];
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    type!: 'Block';
}

export class Distance implements AST.Distance {
    constructor(public $type: 'Distance') {}
    val!: 'Distance';
    $container?: AstNode | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
}

export class EntryPoint implements AST.EntryPoint {
    constructor(public $type: 'EntryPoint') {}
    funs!: AST.FunDef[];
    $cstNode?: CstNode | undefined;
}

export class FunCall implements AST.FunCall {
    constructor(public $type: 'FunCall') {}
    $container!: AST.AssignVar | AST.BinExpr | AST.Block | AST.FunCall | AST.IfStmt | AST.Linear | AST.ReturnStmt | AST.Rotation | AST.SetSpeed | AST.UnExpr | AST.VarDecl | AST.WhileStmt;
    fun!: Reference<AST.FunDef>
    params!: Array<AST.Expression>
}

export class FunDef implements AST.FunDef {
    constructor(public $type: 'FunDef') {}
    $container!: AST.EntryPoint;
    body!: AST.Block;
    name!: string;
    params!: AST.VarDecl[];
    type!: AST.AnyType;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;  
}

export class GetSpeed implements AST.GetSpeed {
    constructor(public $type: 'GetSpeed') {}
    unit!: AST.Unit;
    $container?: AstNode | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
}

export class IfStmt implements AST.IfStmt {
    constructor(public $type: 'IfStmt') {}
    $container!: AST.Block | AST.IfStmt | AST.WhileStmt;
    expr!: AST.Expression;
    stmt1!: AST.Statement;
    stmt2?: AST.Statement | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
}

export class Linear implements AST.Linear {
    constructor(public $type: 'Linear') {}
    dir!: 'Forward' | 'Sideways';
    expr!: AST.Expression;
    $container?: AstNode | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
}

export class Lit implements AST.Lit {
    constructor(public $type: 'Lit') {}
    $container!: AST.AssignVar | AST.BinExpr | AST.FunCall | AST.IfStmt | AST.Linear | AST.ReturnStmt | AST.Rotation | AST.SetSpeed | AST.UnExpr | AST.VarDecl | AST.WhileStmt;
    val!: boolean | number;  
}

export class Ref implements AST.Ref {
    constructor(public $type: 'Ref') {}
    $container!: AST.AssignVar | AST.BinExpr | AST.FunCall | AST.IfStmt | AST.Linear | AST.ReturnStmt | AST.Rotation | AST.SetSpeed | AST.UnExpr | AST.VarDecl | AST.WhileStmt;
    val!: Reference<AST.VarDecl> 
}

export class ReturnStmt implements AST.ReturnStmt {
    constructor(public $type: 'ReturnStmt') {}
    $container!: AST.Block | AST.IfStmt | AST.WhileStmt;
    expr?: AST.Expression | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
}

export class Rotation implements AST.Rotation {
    constructor(public $type: 'Rotation') {}
    $container!: AST.Block | AST.IfStmt | AST.WhileStmt;
    expr!: AST.Expression;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
}

export class SetSpeed implements AST.SetSpeed {
    constructor(public $type: 'SetSpeed') {}
    expr!: AST.Expression;
    $container?: AstNode | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
}

export class Speed implements AST.Speed {
    constructor(public $type: 'Speed') {}
    val!: 'Speed';
    unit!: AST.Unit;
    $container?: AstNode | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    expr!: AST.Expression;
}

export class Time implements AST.Time {
    constructor(public $type: 'Time') {}
    $container!: AST.AssignVar | AST.BinExpr | AST.FunCall | AST.IfStmt | AST.Linear | AST.ReturnStmt | AST.Rotation |AST.SetSpeed | AST.UnExpr | AST.VarDecl | AST.WhileStmt;
    val!: 'Time'
}

export class UnExpr implements AST.UnExpr {
    constructor(public $type: 'UnExpr') {}
    $container!: AST.AssignVar | AST.BinExpr | AST.FunCall | AST.IfStmt | AST.Linear | AST.ReturnStmt | AST.Rotation | AST.SetSpeed | AST.UnExpr | AST.VarDecl | AST.WhileStmt;
    expr!: AST.Expression
    op!: '!' | '-'
}

export class UnitCast implements AST.UnitCast {
    constructor(public $type: 'UnitCast') {}
    unit!: AST.Unit;
    val!: 'Distance';
    $container?: AstNode | undefined;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
    dir!: 'Forward' | 'Sideways';
    expr!: AST.Expression;
}

export class VarDecl implements AST.VarDecl {
    constructor(public $type: 'VarDecl') {}
    $container!: AST.Block | AST.IfStmt | AST.WhileStmt | AST.FunDef;
    expr?: AST.Expression | undefined;
    name!: string;
    type!: AST.AnyType;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
}

export class WhileStmt implements AST.WhileStmt {
    constructor(public $type: 'WhileStmt') {}
    $container!: AST.Block | AST.IfStmt | AST.WhileStmt;
    expr!: AST.Expression;
    stmt!: AST.Statement;
    $containerProperty?: string | undefined;
    $containerIndex?: number | undefined;
    $cstNode?: CstNode | undefined;
}