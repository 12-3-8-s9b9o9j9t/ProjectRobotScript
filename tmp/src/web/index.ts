import { AstNode, EmptyFileSystem, LangiumServices } from 'langium'
import { URI } from 'vscode-uri'
import { createRobotScriptServices } from '../language/robot-script-module.js'
import { EntryPoint } from '../language/generated/ast.js'
import { generateScene } from '../cli/generator.js'

/**
 * Extracts an AST node from a virtual document, represented as a string
 * @param content Content to create virtual document from
 * @param services For constructing & building a virtual document
 * @returns A promise for the parsed result of the document
 */
async function extractAstNodeFromString<T extends AstNode>(
    content: string,
    services: LangiumServices
): Promise<T> {
    // create a document from a string instead of a file
    const doc = services.shared.workspace.LangiumDocumentFactory.fromString(
        content,
        URI.parse('memory://robot-script.document')
    )
    // proceed with build & validation
    await services.shared.workspace.DocumentBuilder.build([doc], {
        validation: true,
    })
    // get the parse result (root of our AST)
    return doc.parseResult?.value as T
}

export async function parseAndGenerate(program: string): Promise<Object> {
    const services = createRobotScriptServices(EmptyFileSystem).RobotScript
    const ep = await extractAstNodeFromString<EntryPoint>(program, services)

    const scene = generateScene(ep)
    return Promise.resolve(scene)
}
