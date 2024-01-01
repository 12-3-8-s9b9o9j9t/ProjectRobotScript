import type { AstNode, LangiumDocument, ValidationAcceptor, ValidationChecks } from 'langium'
import { AnyType, EntryPoint, Expression, FunCall, FunDef, RobotScriptAstType, Statement, VarDecl, isBinExpr, isBlock, isFunCall, isFunDef, isIfStmt, isLit, isRef, isReturnStmt, isUnExpr, isVarDecl, isWhileStmt, isVarDeclInit, isAssign, isMovement, isVoidType } from './generated/ast.js'
import type { RobotScriptServices } from './robot-script-module.js'
import { evalBin, evalUn } from './robot-script-utils.js'
import { SymbState, TreeScope } from './tree-scope.js'

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobotScriptServices) {
    const registry = services.validation.ValidationRegistry
    const validator = services.validation.RobotScriptValidator
    const checks: ValidationChecks<RobotScriptAstType> = {
        EntryPoint: [validator.checkScope],
        FunDef: [
            validator.checkMainSignature,
            validator.checkReturn
        ],
        FunCall: [validator.checkFunCallParamNumber],
        VarDecl: [validator.checkVarDeclInsideBlock],
        Expression: [validator.checkFunCallExprNotVoid]
    }
    registry.register(checks, validator)
}

export interface DocWithScope<T extends AstNode> extends LangiumDocument<T> {
    scope: TreeScope
}

/**
 * Implementation of custom validations.
 */
export class RobotScriptValidator {

    checkScope(ep: EntryPoint, accept: ValidationAcceptor): void {
        const scope = TreeScope.createRoot()
        ep.funs?.forEach((fun) => {
            if (fun?.name) {
                scope.addSymb(fun, true) ||
                    accept('error', `Duplicate function '${fun.name}'.`, {
                        node: fun,
                        property: 'name',
                    })
                this.checkScopeFun(fun, accept, scope)
            }
        })

        const main = ep.funs?.find((fun) => fun?.name === 'main')
        if (main) {
            scope.setState(main, SymbState.used)
        } else {
            accept('error', "Function 'main' is not defined.", {
                node: ep,
                range: {
                    start: { line: 0, character: 0 },
                    end: { line: 0, character: 0 },
                }
            })
        }

        scope.getLocalUnused().forEach((def) => {
            def.name &&
                accept('warning', `Unused function '${def.name}'.`, {
                    node: def,
                    property: 'name',
                    tags: [1],
                })
        })

        const doc = ep.$document as DocWithScope<EntryPoint>
        doc.scope = scope
    }

    private checkScopeFun(
        fun: FunDef,
        accept: ValidationAcceptor,
        outScope: TreeScope
    ): void {
        const scope = outScope.createChild(fun)

        fun.params?.forEach((param) => {
            if (param?.name && !scope.addSymb(param, true)) {
                accept('error', `Duplicate parameter '${param.name}'.`, {
                    node: param,
                    property: 'name',
                })
            }
        })

        this.checkScopeStatement(fun.body, accept, scope)
    }

