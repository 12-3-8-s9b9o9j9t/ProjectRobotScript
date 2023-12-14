import type { ValidationAcceptor, ValidationChecks } from 'langium'
import {
    type AnyType,
    type EntryPoint,
    type Expression,
    type FunCall,
    type FunDef,
    type RobotScriptAstType,
    type Statement,
    type VarDecl,
    isBinExpr,
    isBlock,
    isFunCall,
    isFunDef,
    isIfStmt,
    isLit,
    isRef,
    isReturnStmt,
    isUnExpr,
    isVarDecl,
    isWhileStmt,
    isVarDeclInit,
    isAssign,
    isMovement,
    isVoidType,
} from './generated/ast.js'
import type { RobotScriptServices } from './robot-script-module.js'
import { evalBin, evalUn } from './robot-script-utils.js'
import { TreeScope } from './tree-scope.js'

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobotScriptServices) {
    const registry = services.validation.ValidationRegistry
    const validator = services.validation.RobotScriptValidator
    const checks: ValidationChecks<RobotScriptAstType> = {
        EntryPoint: [
            validator.checkMainDefined,
            validator.checkFunDefDuplicate,
            validator.checkScope,
        ],
        FunDef: [validator.checkMainSignature, validator.checkReturn],
        FunCall: [
            validator.checkFunCallParamNumber,
            validator.checkFunCallNotMain,
        ],
        VarDecl: [validator.checkVarDeclInsideBlock],
        Expression: [validator.checkFunCallExprNotVoid],
    }
    registry.register(checks, validator)
}

/**
 * Implementation of custom validations.
 */
export class RobotScriptValidator {
    checkMainDefined(ep: EntryPoint, accept: ValidationAcceptor): void {
        ;(ep.funs && ep.funs.find((fun) => fun && fun.name === 'main')) ||
            accept('error', "Function 'main' is not defined.", {
                node: ep,
                range: {
                    start: { line: 0, character: 0 },
                    end: { line: 0, character: 0 },
                },
            })
    }

    checkFunDefDuplicate(ep: EntryPoint, accept: ValidationAcceptor): void {
        const funSet = new Set<string>()
        ep.funs &&
            ep.funs.forEach((fun) => {
                if (fun && fun.name) {
                    !funSet.has(fun.name) ||
                        accept('error', `Duplicate function '${fun.name}'.`, {
                            node: fun,
                            property: 'name',
                        })
                    funSet.add(fun.name)
                }
            })
    }

    checkScope(ep: EntryPoint, accept: ValidationAcceptor): void {
        ep.funs &&
            ep.funs.forEach((fun) => {
                fun && this.checkScopeFun(fun, accept)
            })
    }

    private checkScopeFun(fun: FunDef, accept: ValidationAcceptor): void {
        const scope: TreeScope = new TreeScope()

        fun.params &&
            fun.params.forEach((param) => {
                if (param && param.name) {
                    scope.addDecl(param) ||
                        accept(
                            'error',
                            `Duplicate parameter '${param.name}'.`,
                            {
                                node: param,
                                property: 'name',
                            }
                        )
                }
            })

        fun.body && this.checkScopeStatement(fun.body, accept, scope)
    }

