import { evalBin, evalUn } from "../language/robot-script-utils.js";
import { TreeScope } from "../language/tree-scope.js";
import { getBaseScene, Scene } from "../web/simulator/scene.js";
import { AnyType, AssignVar, BinExpr, Block, Distance, EntryPoint, FunCall, FunDef, GetSpeed, IfStmt, Linear, Lit, Ref, ReturnStmt, RobotScriptVisitor, Rotation, SetSpeed, Time, UnExpr, UnitCast, VarDecl, WhileStmt } from "./visitor.js";

export class Interpreter implements RobotScriptVisitor {
    private scene: Scene = getBaseScene();

    constructor(
        private scope: TreeScope
    ) {}

    visitEntryPoint(ep: EntryPoint): Scene {
        ep.funs.find(fun => fun.name === "main")?.accept(this);
        this.scope
        return this.scene;
    }

    visitFunDef(fun: FunDef): void {
        fun.body.accept(this);
    }

    visitAnyType(type: AnyType) {
        throw new Error("Method not implemented.");
    }

    visitVarDecl(decl: VarDecl) {
        throw new Error("Method not implemented.");
    }

    visitBinExpr(binex: BinExpr): number| boolean {
        const left = binex.expr1.accept(this);
        const right = binex.expr2.accept(this);
        return evalBin(binex.op, left, right);
    }

    visitUnExpr(unex: UnExpr): number | boolean {
        const expr = unex.expr.accept(this);
        return evalUn(unex.op, expr);
    }

    visitLit(lit: Lit): number | boolean {
        return lit.val;
    }

    visitRef(ref: Ref) {
        throw new Error("Method not implemented.");
    }

    visitGetSpeed(speed: GetSpeed): number {
        const factor = speed.unit?.accept(this) || 1;
        return this.scene.robot.speed / factor;
    }

    visitDistance(dist: Distance) {
        throw new Error("Method not implemented.");
    }

    visitTime(time: Time) {
        throw new Error("Method not implemented.");
    }

    visitFunCall(call: FunCall) {
        throw new Error("Method not implemented.");
    }

    visitBlock(block: Block): void {
        block.stmts.forEach(stmt => stmt.accept(this));
    }

    visitAssignVar(assign: AssignVar) {
        throw new Error("Method not implemented.");
    }

    visitSetSpeed(set: SetSpeed): void {
        const speed = set.expr.accept(this);
        const factor = set.unit?.accept(this) || 1;
        this.scene.robot.speed = speed * factor;
    }

    visitWhileStmt(stmt: WhileStmt) {
        while (stmt.expr.accept(this)) {
            stmt.stmt.accept(this);
        }
    }

    visitIfStmt(stmt: IfStmt) {
        if (stmt.expr.accept(this)) {
            stmt.stmt1.accept(this);
        } else if (stmt.stmt2) {
            stmt.stmt2.accept(this);
        }
    }

    visitReturnStmt(stmt: ReturnStmt) {
        throw new Error("Method not implemented.");
    }

    visitLinear(lin: Linear) {
        const dist = lin.expr.accept(this);
        const factor = lin.unit?.accept(this) || 1;
        switch (lin.dir) {
            case "Forward":
                this.scene.robot.move(dist * factor);
                break;
            case "Sideways":
                this.scene.robot.side(dist * factor);
                break;
            default:
                throw new Error("Unknown direction");
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
            default:
                throw new Error("Unknown unit");
        }
    }


}