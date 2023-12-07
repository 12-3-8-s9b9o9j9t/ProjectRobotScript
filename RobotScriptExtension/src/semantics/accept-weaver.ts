import type { ValidationAcceptor, ValidationChecks } from 'langium'
import type { RobotScriptAstType } from '../language/generated/ast.js'
import * as InterfaceAST from '../language/generated/ast.js'
import { EntryPointVisitor, RoboScriptVisitor } from './visitor.js'
import type { RobotScriptServices } from '../language/robot-script-module.js'

/**
 * Register custom validation checks.
 * TODO : Call this function in the language module.ts file (see registerValidationChecks(...);)
 */
export function weaveAcceptMethods(services: RobotScriptServices) {
    const registry = services.validation.ValidationRegistry
    const weaver = new RobotScriptAcceptWeaver()
    registry.register(weaver.checks, weaver)
}

/**
 * TODO :
 * You must implement a weaving function for each concrete concept of the language.
 * you will also need to fill the check data structure to map the weaving function to the Type of node
 */
export class RobotScriptAcceptWeaver {
    weaveEntryPoint(
        node: InterfaceAST.EntryPoint,
        accept: ValidationAcceptor
    ): void {
        ;(<any>node).accept = (visitor: RoboScriptVisitor) => {
            return visitor.visitEntryPoint(node as EntryPointVisitor)
        }
    }

    checks: ValidationChecks<RobotScriptAstType> = {
        EntryPoint: this.weaveEntryPoint,
    }
}
