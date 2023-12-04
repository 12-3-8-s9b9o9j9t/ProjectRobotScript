import type { ValidationAcceptor, ValidationChecks } from 'langium'
import {
    FunDef,
    type EntryPoint,
    type RobotScriptAstType,
    FunCall,
    Block,
    isReturnStmt,
    isFunDef,
    isVarDecl,
    VarDecl,
    isBlock,
    isIfStmt,
    Statement,
    isLoopStmt,
    AnyType,
    Expression,
    isRef,
    isFunCall,
    isBinExpr,
    isUnExpr,
    isLit,
} from './generated/ast.js'
import type { RobotScriptServices } from './robot-script-module.js'
import { evalBin, evalUn } from './robot-script-utils.js'

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobotScriptServices) {
    const registry = services.validation.ValidationRegistry
    const validator = services.validation.RobotScriptValidator
    const checks: ValidationChecks<RobotScriptAstType> = {
        EntryPoint: [
            validator.checkFunDefDuplicate,
            validator.checkScope
        ],
        FunDef: [
            validator.checkMainSignature,
            validator.checkReturn
        ],
        FunCall: [
            validator.checkFunCallInputNumber,
            validator.checkFunCallNotMain,
        ],
        Block: validator.checkVarDeclDuplicate,
        VarDecl: [
            validator.checkVarDeclInsideBlock,
            validator.checkVarDeclInit,
        ],
    }
    registry.register(checks, validator)
}


type Scope = Map<string, {varDecl : VarDecl, isUsed: boolean}>

/**
 * Implementation of custom validations.
 */
export class RobotScriptValidator {

    checkFunDefDuplicate(ep: EntryPoint, accept: ValidationAcceptor): void {
        const funSet = new Set<string>()
        ep.funs.forEach((fun) => {
            !funSet.has(fun.name) ||
                accept('error', `Duplicate function '${fun.name}'.`, {
                    node: fun,
                    property: 'name',
                })
            funSet.add(fun.name)
        })
    }

    checkMainSignature(fun: FunDef, accept: ValidationAcceptor): void {
        if (fun.name === 'main') {
            fun.params.length === 0 ||
                accept('error', "Function 'main' must have no parameters.", {
                    node: fun,
                    property: 'params',
                })

            fun.type.name === 'void' ||
                accept('error', "Function 'main' must return void.", {
                    node: fun,
                    property: 'type',
                })
        }
    }

    checkFunCallInputNumber(call: FunCall, accept: ValidationAcceptor): void {
        const expected = call.fun.ref?.params.length
        const actual = call.args.length
        expected === actual ||
            accept(
                'error',
                `${expected} arguments expected, ${actual} given.`,
                { node: call, property: 'args' }
            )
    }

    checkFunCallNotMain(call: FunCall, accept: ValidationAcceptor): void {
        call.fun.ref?.name !== 'main' ||
            accept('error', "Function 'main' cannot be called.", {
                node: call,
                property: 'fun',
            })
    }

    checkReturn(fun: FunDef, accept: ValidationAcceptor): void {
        this.checkReturnRec(fun.body, accept, fun.type.name) ||
            fun.type.name === 'void' ||
            accept(
                'error',
                "Function does not have end return value, and type is not 'void'.",
                { node: fun, property: 'type' }
            )
    }

    private checkReturnRec(
        stmt: Statement,
        accept: ValidationAcceptor,
        retType: AnyType['name']
    ): boolean {
        if (isReturnStmt(stmt)) {
            if (stmt.expr && retType === 'void') {
                accept('error', "Cannot assign value to type 'void'.", {
                    node: stmt,
                })
            } else if (!stmt.expr && retType !== 'void') {
                accept(
                    'error',
                    `Cannot assign value of type 'void' to type '${retType}'.`,
                    { node: stmt }
                )
            }
            return true
        } else if (isLoopStmt(stmt)) {
            const cond = this.reduceExpr(stmt.expr)
            if (cond !== undefined && !cond) {
                accept('warning', 'Unreachable code.', {
                    node: stmt.stmt,
                    tags: [1],
                })
            } else {
                return this.checkReturnRec(stmt.stmt, accept, retType)
            }
        } else if (isIfStmt(stmt)) {
            const cond = this.reduceExpr(stmt.expr)
            if (cond !== undefined) {
                ;(!cond &&
                    accept('warning', 'Unreachable code.', {
                        node: stmt.stmt1,
                        tags: [1],
                    })) ||
                    (stmt.stmt2 &&
                        cond &&
                        accept('warning', 'Unreachable code.', {
                            node: stmt.stmt2,
                            tags: [1],
                        }))
            }
            const elseRet =
                stmt.stmt2 !== undefined &&
                (cond === undefined || !cond) &&
                this.checkReturnRec(stmt.stmt2, accept, retType)
            const ifRet =
                (cond === undefined || !!cond) &&
                this.checkReturnRec(stmt.stmt1, accept, retType)
            return elseRet && ifRet
        } else if (isBlock(stmt)) {
            const retStmt = stmt.stmts.find((stmt) =>
                this.checkReturnRec(stmt, accept, retType)
            )

            if (retStmt && retStmt.$containerIndex !== stmt.stmts.length - 1) {
                accept('warning', 'Unreachable code.', {
                    node: stmt,
                    range: {
                        start: stmt.stmts[retStmt.$containerIndex! + 1]
                            .$cstNode!.range.start,
                        end: stmt.stmts[stmt.stmts.length - 1].$cstNode!.range
                            .end,
                    },
                    tags: [1],
                })
            }
            return retStmt !== undefined
        }
        return false
    }

