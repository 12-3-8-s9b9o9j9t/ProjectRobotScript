import { AnyType, AssignVar, BinExpr, Block, Distance, EntryPoint, FunCall, FunDef, GetSpeed, IfStmt, Linear, Lit, Ref, ReturnStmt, RobotScriptVisitor, Rotation, SetSpeed, Time, UnExpr, UnitCast, VarDecl, WhileStmt } from "./visitor.js";

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
        var typeFunc : string;
        if(node.name == "main") {
            nameFunc = "loop";
            typeFunc = "void";
        }else{
            nameFunc = node.name;
            listParams = node.params.map(param => param.accept(this)).join(",");
            typeFunc = node.type.toString();
        }
        // Block intègre les {}
        return typeFunc + nameFunc + "("+listParams+")\n " + node.body;
    }


    visitBlock(node: Block) {
        var ans : string = "{\n";
        var statements =  node.stmts;
        statements.forEach(statement => {
            ans = ans + statement.accept(this); // on incorpore tt la syntax dans statement
        });
        ans = ans + "}\n";
        // statement accept
        return ans;
    }

    visitIfStmt(node: IfStmt) {
        // Arduino : if (condition) { X } else { Y };
        // AST : 'if' '(' expr=Expression ')' stmt1=Statement ('else' stmt2=Statement)?  

        var ifStatement : string = "if (" + node.expr.accept(this) + ")"
            + "{\n" + node.stmt1.accept(this) + "}\n";

        var elseStatement  : string = "";
        if( "stmt2" in node) {
            elseStatement = "else {\n" + node.stmt2?.accept(this) + "}" 
        }
        return ifStatement + elseStatement + ";";
    }


    // ###### Probleme avec les accepts
    visitWhileStmt(node: WhileStmt) {
        // Arduino : while (condition) { X };
        // AST : 'while' '(' expr=Expression ')' stmt=Statement   
        var whileStatement: string = "while (" +  node.expr + ")"
            + "{\n" + node.stmt + "}\n";
        return whileStatement;
    }


    visitReturnStmt(node: ReturnStmt) {
        var ret : string;
        if("expr" in node){
            ret = "return" + node.expr?.accept(this) + ";"
        }else{
            ret = "";
        }
        return ret;
    }

    visitAnyType(node: AnyType) {
        // name=('bool'|'number'|'void') 
        var ans : string;
        if(node.name == "void"){
            ans = "void";
        } else if(node.name == "bool"){
            ans = "bool";
        }else{
            ans = "number";
        }
        return ans;
    }


    visitVarDecl(node: VarDecl) {
        // type=DataType name=ID '=' expr?=Expression
        if (node.expr) {
            return node.type.accept(this) +" "+node.name+" = "+node.expr.accept(this)+";";
        } 
        return node.type.accept(this) +" "+node.name; // pas sur de accept ici aussi
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