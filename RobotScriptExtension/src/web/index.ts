import { AstNode, EmptyFileSystem, LangiumServices } from "langium";
import { URI } from "vscode-uri";
import { createRobotScriptServices } from "../language/robot-script-module.js";
import { EntryPoint } from "../semantics/visitor.js";
import { Scene } from "./simulator/scene.js";
import { Interpreter } from "../semantics/interpreter.js";
import { DocWithScope } from "../language/robot-script-validator.js";

/**
 * Extracts an AST node from a virtual document, represented as a string
 * @param content Content to create virtual document from
 * @param services For constructing & building a virtual document
 * @returns A promise for the parsed result of the document
 */
 async function extractAstNodeFromString<T extends AstNode>(content: string, services: LangiumServices): Promise<T> {
    // create a document from a string instead of a file
    const doc = services.shared.workspace.LangiumDocumentFactory.fromString(content, URI.parse('memory://robot-script.document'));
    // proceed with build & validation
    await services.shared.workspace.DocumentBuilder.build([doc], { validation: true });
    // get the parse result (root of our AST)
    return doc.parseResult?.value as T;
}

/**
 * Parses a RobotScript program & generates output as a Scene
 * @param code RobotScript program to parse
 * @returns Generated scene from this RobotScript program
 */
export async function generateScene (code: string): Promise<Scene> {
    const services = createRobotScriptServices(EmptyFileSystem).RobotScript;
    const ep = await extractAstNodeFromString<EntryPoint>(code, services);

    const interpreter = new Interpreter();
    const scene = interpreter.visitEntryPoint(ep);
    return Promise.resolve(scene);
}

export async function validateCode (code: string): Promise<string[]> {
    const err: string[] = [];
    const services = createRobotScriptServices(EmptyFileSystem).RobotScript;
    const doc = services.shared.workspace.LangiumDocumentFactory.fromString(code, URI.parse('memory://robot-script.document')) as DocWithScope<EntryPoint>;
    await services.shared.workspace.DocumentBuilder.build([doc], { validation: true });
    const parseResult = doc.parseResult;
    parseResult.lexerErrors.forEach(e => err.push(e.message));
    parseResult.parserErrors.forEach(e => err.push(e.message));
    doc.diagnostics?.filter(d => d.severity && d.severity <= 2 /*Error*/).forEach(e => err.push(e.message));

    const scope = doc.scope;
    scope.getLocalUnused().forEach(e => err.push(`The Scope is Real, Unused variable: ${e.name}`));
    return Promise.resolve(err);
}

