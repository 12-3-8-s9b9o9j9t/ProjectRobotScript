import { AstNode, Reference } from 'langium';
import * as AST from '../language/generated/ast.js';

export interface RobotScriptVisitor {
    visitEntryPoint(node: EntryPoint): any;
    visitFunDef(node: FunDef): any;
    visitAnyType(node: AnyType): any;
    visitVarDecl(node: VarDecl): any;
    visitBinExpr(node: BinExpr): any;
    visitUnExpr(node: UnExpr): any;
    visitLit(node: Lit): any;
    visitRef(node: Ref): any;
    visitGetSpeed(node: GetSpeed): any;
    visitDistance(node: Distance): any;
    visitTime(node: Time): any;
    visitFunCall(node: FunCall): any;
    visitBlock(node: Block): any;
    visitAssignVar(node: AssignVar): any;
    visitSetSpeed(node: SetSpeed): any;
    visitWhileStmt(node: WhileStmt): any;
    visitIfStmt(node: IfStmt): any;
    visitReturnStmt(node: ReturnStmt): any;
    visitLinear(node: Linear): any;
    visitRotation(node: Rotation): any;
    visitUnitCast(node: UnitCast): any;
}

type Acceptor<T> = {
    [P in Exclude<keyof T, keyof AstNode>]
    :T[P] extends AstNode ? Acceptor<T[P]>
    :undefined extends T[P] ? Acceptor<Exclude<T[P], undefined>> | undefined
    :T[P] extends Array<infer U extends AstNode> ? Array<Acceptor<U>>
    :T[P] extends Reference<infer U extends AstNode> ? Reference<Acceptor<U>>
    :T[P]
} & {
    [K in Extract<keyof T, keyof AstNode>]: T[K];
} & { accept: (visitor: RobotScriptVisitor) => any };

export type EntryPoint = Acceptor<AST.EntryPoint>;
export type FunDef = Acceptor<AST.FunDef>;
export type AnyType = Acceptor<AST.AnyType>;
export type VarDecl = Acceptor<AST.VarDecl>;
export type BinExpr = Acceptor<AST.BinExpr>;
export type UnExpr = Acceptor<AST.UnExpr>;
export type Lit = Acceptor<AST.Lit>;
export type Ref = Acceptor<AST.Ref>;
export type GetSpeed = Acceptor<AST.GetSpeed>;
export type Distance = Acceptor<AST.Distance>;
export type Time = Acceptor<AST.Time>;
export type FunCall = Acceptor<AST.FunCall>;
export type Block = Acceptor<AST.Block>;
export type AssignVar = Acceptor<AST.AssignVar>;
export type SetSpeed = Acceptor<AST.SetSpeed>;
export type WhileStmt = Acceptor<AST.WhileStmt>;
export type IfStmt = Acceptor<AST.IfStmt>;
export type ReturnStmt = Acceptor<AST.ReturnStmt>;
export type Linear = Acceptor<AST.Linear>;
export type Rotation = Acceptor<AST.Rotation>;
export type UnitCast = Acceptor<AST.UnitCast>;
