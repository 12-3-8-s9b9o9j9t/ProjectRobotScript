import type { ValidationAcceptor, ValidationChecks } from 'langium';
import type { RobotScriptAstType } from '../language/generated/ast.js';
import * as ToWeave from '../language/generated/ast.js';
import * as Weaved from './visitor.js';
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
        AnyType: weaver.weaveAnyType,
        VarDecl: weaver.weaveVarDecl,
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
        WhileStmt: weaver.weaveWhileStmt,
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
    weaveEntryPoint(ep : ToWeave.EntryPoint, accept : ValidationAcceptor) : void{
        (ep as Weaved.EntryPoint)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitEntryPoint(ep as Weaved.EntryPoint);}
    }

    weaveFunDef(fun : ToWeave.FunDef, accept : ValidationAcceptor) : void{
        (fun as Weaved.FunDef)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitFunDef(fun as Weaved.FunDef);}
    }

    weaveAnyType(any : ToWeave.AnyType, accept : ValidationAcceptor) : void{
        (any as Weaved.AnyType)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitAnyType(any as Weaved.AnyType);}
    }

    weaveVarDecl(varDecl : ToWeave.VarDecl, accept : ValidationAcceptor) : void{
        (varDecl as Weaved.VarDecl)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitVarDecl(varDecl as Weaved.VarDecl);}
    }

    weaveBinExpr(binExpr : ToWeave.BinExpr, accept : ValidationAcceptor) : void{
        (binExpr as Weaved.BinExpr)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitBinExpr(binExpr as Weaved.BinExpr);}
    }

    weaveUnExpr(unExpr : ToWeave.UnExpr, accept : ValidationAcceptor) : void{
        (unExpr as Weaved.UnExpr)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitUnExpr(unExpr as Weaved.UnExpr);}
    }

    weaveLit(lit : ToWeave.Lit, accept : ValidationAcceptor) : void{
        (lit as Weaved.Lit)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitLit(lit as Weaved.Lit);}
    }

    weaveRef(ref : ToWeave.Ref, accept : ValidationAcceptor) : void{
        (ref as Weaved.Ref)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitRef(ref as Weaved.Ref);}
    }

    weaveGetSpeed(getSpeed : ToWeave.GetSpeed, accept : ValidationAcceptor) : void{
        (getSpeed as Weaved.GetSpeed)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitGetSpeed(getSpeed as Weaved.GetSpeed);}
    }

    weaveDistance(distance : ToWeave.Distance, accept : ValidationAcceptor) : void{
        (distance as Weaved.Distance)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitDistance(distance as Weaved.Distance);}
    }

    weaveTime(time : ToWeave.Time, accept : ValidationAcceptor) : void{
        (time as Weaved.Time)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitTime(time as Weaved.Time);}
    }

    weaveFunCall(funCall : ToWeave.FunCall, accept : ValidationAcceptor) : void{
        (funCall as Weaved.FunCall)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitFunCall(funCall as Weaved.FunCall);}
    }

    weaveBlock(block : ToWeave.Block, accept : ValidationAcceptor) : void{
        (block as Weaved.Block)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitBlock(block as Weaved.Block);}
    }

    weaveAssignVar(assignVar : ToWeave.AssignVar, accept : ValidationAcceptor) : void{
        (assignVar as Weaved.AssignVar)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitAssignVar(assignVar as Weaved.AssignVar);}
    }

    weaveSetSpeed(setSpeed : ToWeave.SetSpeed, accept : ValidationAcceptor) : void{
        (setSpeed as Weaved.SetSpeed)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitSetSpeed(setSpeed as Weaved.SetSpeed);}
    }

    weaveWhileStmt(whileStmt : ToWeave.WhileStmt, accept : ValidationAcceptor) : void{
        (whileStmt as Weaved.WhileStmt)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitWhileStmt(whileStmt as Weaved.WhileStmt);}
    }

    weaveIfStmt(ifStmt : ToWeave.IfStmt, accept : ValidationAcceptor) : void{
        (ifStmt as Weaved.IfStmt)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitIfStmt(ifStmt as Weaved.IfStmt);}
    }

    weaveReturnStmt(returnStmt : ToWeave.ReturnStmt, accept : ValidationAcceptor) : void{
        (returnStmt as Weaved.ReturnStmt)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitReturnStmt(returnStmt as Weaved.ReturnStmt);}
    }

    weaveLinear(linear : ToWeave.Linear, accept : ValidationAcceptor) : void{
        (linear as Weaved.Linear)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitLinear(linear as Weaved.Linear);}
    }

    weaveRotation(rotation : ToWeave.Rotation, accept : ValidationAcceptor) : void{
        (rotation as Weaved.Rotation)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitRotation(rotation as Weaved.Rotation);}
    }

    weaveUnitCast(unitCast : ToWeave.UnitCast, accept : ValidationAcceptor) : void{
        (unitCast as Weaved.UnitCast)
            .accept = (visitor: RobotScriptVisitor) => {return visitor.visitUnitCast(unitCast as Weaved.UnitCast);}
    }

}
