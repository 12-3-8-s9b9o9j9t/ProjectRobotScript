import { CstNode, AstNode, Reference, LangiumDocument } from 'langium';
import * as AST from '../language/generated/ast.js';

export interface RobotScriptVisitor {
    visitEntryPoint(node: EntryPoint): any;
    visitFunDef(node: FunDef): any;
    // visitAnyType(node: AnyType): any;
    visitVoidType(node: VoidType): any;
    visitDataType(node: DataType): any;
    // visitVarDecl(node: VarDecl): any;
    visitSimpleVarDecl(node: SimpleVarDecl): any;
    visitVarDeclInit(node: VarDeclInit): any;
    // visitExpression(node: Expression): any;
    visitBinExpr(node: BinExpr): any;
    visitUnExpr(node: UnExpr): any;
    // visitPrimExpr(node: PrimExpr): any;
    visitLit(node: Lit): any;
    visitRef(node: Ref): any;
    visitGetSpeed(node: GetSpeed): any;
    // visitSensor(node: Sensor): any;
    visitDistance(node: Distance): any;
    visitTime(node: Time): any;
    visitFunCall(node: FunCall): any;
    // visitStatement(node: Statement): any;
    visitBlock(node: Block): any;
    // visitAssign(node: Assign): any;
    visitAssignVar(node: AssignVar): any;
    visitSetSpeed(node: SetSpeed): any;
    visitWhileStmt(node: WhileStmt): any;
    visitIfStmt(node: IfStmt): any;
    visitReturnStmt(node: ReturnStmt): any;
    // visitMovement(node: Movement): any;
    visitLinear(node: Linear): any;
    visitRotation(node: Rotation): any;
    visitUnitCast(node: UnitCast): any;
}

export class EntryPoint implements AST.EntryPoint {
    constructor(public $type: 'EntryPoint') {}
    funs!: FunDef[];
    $cstNode?: CstNode;
    $document?: LangiumDocument<AstNode> | undefined;
    accept(visitor: RobotScriptVisitor): any {};
}

export class FunDef implements AST.FunDef {
    constructor(public $type: 'FunDef') {}
    $container!: AST.EntryPoint;
    $containerProperty?: string;
    $containerIndex?: number;
    $cstNode?: CstNode; 
    body!: Block;
    name!: string;
    params!: SimpleVarDecl[];
    type!: AnyType;
    accept(visitor: RobotScriptVisitor): any {};
}

export abstract class AnyType implements AST.AnyType {
    constructor(public $type: 'VoidType' | 'DataType') {
    }
    $container!: AST.FunDef | AST.VarDecl;
    $containerProperty?: string;
    $containerIndex?: number;
    $cstNode?: CstNode;
    name!: 'number' | 'bool' | 'void';
    accept(visitor: RobotScriptVisitor): any {
        throw new Error("Method not implemented.");
    };
}

export class VoidType extends AnyType implements AST.VoidType {
    constructor(override $type: 'VoidType') {
        super($type)
    }
    override $container!: AST.FunDef;
    override name!: 'void';
    override accept(visitor: RobotScriptVisitor): any {};
}

export class DataType extends AnyType implements AST.DataType {
    constructor(override $type: 'DataType') {
        super($type)
    }
    // $container needs to be commented in language/generated/ast.ts
    override name!: 'number' | 'bool';
    override accept(visitor: RobotScriptVisitor): any {};
}

export abstract class VarDecl implements AST.VarDecl {
    constructor(public $type: 'SimpleVarDecl' | 'VarDeclInit') {}
    $container!: AST.Block | AST.FunDef;
    $containerProperty?: string;
    $containerIndex?: number;
    $cstNode?: CstNode;
    name!: string;
    type!: DataType;
    accept(visitor: RobotScriptVisitor): any {
        throw new Error("Method not implemented.");
    };
}

export class SimpleVarDecl extends VarDecl implements AST.SimpleVarDecl {
    constructor(override $type: 'SimpleVarDecl') {
        super($type)
    }
    // $container needs to be commented in language/generated/ast.ts
    override accept(visitor: RobotScriptVisitor): any {};
}

export class VarDeclInit extends VarDecl implements AST.VarDeclInit {
    constructor(override $type: 'VarDeclInit') {
        super($type)
    }
    override $container!: AST.Block;
    expr!: Expression;
    override accept(visitor: RobotScriptVisitor): any {};
}

export abstract class Expression implements AST.Expression {
    constructor(public $type: 'BinExpr' | 'UnExpr' | 'FunCall' | 'Lit' | 'Ref' | 'GetSpeed' | 'Time' | 'Distance') {}
    $container!: AST.VarDeclInit | AST.BinExpr | AST.UnExpr |AST.FunCall | AST.AssignVar |AST.SetSpeed |AST.WhileStmt | AST.IfStmt |AST.ReturnStmt | AST.Linear | AST.Rotation;
    $containerProperty?: string;
    $containerIndex?: number;
    $cstNode?: CstNode;
    accept(visitor: RobotScriptVisitor): any {
        throw new Error("Method not implemented.");
    };
}

export class BinExpr extends Expression implements AST.BinExpr {
    constructor(override $type: 'BinExpr') {
        super($type);
    }
    expr1!: Expression
    expr2!: Expression
    op!: '!=' | '&&' | '*' | '+' | '-' | '/' | '<' | '<=' | '==' | '>' | '>=' | '||'
    override accept(visitor: RobotScriptVisitor): any {};
}

export class UnExpr extends Expression implements AST.UnExpr {
    constructor(override $type: 'UnExpr') {
        super($type);
    }
    expr!: Expression
    op!: '!' | '-'
    override accept(visitor: RobotScriptVisitor): any {};
}