    private checkScopeStatement(
        stmt: Statement,
        accept: ValidationAcceptor,
        outScope: TreeScope
    ): void {
        if (isBlock(stmt)) {
            const scope = isFunDef(stmt.$container)
                ? outScope
                : new TreeScope(outScope)

            stmt.stmts &&
                stmt.stmts.forEach((stmt) => {
                    stmt && this.checkScopeStatement(stmt, accept, scope)
                })

            scope.getLocalUnused().forEach((varDecl) => {
                accept('warning', `Unused variable '${varDecl.name}'.`, {
                    node: varDecl,
                    property: 'name',
                    tags: [1],
                })
            })
        } else if (isVarDecl(stmt)) {
            isVarDeclInit(stmt) && stmt.expr && this.checkScopeExpr(stmt.expr, accept, outScope)
            if (stmt.name) {
                outScope.addDecl(stmt) ||
                    accept('error', `Duplicate variable '${stmt.name}'.`, {
                        node: stmt,
                        property: 'name',
                    })
            }
        } else if (isWhileStmt(stmt)) {
            stmt.expr && this.checkScopeExpr(stmt.expr, accept, outScope)
            stmt.stmt && this.checkScopeStatement(stmt.stmt, accept, outScope)
        } else if (isIfStmt(stmt)) {
            stmt.expr && this.checkScopeExpr(stmt.expr, accept, outScope)
            stmt.stmt1 && this.checkScopeStatement(stmt.stmt1, accept, outScope)
            stmt.stmt2 && this.checkScopeStatement(stmt.stmt2, accept, outScope)
        } else if (isFunCall(stmt)) {
            this.checkScopeExpr(stmt, accept, outScope)
        } else if (isAssign(stmt) || isMovement(stmt) || isReturnStmt(stmt)) {
            stmt.expr && this.checkScopeExpr(stmt.expr, accept, outScope)
        }
    }

    private checkScopeExpr(
        expr: Expression,
        accept: ValidationAcceptor,
        scope: TreeScope
    ): void {
        if (isFunCall(expr)) {
            expr.params &&
                expr.params.forEach((arg) => {
                    arg && this.checkScopeExpr(arg, accept, scope)
                })
        } else if (isBinExpr(expr)) {
            expr.expr1 && this.checkScopeExpr(expr.expr1, accept, scope)
            expr.expr2 && this.checkScopeExpr(expr.expr2, accept, scope)
        } else if (isUnExpr(expr)) {
            expr.expr && this.checkScopeExpr(expr.expr, accept, scope)
        } else if (isRef(expr) && expr.val && expr.val.ref) {
            const name = expr.val.ref.name
            ;(name && scope.addUse(name)) ||
                accept('error', `Variable '${name}' used before declaration.`, {
                    node: expr,
                    property: 'val',
                })
        }
    }

    checkMainSignature(fun: FunDef, accept: ValidationAcceptor): void {
        if (fun.name === 'main') {
            ;(fun.params && fun.params.length === 0) ||
                accept('error', "Function 'main' cannot have parameters.", {
                    node: fun,
                    property: 'name',
                })
            ;(fun.type && isVoidType(fun.type)) ||
                accept('error', "Function 'main' must return void.", {
                    node: fun,
                    property: 'name',
                })
        }
    }

    checkReturn(fun: FunDef, accept: ValidationAcceptor): void {
        if (fun.name && fun.body && fun.type && fun.type) {
            this.checkReturnRec(fun.body, accept, fun.type) ||
                isVoidType(fun.type) ||
                accept(
                    'error',
                    `Function '${fun.name}' must return a value of type '${fun.type.name}'.`,
                    { node: fun, property: 'type' }
                )
        }
    }