    private reduceExpr(expr: Expression): number | boolean | undefined {
        if (isLit(expr)) {
            return expr.val
        } else if (isUnExpr(expr)) {
            const val = this.reduceExpr(expr.expr)
            if (val !== undefined) {
                return evalUn(expr.op, val)
            }
        } else if (isBinExpr(expr)) {
            const val1 = this.reduceExpr(expr.expr1)
            const val2 = this.reduceExpr(expr.expr2)
            if (val1 !== undefined && val2 !== undefined) {
                return evalBin(expr.op, val1, val2)
            }
        }
        return undefined
    }






    checkScope(ep: EntryPoint, accept: ValidationAcceptor): void {
        ep.$document?.uri.scheme !== 'builtin' &&
            ep.funs.forEach((fun) => {
                this.checkScopeFun(fun, accept)
            })
    }

    private checkScopeFun(fun: FunDef, accept: ValidationAcceptor): void {
        const scope : Scope = new Map()

        fun.params.forEach((param) => {
            !scope.has(param.name) ||
                accept('error', `Duplicate parameter '${param.name}'.`, {
                    node: param,
                    property: 'name',
                })
            
            scope.set(param.name, {varDecl: param, isUsed: false})
        })

        this.checkScopeBlock(fun.body, accept, scope)
    }

    private checkScopeBlock(block: Block, accept: ValidationAcceptor, outScope: Scope): void {
        const scope : Scope = isFunDef(block.$container) ? outScope : new Map()


    }

    checkVarDeclDuplicate(block: Block, accept: ValidationAcceptor): void {
        const varSet = new Set<string>()

        if (isFunDef(block.$container)) {
            block.$container.params.forEach((param) => {
                varSet.add(param.name)
            })
        }

        block.stmts.forEach((stmt) => {
            if (isVarDecl(stmt)) {
                !varSet.has(stmt.name) ||
                    accept('error', `Duplicate variable '${stmt.name}'.`, {
                        node: stmt,
                        property: 'name',
                    })
                varSet.add(stmt.name)
            }
        })
    }

    checkVarDeclInsideBlock(
        varDecl: VarDecl,
        accept: ValidationAcceptor
    ): void {
        const container = varDecl.$container
        if (!isFunDef(container) && !isBlock(container)) {
            accept('error', 'Variable declaration must be inside a block.', {
                node: varDecl,
            })
        }
    }

    checkVarDeclInit(varDecl: VarDecl, accept: ValidationAcceptor): void {
        if (varDecl.expr) {
            this.checkVarDeclInitRec(varDecl.expr, accept, varDecl.name)
        }
    }

    private checkVarDeclInitRec(
        expr: Expression,
        accept: ValidationAcceptor,
        varName: string
    ): void {
        if (isRef(expr) && expr.val.ref?.name === varName) {
            accept('error', 'Variable cannot be initialized using itself.', {
                node: expr,
            })
        } else if (isFunCall(expr)) {
            expr.args.forEach((arg) =>
                this.checkVarDeclInitRec(arg, accept, varName)
            )
        } else if (isBinExpr(expr)) {
            this.checkVarDeclInitRec(expr.expr1, accept, varName)
            this.checkVarDeclInitRec(expr.expr2, accept, varName)
        } else if (isUnExpr(expr)) {
            this.checkVarDeclInitRec(expr.expr, accept, varName)
        }
    }
}
