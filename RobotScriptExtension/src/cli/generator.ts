import { EntryPoint } from '../language/generated/ast.js'

export function generateScene(ep: EntryPoint): Object {
    return ep.funs.map((fun) => {
        return {
            name: fun.name,
            params: fun.params.map((p) => {return {name: p.name, type: p.type.name}}),
            type: fun.type.name,
        }
    })
}