    private checkReturnRec(
        stmt: Statement,
        accept: ValidationAcceptor,
        retType: AnyType
    ): boolean {
        if (isReturnStmt(stmt)) {
            if (stmt.expr && isVoidType(retType)) {
                accept('error', "Cannot assign a value to type 'void'.", {
                    node: stmt,
                })
            } else if (!stmt.expr && !isVoidType(retType)) {
                retType.name &&
                    accept(
                        'error',
                        `Cannot assign a value of type 'void' to type '${retType.name}'.`,
                        { node: stmt }
                    )
            }
            return true
        } else if (isWhileStmt(stmt) && stmt.expr) {
            const cond = this.reduceExpr(stmt.expr)

            if (cond !== undefined && !cond) {
                accept(
                    'warning',
                    'Loop condition will always evaluate to false.',
                    {
                        node: stmt.expr,
                        tags: [1],
                    }
                )
                stmt.stmt &&
                    accept('warning', 'Unreachable code.', {
                        node: stmt.stmt,
                        tags: [1],
                    })
            } else if (stmt.stmt) {
                return (
                    this.checkReturnRec(stmt.stmt, accept, retType) &&
                    cond !== undefined // if cond is undefined we cannot be sure that the loop will run
                )
            }
        } else if (isIfStmt(stmt) && stmt.expr) {
            const cond = this.reduceExpr(stmt.expr)
            if (cond !== undefined) {
                accept(
                    'warning',
                    `If condition will always evaluate to ${!!cond}.`,
                    {
                        node: stmt.expr,
                        tags: [1],
                    }
                )
            }
            if (cond === undefined) {
                const elseRet =
                    stmt.stmt2 !== undefined &&
                    this.checkReturnRec(stmt.stmt2, accept, retType)
                const ifRet =
                    stmt.stmt1 &&
                    this.checkReturnRec(stmt.stmt1, accept, retType)
                return elseRet && ifRet
            } else if (cond) {
                stmt.stmt2 &&
                    accept('warning', 'Unreachable code.', {
                        node: stmt.stmt2,
                        tags: [1],
                    })
                return (
                    stmt.stmt1 &&
                    this.checkReturnRec(stmt.stmt1, accept, retType)
                )
            } else {
                stmt.stmt1 &&
                    accept('warning', 'Unreachable code.', {
                        node: stmt.stmt1,
                        tags: [1],
                    })
                return (
                    stmt.stmt2 !== undefined &&
                    this.checkReturnRec(stmt.stmt2, accept, retType)
                )
            }
        } else if (isBlock(stmt) && stmt.stmts && stmt.stmts.length > 0) {
            const retStmt = stmt.stmts.find(
                (stmt) => stmt && this.checkReturnRec(stmt, accept, retType)
            )

            if (
                retStmt &&
                retStmt.$containerIndex !== undefined &&
                retStmt.$containerIndex !== stmt.stmts.length - 1
            ) {
                const startNode =
                    stmt.stmts[retStmt.$containerIndex + 1].$cstNode
                const endNode = stmt.stmts[stmt.stmts.length - 1].$cstNode

                startNode &&
                    endNode &&
                    accept('warning', 'Unreachable code.', {
                        node: stmt,
                        range: {
                            start: startNode.range.start,
                            end: endNode.range.end,
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
        } else if (isUnExpr(expr) && expr.expr) {
            const val = this.reduceExpr(expr.expr)
            if (val !== undefined && expr.op) {
                return evalUn(expr.op, val)
            }
        } else if (isBinExpr(expr) && expr.expr1 && expr.expr2) {
            const val1 = this.reduceExpr(expr.expr1)
            const val2 = this.reduceExpr(expr.expr2)
            if (val1 !== undefined && val2 !== undefined && expr.op) {
                try {
                    return evalBin(expr.op, val1, val2)
                } catch (e: any) {
                    // division by zero
                    return undefined
                }
            }
        }
        return undefined
    }

    checkFunCallParamNumber(call: FunCall, accept: ValidationAcceptor): void {
        if (
            call.fun &&
            call.fun.ref &&
            call.fun.ref.params &&
            call.fun.ref.name &&
            call.params
        ) {
            const ref = call.fun.ref
            const expected = ref.params.length
            const actual = call.params.length
            expected === actual ||
                accept(
                    'error',
                    `Function '${ref.name}' expects ${expected} parameter${
                        expected === 1 ? '' : 's'
                    }, but ${actual} ${actual === 1 ? 'was' : 'were'} given.`,
                    { node: call, property: 'params' }
                )
        }
    }

    checkFunCallNotMain(call: FunCall, accept: ValidationAcceptor): void {
        if (call.fun && call.fun.ref) {
            call.fun.ref.name !== 'main' ||
                accept('error', "Function 'main' cannot be called.", {
                    node: call,
                    property: 'fun',
                })
        }
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

    checkFunCallExprNotVoid(
        expr: Expression,
        accept: ValidationAcceptor
    ): void {
        if (
            isFunCall(expr) &&
            expr.fun &&
            expr.fun.ref &&
            expr.fun.ref.name &&
            expr.fun.ref.type &&
            !isBlock(expr.$container)
        ) {
            if (expr.fun.ref.type.name === 'void') {
                accept(
                    'error',
                    `Function ${expr.fun.ref.name} cannot be used as an expression.`,
                    {
                        node: expr,
                        property: 'fun',
                    }
                )
            }
        }
    }
}
