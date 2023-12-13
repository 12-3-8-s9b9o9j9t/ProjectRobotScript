import { Assign, Expression, Sensor, Statement } from "../language/generated/ast.js";
import { AnyType, AssignVar, BinExpr, Block, Distance, EntryPoint, FunCall, FunDef, GetSpeed, IfStmt, Linear, Lit, Ref, ReturnStmt, RobotScriptVisitor, Rotation, SetSpeed, Speed, Time, UnExpr, UnitCast, VarDecl, WhileStmt } from "./visitor.js";


export class Compiler implements RobotScriptVisitor{
    visitAnyType(node: AnyType) {
        throw new Error('Method not implemented.');
    }
    visitAssign(node: Assign) {
        throw new Error('Method not implemented.');
    }
    visitAssignVar(node: AssignVar) {
        throw new Error('Method not implemented.');
    }
    visitBinExpr(node: BinExpr) {
        throw new Error('Method not implemented.');
    }
    visitBlock(node: Block) {
        throw new Error('Method not implemented.');
    }
    visitDistance(node: Distance) {
        throw new Error('Method not implemented.');
    }
    visitEntryPoint(node: EntryPoint) {
        throw new Error('Method not implemented.');
    }
    visitExpression(node: Expression) {
        throw new Error('Method not implemented.');
    }
    visitFunCall(node: FunCall) {
        throw new Error('Method not implemented.');
    }
    visitFunDef(node: FunDef) {
        throw new Error('Method not implemented.');
    }
    visitGetSpeed(node: GetSpeed) {
        throw new Error('Method not implemented.');
    }
    visitIfStmt(node: IfStmt) {
        throw new Error('Method not implemented.');
    }
    visitLinear(node: Linear) {
        throw new Error('Method not implemented.');
    }
    visitLit(node: Lit) {
        throw new Error('Method not implemented.');
    }
    visitRef(node: Ref) {
        throw new Error('Method not implemented.');
    }
    visitReturnStmt(node: ReturnStmt) {
        throw new Error('Method not implemented.');
    }
    visitRotation(node: Rotation) {
        throw new Error('Method not implemented.');
    }
    visitSensor(node: Sensor) {
        throw new Error('Method not implemented.');
    }
    visitSetSpeed(node: SetSpeed) {
        throw new Error('Method not implemented.');
    }
    visitSpeed(node: Speed) {
        throw new Error('Method not implemented.');
    }
    visitStatement(node: Statement) {
        throw new Error('Method not implemented.');
    }
    visitTime(node: Time) {
        throw new Error('Method not implemented.');
    }
    visitUnExpr(node: UnExpr) {
        throw new Error('Method not implemented.');
    }
    visitUnitCast(node: UnitCast) {
        throw new Error('Method not implemented.');
    }
    visitVarDecl(node: VarDecl) {
        throw new Error('Method not implemented.');
    }
    visitWhileStmt(node: WhileStmt) {
        throw new Error('Method not implemented.');
    }

}