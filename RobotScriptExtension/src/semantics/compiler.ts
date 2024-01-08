import { isFunDef } from "../language/generated/ast.js";
import { ScopeNode, Symb, SymbState, TreeScope } from "../language/tree-scope.js";
import { header } from "./header.js";
import { AnyType, AssignVar, BinExpr, Block, Distance, EntryPoint, FunCall, FunDef, GetSpeed, Group, IfStmt, Linear, Lit, Ref, ReturnStmt, RobotScriptVisitor, Rotation, SetSpeed, Time, UnExpr, UnitCast, VarDecl, WhileStmt } from "./visitor.js";
import * as AST from '../language/generated/ast.js';
import { UsageRestrictedFunCall, getPcval } from "../language/robot-script-validator.js";

class SymbolManager {
    private dict: Map<string, string> = new Map();
    private prefix = 'rs_';
    private suffix = 'a';

    /**
     * Fonction permettant de traduire les noms des variables et fonctions
     * de manière à éviter de potentiels conflits avec les mots-clés d'Arduino
     * @param name Le nom à traduire
     * @returns Le nom traduit
     */
    public getTranslation(name: string): string {
        if (this.dict.has(name)) {
            return this.dict.get(name)!;
        } else {
            const translation = this.generateName();
            this.dict.set(name, translation);
            return translation;
        }
    }

    /**
     * Fonction permettant de générer un nom unique n'entrant pas en conflit
     * avec les mots-clés d'Arduino
     * @returns Un nom unique
     */
    public generateName(): string {
        const name = this.prefix + this.suffix;
        switch (this.suffix.charAt(this.suffix.length - 1)) {
            case 'z':
                this.suffix = this.suffix.slice(0, -1) + 'A';
                break;
            case 'Z':
                this.suffix += 'a';
                break;
            default:
                // For any other character, replace it with the next character
                this.suffix = this.suffix.slice(0, -1) + String.fromCharCode(this.suffix.charCodeAt(this.suffix.length - 1) + 1);
                break;
        }
        return name;
    }
}

export class Compiler implements RobotScriptVisitor{

    private symMgr = new SymbolManager();
    private nbIndent = 0;

    constructor(private pcScope: TreeScope) {}

    visitEntryPoint(ep: EntryPoint): string {
        let res = header;
        ep.funs.forEach(fun => {
            let status = this.pcScope.getStatus(fun as Symb);
            if (status >= SymbState.used) {
                res += fun.accept(this);
            }
        });
        return res;
    }

    visitFunDef(fun: FunDef): string {
        const type = fun.type.accept(this);
        const name = fun.name === 'main' ? 'loop' : this.symMgr.getTranslation(fun.name);
        const params = fun.params.map(param => param.accept(this).text).join(', ');

        const tmp = this.pcScope.getAssociated(fun as ScopeNode);
        if (!tmp) {
            throw new  Error(`Precomputed scope not found for function '${fun.name}'`);
        }
        const prevPcScope = this.pcScope;
        this.pcScope = tmp;
        const body = fun.body.accept(this) as {returned: boolean, text: string};
        this.pcScope = prevPcScope;
        
        return `${type} ${name}(${params}) ${body.text}\n`;
    }

    visitAnyType(type: AnyType): string {
        switch (type.name) {
            case 'void':
                return 'void';
            case 'number':
                return 'float';
            case 'bool':
                return 'bool';
            default:
                throw new Error(`Unknown type '${type.name}'`);
        }
    }

    visitVarDecl(decl: VarDecl): {returned: boolean, text: string} {
        const returned = false;
        let text = '';
        if (isFunDef(decl.$container)) {
            const type = decl.type.accept(this);
            const name = this.symMgr.getTranslation(decl.name);
            text = `${type} ${name}`;
        } else {
            const status = this.pcScope.getStatus(decl as Symb);
            if (status === SymbState.used) {
                const type = decl.type.accept(this);
                const name = this.symMgr.getTranslation(decl.name);
                const expr = decl.expr ? ` = ${decl.expr.accept(this)}` : '';
                text = `${this.indent()}${type} ${name}${expr};\n`;
            }
        }
        return { returned, text };
    }

    visitBinExpr(binex: BinExpr): string {
        const pc = getPcval(binex as AST.Expression);
        if (pc !== undefined) {
            return pc.toString();
        }
        const op = binex.op;
        const expr1 = binex.expr1.accept(this);
        const expr2 = binex.expr2.accept(this);
        return `${expr1} ${op} ${expr2}`;
    }

    visitUnExpr(unex: UnExpr): string {
        const pc = getPcval(unex as AST.Expression);
        if (pc !== undefined) {
            return pc.toString();
        }
        const op = unex.op;
        const expr = unex.expr.accept(this);
        return `${op}${expr}`;
    }

    visitLit(lit: Lit): string {
        return lit.val.toString();
    }

