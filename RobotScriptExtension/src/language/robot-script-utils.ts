import { BinExpr, UnExpr } from './generated/ast.js'

export function evalBin(
    op: BinExpr['op'],
    a: number | boolean,
    b: number | boolean
): number | boolean {
    switch (op) {
        case '+':
            return +a + +b
        case '-':
            return +a - +b
        case '*':
            return +a * +b
        case '/':
            return +a / +b
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
            return a && b
        case '||':
            return a || b
    }
}

export function evalUn(
    op: UnExpr['op'],
    a: number | boolean
): number | boolean {
    switch (op) {
        case '-':
            return -a
        case '!':
            return !a
    }
}
