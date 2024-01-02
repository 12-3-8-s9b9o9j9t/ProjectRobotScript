import { AstNode, EmptyFileSystem } from "langium";
import { URI } from "vscode-uri";
import { createRobotScriptServices } from "../language/robot-script-module.js";
import { EntryPoint } from "../semantics/visitor.js";
import { Scene } from "./simulator/scene.js";
import { Interpreter } from "../semantics/interpreter.js";
import { DocWithScope } from "../language/robot-script-validator.js";


 async function documentFromString<T extends AstNode>(content: string): Promise<DocWithScope<T>> {
    const services = createRobotScriptServices(EmptyFileSystem).RobotScript;
    // create a document from a string instead of a file
    const doc = services.shared.workspace.LangiumDocumentFactory.fromString(content, URI.parse('memory://robot-script.document'));
    // proceed with build & validation
    await services.shared.workspace.DocumentBuilder.build([doc], { validation: true });
    return doc as DocWithScope<T>;
}

export async function validateCode (code: string): Promise<string[]> {
    const err: string[] = [];
    const doc = await documentFromString<EntryPoint>(code);
    const parseResult = doc.parseResult;
    parseResult.lexerErrors.forEach(e => err.push(e.message));
    parseResult.parserErrors.forEach(e => err.push(e.message));
    doc.diagnostics?.filter(d => d.severity && d.severity <= 2 /*Error*/).forEach(e => err.push(e.message));

    const scope = doc.scope;
    scope.getLocalUnused().forEach(e => err.push(`The Scope is Real, Unused variable: ${e.name}`));
    return Promise.resolve(err);
}

/**
 * Parses a RobotScript program & generates output as a Scene
 * @param code RobotScript program to parse
 * @returns Generated scene from this RobotScript program
 */
export async function generateScene (code: string): Promise<Scene> {
    const doc = await documentFromString<EntryPoint>(code);
    const scope = doc.scope;
    const ep = doc.parseResult.value;
    const interpreter = new Interpreter(scope);
    const scene = interpreter.visitEntryPoint(ep);
    return Promise.resolve(scene);
}