    private checkScopeStatement(
        stmt: Statement,
        accept: ValidationAcceptor,
        outScope: TreeScope
    ): void {
        if (isBlock(stmt)) {
            const scope = isFunDef(stmt.$container)
                ? outScope
                : outScope.createChild(stmt)

            stmt.stmts?.forEach((stmt) => {
                this.checkScopeStatement(stmt, accept, scope)
            })

            scope.getLocalUnused().forEach((def) => {
                accept('warning', `Unused ${isFunDef(def.$container) ? 'parameter' : 'variable'} '${def.name}'.`, {
                    node: def,
                    property: 'name',
                    tags: [1],
                })
            })
        } else if (isVarDecl(stmt)) {
            isVarDeclInit(stmt) && this.checkScopeExpr(stmt.expr, accept, outScope)
            if (stmt.name && !outScope.addSymb(stmt, isVarDeclInit(stmt))) {
                accept('error', `Duplicate variable '${stmt.name}'.`, {
                    node: stmt,
                    property: 'name',
                })
            }
        } else if (isWhileStmt(stmt)) {
            this.checkScopeExpr(stmt.expr, accept, outScope)
            this.checkScopeStatement(stmt.stmt, accept, outScope)
        } else if (isIfStmt(stmt)) {
            this.checkScopeExpr(stmt.expr, accept, outScope)
            this.checkScopeStatement(stmt.stmt1, accept, outScope)
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
        if (isFunCall(expr) && expr.fun?.ref) {
            const ref = expr.fun.ref
            if (ref.name === 'main') {
                accept('error', "Function 'main' cannot be called.", {
                    node: expr,
                    property: 'fun',
                })
            } else {
                scope.setState(ref, SymbState.used)
                expr.params?.forEach((param) => {
                    this.checkScopeExpr(param, accept, scope)
                })
            }
        } else if (isBinExpr(expr)) {
            this.checkScopeExpr(expr.expr1, accept, scope)
            this.checkScopeExpr(expr.expr2, accept, scope)
        } else if (isUnExpr(expr)) {
            this.checkScopeExpr(expr.expr, accept, scope)
        } else if (isRef(expr) && expr.val?.ref) {
            const ref = expr.val.ref
            if (ref.name) {
                const state = scope.setState(ref, SymbState.used)
                if (state === SymbState.undefined) {
                    accept('error', `Variable '${ref.name}' used before being defined.`, {
                        node: expr,
                        property: 'val',
                    })
                } else if (state === SymbState.undeclared) {
                    accept('error', `Variable '${ref.name}' used before being declared.`, {
                        node: expr,
                        property: 'val',
                    })
                }
            }
        }
    }

    checkMainSignature(fun: FunDef, accept: ValidationAcceptor): void {
        if (fun.name === 'main') {
            fun.params?.length === 0 ||
                accept('error', "Function 'main' cannot have parameters.", {
                    node: fun,
                    property: 'name',
                })

            isVoidType(fun.type) ||
                accept('error', "Function 'main' must return void.", {
                    node: fun,
                    property: 'name',
                })
        }
    }

    checkReturn(fun: FunDef, accept: ValidationAcceptor): void {
        if (fun.name) {
            this.checkReturnRec(fun.body, accept, fun.type) ||
                isVoidType(fun.type) ||
                accept('error',
                    `Function '${fun.name}' must return a value of type '${fun.type.name}'.`,
                    { node: fun, property: 'type' }
                )
        }
    }

    private checkReturnRec(
        stmt: Statement,
        accept: ValidationAcceptor,
        type: AnyType
    ): boolean {
        if (isReturnStmt(stmt)) {
            if (stmt.expr && isVoidType(type)) {
                accept('error', "Cannot assign a value to type 'void'.", {
                    node: stmt,
                })
            } else if (!stmt.expr && !isVoidType(type)) {
                type?.name &&
                    accept('error',
                        `Cannot assign a value of type 'void' to type '${type.name}'.`,
                        { node: stmt }
                    )
            }
            return true
        } else if (isWhileStmt(stmt)) {
            const cond = this.reduceExpr(stmt.expr)

            if (cond !== undefined && !cond) {
                accept('warning', 'Loop condition will always evaluate to false.', {
                    node: stmt.expr,
                    tags: [1],
                })
                stmt.stmt &&
                    accept('warning', 'Unreachable code.', {
                        node: stmt.stmt,
                        tags: [1],
                    })
            } else if (stmt.stmt) {
                return (
                    this.checkReturnRec(stmt.stmt, accept, type) &&
                    cond !== undefined // if cond is undefined we cannot be sure that the loop will run
                )
            }
        } else if (isIfStmt(stmt)) {
            const cond = this.reduceExpr(stmt.expr)
            if (cond !== undefined) {
                accept('warning', `If condition will always evaluate to ${!!cond}.`, {
                    node: stmt.expr,
                    tags: [1],
                })
            }
            if (cond === undefined) {
                const ifRet = this.checkReturnRec(stmt.stmt1, accept, type)
                const elseRet =
                    stmt.stmt2 !== undefined &&
                    this.checkReturnRec(stmt.stmt2, accept, type)
                return ifRet && elseRet
            } else if (cond) {
                stmt.stmt2 &&
                    accept('warning', 'Unreachable code.', {
                        node: stmt.stmt2,
                        tags: [1],
                    })
                return this.checkReturnRec(stmt.stmt1, accept, type)
            } else {
                stmt.stmt1 &&
                    accept('warning', 'Unreachable code.', {
                        node: stmt.stmt1,
                        tags: [1],
                    })
                return (
                    stmt.stmt2 !== undefined &&
                    this.checkReturnRec(stmt.stmt2, accept, type)
                )
            }
        } else if (isBlock(stmt) && stmt.stmts?.length > 0) {
            const retStmt = stmt.stmts.find(
                (stmt) => this.checkReturnRec(stmt, accept, type)
            )

            if (
                retStmt?.$containerIndex !== undefined &&
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
        } else if (isUnExpr(expr)) {
            const val = this.reduceExpr(expr.expr)
            if (val !== undefined && expr.op) {
                return evalUn(expr.op, val)
            }
        } else if (isBinExpr(expr)) {
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
            call.fun.ref?.params &&
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
            expr.fun.ref?.name &&
            expr.fun.ref.type?.name === 'void' &&
            !isBlock(expr.$container)
        ) {
            accept('error', `Function ${expr.fun.ref.name} cannot be used as an expression.`, {
                node: expr,
                property: 'fun',
            })
        }
    }
}
