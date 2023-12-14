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
        EntryPoint: weaver.weaveEntryPoint,
        FunDef: weaver.weaveFunDef,
        VoidType: weaver.weaveVoidType,
        DataType: weaver.weaveDataType,
        SimpleVarDecl: weaver.weaveSimpleVarDecl,
        VarDeclInit: weaver.weaveVarDeclInit,
        BinExpr: weaver.weaveBinExpr,
        UnExpr: weaver.weaveUnExpr,
        Lit: weaver.weaveLit,
        Ref: weaver.weaveRef,
        GetSpeed: weaver.weaveGetSpeed,
        Distance: weaver.weaveDistance,
        Time: weaver.weaveTime,
        FunCall: weaver.weaveFunCall,
        Block: weaver.weaveBlock,
        AssignVar: weaver.weaveAssignVar,
        SetSpeed: weaver.weaveSetSpeed,
        WhileStmt: weaver.wheaveWhileStmt,
        IfStmt: weaver.weaveIfStmt,
        ReturnStmt: weaver.weaveReturnStmt,
        Linear: weaver.weaveLinear,
        Rotation: weaver.weaveRotation,
        UnitCast: weaver.weaveUnitCast,
    }
    registry.register(checks, weaver);
}

/**
 * TODO :
 * You must implement a weaving function for each concrete concept of the language.
 * you will also need to fill the check data structure to map the weaving function to the Type of node
 */
export class RobotScriptAcceptWeaver {
    weaveEntryPoint(node : InterfaceAST.EntryPoint, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitEntryPoint(node as unknown as ClassAST.EntryPoint);}
    }

    weaveFunDef(node : InterfaceAST.FunDef, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitFunDef(node as unknown as ClassAST.FunDef);}
    }

    weaveVoidType(node : InterfaceAST.VoidType, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitVoidType(node as unknown as ClassAST.VoidType);}
    }

    weaveDataType(node : InterfaceAST.DataType, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitDataType(node as unknown as ClassAST.DataType);}
    }

    weaveSimpleVarDecl(node : InterfaceAST.SimpleVarDecl, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitSimpleVarDecl(node as unknown as ClassAST.SimpleVarDecl);}
    }

    weaveVarDeclInit(node : InterfaceAST.VarDeclInit, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitVarDeclInit(node as unknown as ClassAST.VarDeclInit);}
    }

    weaveBinExpr(node : InterfaceAST.BinExpr, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitBinExpr(node as unknown as ClassAST.BinExpr);}
    }

    weaveUnExpr(node : InterfaceAST.UnExpr, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitUnExpr(node as unknown as ClassAST.UnExpr);}
    }

    weaveLit(node : InterfaceAST.Lit, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitLit(node as unknown as ClassAST.Lit);}
    }

    weaveRef(node : InterfaceAST.Ref, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitRef(node as unknown as ClassAST.Ref);}
    }

    weaveGetSpeed(node : InterfaceAST.GetSpeed, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitGetSpeed(node as unknown as ClassAST.GetSpeed);}
    }

    weaveDistance(node : InterfaceAST.Distance, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitDistance(node as unknown as ClassAST.Distance);}
    }

    weaveTime(node : InterfaceAST.Time, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitTime(node as unknown as ClassAST.Time);}
    }

    weaveFunCall(node : InterfaceAST.FunCall, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitFunCall(node as unknown as ClassAST.FunCall);}
    }

    weaveBlock(node : InterfaceAST.Block, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitBlock(node as unknown as ClassAST.Block);}
    }

    weaveAssignVar(node : InterfaceAST.AssignVar, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitAssignVar(node as unknown as ClassAST.AssignVar);}
    }

    weaveSetSpeed(node : InterfaceAST.SetSpeed, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitSetSpeed(node as unknown as ClassAST.SetSpeed);}
    }

    wheaveWhileStmt(node : InterfaceAST.WhileStmt, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitWhileStmt(node as unknown as ClassAST.WhileStmt);}
    }

    weaveIfStmt(node : InterfaceAST.IfStmt, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitIfStmt(node as unknown as ClassAST.IfStmt);}
    }

    weaveReturnStmt(node : InterfaceAST.ReturnStmt, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitReturnStmt(node as unknown as ClassAST.ReturnStmt);}
    }

    weaveLinear(node : InterfaceAST.Linear, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitLinear(node as unknown as ClassAST.Linear);}
    }

    weaveRotation(node : InterfaceAST.Rotation, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitRotation(node as unknown as ClassAST.Rotation);}
    }

    weaveUnitCast(node : InterfaceAST.UnitCast, accept : ValidationAcceptor) : void{
        (<any> node).accept = (visitor: RobotScriptVisitor) => {return visitor.visitUnitCast(node as unknown as ClassAST.UnitCast);}
    }

}
