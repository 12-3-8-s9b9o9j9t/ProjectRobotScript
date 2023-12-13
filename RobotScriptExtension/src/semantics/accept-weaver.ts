import type { ValidationAcceptor, ValidationChecks } from 'langium';
import type { RobotScriptAstType } from '../language/generated/ast.js';
import * as InterfaceAST from '../language/generated/ast.js';
import * as ClassAST from './visitor.js';
import { RobotScriptVisitor } from './visitor.js';
import type { RobotScriptServices } from '../language/robot-script-module.js';

/**
 * Register custom validation checks.
 * TODO : Call this function in the language module.ts file (see registerValidationChecks(...);)
 */
export function weaveAcceptMethods(services: RobotScriptServices) {
    const registry = services.validation.ValidationRegistry;
    const weaver = services.validation.RobotScriptAcceptWeaver
    const checks: ValidationChecks<RobotScriptAstType> = {
        AnyType : weaver.weaveAnyType,
        AssignVar : weaver.weaveAssignVar,
        BinExpr : weaver.weaveBinExpr,
        Block : weaver.weaveBlock,
        Distance : weaver.weaveDistance,
        EntryPoint : weaver.weaveEntryPoint,
        FunCall : weaver.weaveFunCall,
        FunDef : weaver.weaveFunDef,
        GetSpeed : weaver.weaveGetSpeed,
        IfStmt : weaver.weaveIfStmt,
        Linear : weaver.weaveLinear,
        Lit : weaver.weaveLit,
        Ref : weaver.weaveRef,
        ReturnStmt : weaver.weaveReturnStmt,
        Rotation : weaver.weaveRotation,
        SetSpeed : weaver.weaveSetSpeed,
        Time : weaver.weaveTime,
        UnExpr : weaver.weaveUnExpr,
        VarDecl : weaver.weaveVarDecl,
        WhileStmt : weaver.weaveWhileStmt,
        UnitCast : weaver.weaveUnitCast,
        Speed : weaver.weaveSpeed,
    }
    registry.register(checks, weaver);
}

/**
 * TODO :
 * You must implement a weaving function for each concrete concept of the language.
 * you will also need to fill the check data structure to map the weaving function to the Type of node
 */
export class RobotScriptAcceptWeaver {
    weaveAnyType(node : InterfaceAST.AnyType, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitAnyType(node as unknown as ClassAST.AnyType);}
    }

    weaveAssignVar(node : InterfaceAST.AssignVar, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitAssignVar(node as unknown as ClassAST.AssignVar);}
    }

    weaveBinExpr(node : InterfaceAST.BinExpr, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitBinExpr(node as unknown as ClassAST.BinExpr);}
    }

    weaveBlock(node : InterfaceAST.Block, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitBlock(node as unknown as ClassAST.Block);}
    }

    weaveDistance(node : InterfaceAST.Distance, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitDistance(node as unknown as ClassAST.Distance);}
    }

    weaveEntryPoint(node : InterfaceAST.EntryPoint, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitEntryPoint(node as unknown as ClassAST.EntryPoint);}
    }

    weaveFunCall(node : InterfaceAST.FunCall, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitFunCall(node as unknown as ClassAST.FunCall);}
    }

    weaveFunDef(node : InterfaceAST.FunDef, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitFunDef(node as unknown as ClassAST.FunDef);}
    }

    weaveGetSpeed(node : InterfaceAST.GetSpeed, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitGetSpeed(node as unknown as ClassAST.GetSpeed);}
    }

    weaveIfStmt(node : InterfaceAST.IfStmt, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitIfStmt(node as unknown as ClassAST.IfStmt);}
    }

    weaveLinear(node : InterfaceAST.Linear, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitLinear(node as unknown as ClassAST.Linear);}
    }

    weaveLit(node : InterfaceAST.Lit, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitLit(node as unknown as ClassAST.Lit);}
    }

    weaveRef(node : InterfaceAST.Ref, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitRef(node as unknown as ClassAST.Ref);}
    }

    weaveReturnStmt(node : InterfaceAST.ReturnStmt, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitReturnStmt(node as unknown as ClassAST.ReturnStmt);}
    }

    weaveRotation(node : InterfaceAST.Rotation, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitRotation(node as unknown as ClassAST.Rotation);}
    }

    weaveSetSpeed(node : InterfaceAST.SetSpeed, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitSetSpeed(node as unknown as ClassAST.SetSpeed);}
    }

    weaveTime(node : InterfaceAST.Time, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitTime(node as unknown as ClassAST.Time);}
    }

    weaveUnExpr(node : InterfaceAST.UnExpr, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitUnExpr(node as unknown as ClassAST.UnExpr);}
    }

    weaveVarDecl(node : InterfaceAST.VarDecl, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitVarDecl(node as unknown as ClassAST.VarDecl);}
    }

    weaveWhileStmt(node : InterfaceAST.WhileStmt, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitWhileStmt(node as unknown as ClassAST.WhileStmt);}
    }

    weaveUnitCast(node : InterfaceAST.UnitCast, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitUnitCast(node as unknown as ClassAST.UnitCast);}
    }

    weaveSpeed(node : InterfaceAST.Speed, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitSpeed(node as unknown as ClassAST.Speed);}
    }

}
