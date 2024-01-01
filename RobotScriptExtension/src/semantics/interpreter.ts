import { BaseScene } from "../web/simulator/scene.js";
import { AssignVar, BinExpr, Block, DataType, Distance, EntryPoint, FunCall, FunDef, GetSpeed, IfStmt, Linear, Lit, Ref, ReturnStmt, RobotScriptVisitor, Rotation, SetSpeed, SimpleVarDecl, Time, UnExpr, UnitCast, VarDeclInit, VoidType, WhileStmt } from "./visitor.js";

export class Interpreter implements RobotScriptVisitor {
    visitEntryPoint(node: EntryPoint) {
        return new BaseScene();
    }
    visitFunDef(node: FunDef) {
        throw new Error("Method not implemented.");
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
    visitLit(node: Lit) {
        throw new Error("Method not implemented.");
    }
    visitRef(node: Ref) {
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
    visitBlock(node: Block) {
        throw new Error("Method not implemented.");
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
    visitLinear(node: Linear) {
        throw new Error("Method not implemented.");
    }
    visitRotation(node: Rotation) {
        throw new Error("Method not implemented.");
    }
    visitUnitCast(node: UnitCast) {
        throw new Error("Method not implemented.");
    }
    
    
}