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
    visitGroup(node: Group): any;
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

/**
 * Type auxiliaire à `Acceptor<T>`
 */
type ToAcceptor<T> =
    // T est un AstNode (laisse les types unions intacts, ex: Expression)
    [T] extends [AstNode] ? Acceptor<T>
    :T extends Reference<infer U> ? Reference<Acceptor<U>> 
    :T extends Array<infer U> ? Array<ToAcceptor<U>>
    :T;

/**
 * Type permettant d'ajouter la méthode accept à un type
 */
type Acceptor<T extends AstNode> = {
    [P in Exclude<keyof T, keyof AstNode>]
    // permet d'extraire undefined des propriétés optionnelles
    :undefined extends T[P] ? ToAcceptor<Exclude<T[P], undefined>> | undefined
    :ToAcceptor<T[P]>;
} & {
    [P in Extract<keyof T, keyof AstNode>]:T[P];
} & { accept: (visitor: RobotScriptVisitor) => any };

export type EntryPoint = Acceptor<AST.EntryPoint>;
export type FunDef = Acceptor<AST.FunDef>;
export type AnyType = Acceptor<AST.AnyType>;
export type VarDecl = Acceptor<AST.VarDecl>;
export type BinExpr = Acceptor<AST.BinExpr>;
export type UnExpr = Acceptor<AST.UnExpr>;
export type Lit = Acceptor<AST.Lit>;
export type Group = Acceptor<AST.Group>;
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