    visitGroup(group: Group): string {
        const pc = getPcval(group as AST.Expression) ?.toString();
        return pc ?? `(${group.expr.accept(this)})`;
    }

    visitRef(ref: Ref): string {
        const pc = getPcval(ref as AST.Expression)
        if (pc !== undefined) {
            return pc.toString();
        }
        const rvar = ref.val.ref;
        if (rvar === undefined) {
            throw new Error('Reference to refered variable is broken');
        }
        return this.symMgr.getTranslation(rvar.name);
    }

    visitGetSpeed(speed: GetSpeed): string {
        const factor = speed.unit?.accept(this) ?? 1;
        const conversion = factor > 1 ? `/${factor}` : '';
        return `speed${conversion};`        
    }
    
    visitDistance(node: Distance): string {
        throw new Error("Method not implemented.");
    }
    
    visitTime(node: Time): string {
        return 'millis()';
    }
    
    visitFunCall(call: FunCall): string | {returned: boolean, text: string} {
        const fun = call.fun.ref;
        if (fun === undefined) {
            throw new Error('Reference to refered function is broken');
        }
        const name = this.symMgr.getTranslation(fun.name);
        const params = call.params.map(param => param.accept(this)).join(', ');

        const usage = (call as UsageRestrictedFunCall).usage;
        const text = `${name}(${params})`;
        switch (usage) {
            case "expr":
                return text;
            case "stmt":
                return {
                    returned: false,
                    text: `${this.indent()}${text};\n`
                };
            default:
                throw new Error(`Unknown usage '${usage}'`);
        }
    }
    
    visitBlock(block: Block): {returned: boolean, text: string} {
        if (!AST.isFunDef(block.$container)) {
            const tmp = this.pcScope.getAssociated(block as ScopeNode);
            if (!tmp) {
                throw new Error('Precomputed scope not found for block');
            }
            const prevPcScope = this.pcScope;
            this.pcScope = tmp;

            const res = this.visitBlockHelper(block);
            
            this.pcScope = prevPcScope;
            return res;
        } else {
            return this.visitBlockHelper(block);
        }
    }

    private visitBlockHelper(block: Block): {returned: boolean, text: string} {
        let text = AST.isBlock(block.$container) ? `${this.indent()}{\n}` : '{\n';
        this.nbIndent++;

        const returned = block.stmts.some(stmt => {
            const res = stmt.accept(this);
            text += res.text;
            return res.returned;
        });
        if (AST.isFunDef(block.$container) && !returned) {
            text += `${this.indent()}return;\n`;
        }
        
        this.nbIndent--;

        text += `${this.indent()}}\n`;
        return {
            returned,
            text
        };
    }
    
    visitAssignVar(assign: AssignVar): {returned: boolean, text: string} {
        const rvar = assign.ref.ref;
        if (rvar === undefined) {
            throw new Error('Reference to refered variable is broken');
        }
        const status = this.pcScope.getStatus(rvar as Symb);
        if (status === SymbState.used) {
            const name = this.symMgr.getTranslation(rvar.name);
            const expr = assign.expr.accept(this);
            const op = assign.op
            if (op === '||=' || op === '&&=') {
                return {
                    returned: false,
                    text:`${this.indent()}${name} = ${name} ${op.slice(0, -1)} (${expr});\n`
                };
            }
            return {
                returned: false,
                text: `${this.indent()}${name} ${op} ${expr};\n`
            };
        }
        return {returned: false, text: ''};
    }
    
    visitSetSpeed(set: SetSpeed): {returned: boolean, text: string} {
        const tmp = set.expr.accept(this);
        const factor = set.unit?.accept(this) ?? 1;
        const expr = factor > 1 ? `(${tmp})*${factor}` : tmp;
        const op = set.op
            if (op === '||=' || op === '&&=') {
                return {
                    returned: false,
                    text:`${this.indent()}speed = speed ${op.slice(0, -1)} (${expr});\n`
                };
            }
            return {
                returned: false,
                text: `${this.indent()}speed ${op} ${expr};\n`
            };
    }
    
    visitWhileStmt(stmt: WhileStmt): {returned: boolean, text: string} {
        const pc = getPcval(stmt.expr as AST.Expression);
        let text = '';
        if (pc !== undefined) {
            if (pc) {
                text += `${this.indent()}while (true)`
                const body = stmt.stmt.accept(this);
                text += AST.isBlock(stmt.stmt) ? ` ${body.text}` : `\n\t${body.text}`;
                return {
                    returned: body.returned,
                    text
                }
            } else {
                return {returned: false, text: ''};
            }
        }
        const expr = stmt.expr.accept(this);
        text = `${this.indent()}while (${expr})`;
        const body = stmt.stmt.accept(this);
        text += AST.isBlock(stmt.stmt) ? ` ${body.text}` : `\n\t${body.text}`;
        return {
            returned: body.returned,
            text
        };
    }
    
