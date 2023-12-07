import { EntryPointVisitor, RoboScriptVisitor } from './visitor.js'

export class InterpretorVisitor implements RoboScriptVisitor {
    visitEntryPoint(node: EntryPointVisitor) {
        console.log(node.funs)
    }
}
