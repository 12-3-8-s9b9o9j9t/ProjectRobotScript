import { TreeScope } from "../language/tree-scope.js";
import { BaseScene, Scene } from "../web/simulator/scene.js";
import { AssignVar, BinExpr, Block, DataType, Distance, EntryPoint, FunCall, FunDef, GetSpeed, IfStmt, Linear, Lit, Ref, ReturnStmt, RobotScriptVisitor, Rotation, SetSpeed, SimpleVarDecl, Time, UnExpr, UnitCast, VarDeclInit, VoidType, WhileStmt } from "./visitor.js";

export class Interpreter implements RobotScriptVisitor {
    private scene: Scene = new BaseScene();
    //private time: number = 0;
    //private speed: number = 0;

    constructor(
        private scope: TreeScope
    ) {}
    
    
    visitEntryPoint(ep: EntryPoint) {
        ep.funs.find((fun) => fun.name === 'main')?.accept(this);
        this.scope.getLocalUnused()
        return this.scene;
    }

    visitFunDef(fun: FunDef) {
        fun.body.accept(this);
    }

    visitVoidType(node: VoidType) {
        throw new Error("Method not implemented.");
    }

    visitDataType(node: DataType) {
        throw new Error("Method not implemented.");
    }

    visitSimpleVarDecl(node: SimpleVarDecl) {
        throw new Error("Method not implemented.");
    }
    visitVarDeclInit(node: VarDeclInit) {
        throw new Error("Method not implemented.");
    }
    visitBinExpr(node: BinExpr) {
        throw new Error("Method not implemented.");
    }
    visitUnExpr(node: UnExpr) {
        throw new Error("Method not implemented.");
    }
    visitLit(lit: Lit): boolean | number {
        return lit.val;
    }
    visitRef(node: Ref): boolean | number {
        throw new Error("Method not implemented.");
    }
    visitGetSpeed(node: GetSpeed) {
        throw new Error("Method not implemented.");
    }
    visitDistance(node: Distance) {
        throw new Error("Method not implemented.");
    }
    visitTime(node: Time) {
        throw new Error("Method not implemented.");
    }
    visitFunCall(node: FunCall) {
        throw new Error("Method not implemented.");
    }

    visitBlock(block: Block) {
        block.stmts.forEach((stmt) => stmt.accept(this));
    }

    visitAssignVar(node: AssignVar) {
        throw new Error("Method not implemented.");
    }
    visitSetSpeed(node: SetSpeed) {
        throw new Error("Method not implemented.");
    }
    visitWhileStmt(node: WhileStmt) {
        throw new Error("Method not implemented.");
    }
    visitIfStmt(node: IfStmt) {
        throw new Error("Method not implemented.");
    }
    visitReturnStmt(node: ReturnStmt) {
        throw new Error("Method not implemented.");
    }

    visitLinear(lin: Linear) {
        const dist = lin.expr.accept(this);
        const scale = lin.unit?.accept(this) as number || 1;
        switch (lin.dir) {
            case "Forward":
                this.scene.robot.move(dist*scale);
                break;
            case "Sideways":
                this.scene.robot.side(dist*scale);
                break;
        }    
    }

    visitRotation(rot: Rotation) {
        const angle = rot.expr.accept(this);
        this.scene.robot.turn(angle);
    }

    visitUnitCast(cast: UnitCast): number {
        switch (cast.unit) {
            case "m":
                return 1000;
            case "dm":
                return 100;
            case "cm":
                return 10;
            case "mm":
                return 1;
        }
    }
    
    
}