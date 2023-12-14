import { AssignVar, BinExpr, Block, DataType, Distance, EntryPoint, FunCall, FunDef, GetSpeed, IfStmt, Linear, Lit, Ref, ReturnStmt, RobotScriptVisitor, Rotation, SetSpeed, SimpleVarDecl, Time, UnExpr, UnitCast, VarDeclInit, VoidType, WhileStmt } from "./visitor.js";


export class Compiler implements RobotScriptVisitor{
        /** 
        const startblock = 
            "
            #include <PinChangeInt.h>
            #include <PinChangeIntConfig.h>
            #include <EEPROM.h>
            #define _NAMIKI_MOTOR	 //for Namiki 22CL-103501PG80:1
            #include <fuzzy_table.h>
            #include <PID_Beta6.h>
            #include <MotorWheel.h>
            #include <Omni4WD.h>

            irqISR(irq1, isr1);
            MotorWheel wheel1(3, 2, 4, 5, &irq1);

            irqISR(irq2, isr2);
            MotorWheel wheel2(11, 12, 14, 15, &irq2);

            irqISR(irq3, isr3);
            MotorWheel wheel3(9, 8, 16, 17, &irq3);

            irqISR(irq4, isr4);
            MotorWheel wheel4(10, 7, 18, 19, &irq4);
            "
        */

    // 1. Import libs
    // 2. Setup
    // 3. search for main (loop)
    visitEntryPoint(node: EntryPoint) {
        const importLib : string = "#include <PinChangeInt.h> \n #include <PinChangeIntConfig.h> \n #include <EEPROM.h> \n #define _NAMIKI_MOTOR \n #include <fuzzy_table.h> \n #include <PID_Beta6.h> \n #include <MotorWheel.h> \n #include <Omni4WD.h> \n";
        const importWheels : string = "irqISR(irq1, isr1); \n MotorWheel wheel1(3, 2, 4, 5, &irq1); \n irqISR(irq2, isr2); \n MotorWheel wheel2(11, 12, 14, 15, &irq2); \n irqISR(irq3, isr3); \n MotorWheel wheel3(9, 8, 16, 17, &irq3); \n irqISR(irq4, isr4); \n MotorWheel wheel4(10, 7, 18, 19, &irq4); \n";
        const main = node.funs.find((fun) => fun.name === 'main');
        return importLib + importWheels + main!.accept(this);
    }

    visitFunDef(node: FunDef) {
        var nameFunc : string;
        var listParams : string = "";
        if(node.name == "main") {
            nameFunc = "loop";
        }else{
            nameFunc = node.name;
            listParams = node.params.map(param => param.accept(this)).join(",");
        }
        // Block intègre les {}
        return "void " + nameFunc + "("+listParams+")\n " + node.body;
    }


    visitBlock(node: Block) {
        // statement accept
        throw new Error('Method not implemented.');
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