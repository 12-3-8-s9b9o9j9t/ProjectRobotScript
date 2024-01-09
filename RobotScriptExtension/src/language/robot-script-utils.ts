import { BinExpr, UnExpr } from './generated/ast.js'

export class DivisionByZeroError extends Error {}

/**
 * Permet d'évaluer une expression binaire en ne tenant pas compte du type
 * @param op L'opérateur
 * @param a Le premier opérande
 * @param b Le second opérande
 * @returns Le résultat de l'opération
 *
 * @throws `DivisionByZeroError` Si une division par zéro est détectée
 */
export function evalBin(
    op: BinExpr['op'],
    a: number | boolean,
    b: number | boolean,
): number | boolean {
    switch (op) {
        case '+':
            return +a + +b
        case '-':
            return +a - +b
        case '*':
            return +a * +b
        case '/':
            if (b === 0) {
                throw new DivisionByZeroError('Division by zero')
            }
            return +a / +b
        case '%':
            if (b === 0) {
                throw new DivisionByZeroError('Division by zero')
            }
            return +a % +b
        case '==':
            return a == b
        case '!=':
            return a != b
        case '<':
            return a < b
        case '>':
            return a > b
        case '<=':
            return a <= b
        case '>=':
            return a >= b
        case '&&':
            return !!(a && b)
        case '||':
            return !!(a || b)
    }
}

/**
 * Permet d'évaluer une expression unaire en ne tenant pas compte du type
 * @param op L'opérateur
 * @param a L'opérande
 * @returns Le résultat de l'opération
 */
export function evalUn(op: UnExpr['op'], a: number | boolean): number | boolean {
    switch (op) {
        case '-':
            return -a
        case '!':
            return !a
    }
}