    visitIfStmt(stmt: IfStmt): {returned: boolean, text: string} {
        const pc = getPcval(stmt.expr as AST.Expression);
        if (pc !== undefined) {
            if (pc) {
                return stmt.stmt1.accept(this);
            } else {
                return stmt.stmt2?.accept(this) ?? {returned: false, text: ''};
            }
        }
        const expr = stmt.expr.accept(this);
        let text = `${this.indent()}if (${expr})`;
        const stmt1 = stmt.stmt1.accept(this);
        text += AST.isBlock(stmt.stmt1) ? ` ${stmt1.text}` : `\n\t${stmt1.text}`;
        
        if (stmt1.returned || !stmt.stmt2) {
            return {
                returned: stmt1.returned,
                text
            };
        }
        text += `${this.indent()}else`;
        const stmt2 = stmt.stmt2.accept(this);
        text += AST.isBlock(stmt.stmt2) ? ` ${stmt2.text}` : `\n\t${stmt2.text}`;
       
        return {
            returned: stmt1.returned && stmt2.returned,
            text
        };
    }
    
    visitReturnStmt(ret: ReturnStmt): {returned: boolean, text: string} {
        const expr = 
            getPcval(ret.expr as AST.Expression)?.toString() ??
            ret.expr?.accept(this);
        const res = expr ? ` ${expr}` : '';
        return {
            returned: true,
            text: `${this.indent()}return${res};\n`
        };
    }
    
    visitLinear(lin: Linear): {returned: boolean, text: string} {
        let text = '';
        const unit = lin.unit?.accept(this) ?? 1;
        const pc = getPcval(lin.expr as AST.Expression);
        if (pc !== undefined) {
            const dist = +pc * unit;
            let angle = '';
            switch (lin.dir) {
                case "Forward":
                    angle = dist < 0 ? 'PI*3/2' : 'PI/2';
                    break;
                case "Sideways":
                    angle = dist < 0 ? 'PI' : '0';
                    break;
                default:
                    throw new Error(`Unknown direction '${lin.dir}'`);
            }
            text += `${this.indent()}Omni.setCarMove(speed, ${angle});\n`;
            text += `${this.indent()}Omni.delayMS(${Math.abs(dist)}/speed);\n`;
        } else {
            const expr = lin.expr.accept(this);
            const dist = unit > 1 ? `(${expr})*${unit}` : expr;
            const distvar = this.symMgr.generateName();
            text += `${this.indent()}float ${distvar} = ${dist};\n`;
            let angle = '';
            switch (lin.dir) {
                case "Forward":
                    angle = `${distvar}<0 ? PI*3/2 : PI/2`;
                    break;
                case "Sideways":
                    angle = `${distvar}<0 ? PI : 0`;
                    break;
                default:
                    throw new Error(`Unknown direction '${lin.dir}'`);
            }
            text += `${this.indent()}Omni.setCarMove(speed, ${angle});\n`;
            text += `${this.indent()}Omni.delayMS(abs(${distvar})/speed);\n`;
        }
        text += `${this.indent()}Omni.setCarStop();\n`;
        return {
            returned: false,
            text
        };
    }
    
    visitRotation(rot: Rotation): {returned: boolean, text: string} {
        let text = '';
        const pc = getPcval(rot.expr as AST.Expression);
        if (pc !== undefined) {
            const omega = this.symMgr.generateName();
            text += `${this.indent()}float ${omega} = speed/(sqrt(pow(Omni.getWheelspan()/2,2)*2));\n`;
            text += `${this.indent()}Omni.setCarMove(0, 0, ${+pc > 0 ? omega : `-${omega}`});\n`;
            text += `${this.indent()}Omni.delayMS(${Math.abs(+pc)}/${omega});\n`;
        } else {
            const angle = rot.expr.accept(this);
            const anglevar = this.symMgr.generateName();
            text += `${this.indent()}float ${anglevar} = (${angle})*PI/180;\n`;
            const omega = this.symMgr.generateName();
            text += `${this.indent()}float ${omega} = speed/(sqrt(pow(Omni.getWheelspan()/2,2)*2));\n`;
            text += `${this.indent()}Omni.setCarMove(0, 0, ${anglevar}>0 ? ${omega} : -${omega});\n`;
            text += `${this.indent()}Omni.delayMS(abs(${anglevar})/${omega});\n`;
        }
        text += `${this.indent()}Omni.setCarStop();\n`;
        return {
            returned: false,
            text
        };
    }
    
    visitUnitCast(cast: UnitCast): number {
        switch (cast.unit) {
            case 'mm':
                return 1;
            case 'cm':
                return 10;
            case 'dm':
                return 100;
            case 'm':
                return 1000;
            default:
                throw new Error(`Unknown unit '${cast.unit}'`);
        }
    }

    private indent(): string {
        return ' '.repeat(4*this.nbIndent);
    }

}