export abstract class PrimExpr extends Expression implements AST.PrimExpr {
    constructor(override $type: 'FunCall' | 'Lit' | 'Ref' | 'GetSpeed' | 'Time' | 'Distance') {
        super($type);
    }
    override accept(visitor: RobotScriptVisitor): any {
        throw new Error("Method not implemented.");
    };
}

export class Lit extends PrimExpr implements AST.Lit {
    constructor(override $type: 'Lit') {
        super($type);
    }
    val!: boolean | number; 
    override accept(visitor: RobotScriptVisitor): any {};
}

export class Ref extends PrimExpr implements AST.Ref {
    constructor(override $type: 'Ref') {
        super($type);
    }
    val!: Reference<VarDecl>
    override accept(visitor: RobotScriptVisitor): any {};
}

export class GetSpeed extends PrimExpr implements AST.GetSpeed {
    constructor(override $type: 'GetSpeed') {
        super($type);
    }
    unit?: UnitCast;
    override accept(visitor: RobotScriptVisitor): any {};
}

export abstract class Sensor extends PrimExpr implements AST.Sensor {
    constructor(override $type: 'Distance' | 'Time') {
        super($type);
    }
    override accept(visitor: RobotScriptVisitor): any {
        throw new Error("Method not implemented.");
    };
}

export class Distance extends Sensor implements AST.Distance {
    constructor(override $type: 'Distance') {
        super($type);
    }
    override accept(visitor: RobotScriptVisitor): any {};
}

export class Time extends Sensor implements AST.Time {
    constructor(override $type: 'Time') {
        super($type);
    }
    override accept(visitor: RobotScriptVisitor): any {};
}

export class FunCall implements AST.FunCall {
    constructor(public $type: 'FunCall') {}
    $container!: AST.VarDeclInit | AST.BinExpr | AST.UnExpr |AST.FunCall | AST.AssignVar |AST.SetSpeed |AST.WhileStmt | AST.IfStmt |AST.ReturnStmt | AST.Linear | AST.Rotation | AST.Block | AST.IfStmt | AST.WhileStmt;
    $containerProperty?: string;
    $containerIndex?: number;
    fun!: Reference<FunDef>
    params!: Array<Expression>
    accept(visitor: RobotScriptVisitor): any {};
}

export abstract class Statement implements AST.Statement {
    constructor(public $type: 'Block' | 'AssignVar' | 'SetSpeed' | 'WhileStmt' | 'IfStmt' | 'ReturnStmt' | 'Linear' | 'Rotation') {}
    $container!: AST.Block | AST.WhileStmt | AST.IfStmt;
    $containerProperty?: string;
    $containerIndex?: number;
    $cstNode?: CstNode;
    accept(visitor: RobotScriptVisitor): any {
        throw new Error("Method not implemented.");
    };
}

export class Block extends Statement implements AST.Block {
    constructor(override $type: 'Block') {
        super($type);
    }
    // $container needs to be commented in language/generated/ast.ts
    stmts!: Statement[];
    override accept(visitor: RobotScriptVisitor): any {};
}

export abstract class Assign extends Statement implements AST.Assign {
    constructor(override $type: 'AssignVar' | 'SetSpeed') {
        super($type);
    }
    expr!: Expression
    override accept(visitor: RobotScriptVisitor): any {
        throw new Error("Method not implemented.");
    };
}

export class AssignVar extends Assign implements AST.AssignVar {
    constructor(override $type: 'AssignVar') {
        super($type);
    }
    ref!: Reference<VarDecl>;
    override accept(visitor: RobotScriptVisitor): any {};
}

export class SetSpeed extends Assign implements AST.SetSpeed {
    constructor(override $type: 'SetSpeed') {
        super($type);
    }
    unit?: UnitCast;
    override accept(visitor: RobotScriptVisitor): any {};
}

export class WhileStmt extends Statement implements AST.WhileStmt {
    constructor(override $type: 'WhileStmt') {
        super($type);
    }
    expr!: AST.Expression;
    stmt!: AST.Statement;
    override accept(visitor: RobotScriptVisitor): any {};
}

export class IfStmt extends Statement implements AST.IfStmt {
    constructor(override $type: 'IfStmt') {
        super($type);
    }
    expr!: Expression;
    stmt1!: Statement;
    stmt2?: Statement;
    override accept(visitor: RobotScriptVisitor): any {};
}

export class ReturnStmt extends Statement implements AST.ReturnStmt {
    constructor(override $type: 'ReturnStmt') {
        super($type);
    }
    expr?: Expression;
    override accept(visitor: RobotScriptVisitor): any {};
}

export abstract class Movement extends Statement implements AST.Movement {
    constructor(override $type: 'Linear' | 'Rotation') {
        super($type);
    }
    expr!: Expression;
    override accept(visitor: RobotScriptVisitor): any {
        throw new Error("Method not implemented.");
    };
}

export class Linear extends Movement implements AST.Linear {
    constructor(override $type: 'Linear') {
        super($type);
    }
    dir!: 'Forward' | 'Sideways';
    override accept(visitor: RobotScriptVisitor): any {};
}

export class Rotation extends Movement implements AST.Rotation {
    constructor(override $type: 'Rotation') {
        super($type);
    }
    override accept(visitor: RobotScriptVisitor): any {};
}

export class UnitCast implements AST.UnitCast {
    constructor(public $type: 'UnitCast') {}
    $container!: AST.Distance | AST.GetSpeed | AST.Linear | AST.SetSpeed;
    $containerProperty?: string;
    $containerIndex?: number;
    $cstNode?: CstNode;
    unit!: 'mm' | 'cm' | 'dm' | 'm';
    accept(visitor: RobotScriptVisitor): any {};
}
