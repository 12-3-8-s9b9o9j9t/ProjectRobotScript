import { Command } from 'commander'
import { RobotScriptLanguageMetaData } from '../language/generated/module.js'
import { createRobotScriptServices } from '../language/robot-script-module.js'
import { extractAstNode, extractDestinationAndName, extractDocument } from './cli-util.js'
import { NodeFileSystem } from 'langium/node'
import * as url from 'node:url'
import * as fs from 'node:fs'
import * as fsp from 'node:fs/promises'
import * as path from 'node:path'
//import { InterpretorVisitor } from '../semantics/interpretor-visitor.js'
//import { EntryPointVisitor } from '../semantics/visitor.js'
import chalk from 'chalk'
import { generateScene } from './generator.js'

import { EntryPoint } from '../language/generated/ast.js'

const __dirname = url.fileURLToPath(new URL('.', import.meta.url))

const packagePath = path.resolve(__dirname, '..', '..', 'package.json')
const packageContent = await fsp.readFile(packagePath, 'utf-8')

export const generate = async (
    fileName: string,
    opts: GenerateOptions
): Promise<void> => {
    const services = createRobotScriptServices(NodeFileSystem).RobotScript
    const ep = await extractAstNode<EntryPoint/*Visitor*/>(fileName, services)

    const data = extractDestinationAndName(fileName, opts.destination)
    const generatedFilePath = `${path.join(data.destination, data.name)}.json`

    if (!fs.existsSync(data.destination)) {
        fs.mkdirSync(data.destination, { recursive: true })
    }

    const res = generateScene(ep)

    fs.writeFileSync(generatedFilePath, JSON.stringify(res, undefined, 2))

    console.log(
        chalk.green(`Scene generated successfully: ${generatedFilePath}`)
    )

    //const visitor = new InterpretorVisitor()
    //visitor.visitEntryPoint(ep)
}

export type GenerateOptions = {
    destination?: string
}

export const validate = async (fileName: string): Promise<void> => {
    // retrieve the services for our language
    const services = createRobotScriptServices(NodeFileSystem).RobotScript
    // extract a document for our program
    const document = await extractDocument(fileName, services)
    // extract the parse result details
    const parseResult = document.parseResult
    // verify no lexer, parser, or general diagnostic errors show up
    if (
        parseResult.lexerErrors.length === 0 &&
        parseResult.parserErrors.length === 0
    ) {
        console.log(
            chalk.green(`Parsed and validated ${fileName} successfully!`)
        )
    } else {
        console.log(chalk.red(`Failed to parse and validate ${fileName}!`))
    }
}

export default function (): void {
    const program = new Command()

    program.version(JSON.parse(packageContent).version)

    const fileExtensions = RobotScriptLanguageMetaData.fileExtensions.join(', ')
    program
        .command('generate')
        .argument(
            '<file>',
            `source file (possible file extensions: ${fileExtensions})`
        )
        .option(
            '-d, --destination <dir>',
            'destination directory of generating'
        )
        .description('generates scene from source file for simulation')
        .action(generate)

    program
        .command('validate')
        .argument(
            '<file>',
            `Source file to parse & validate (ending in ${fileExtensions})`
        )
        .description(
            'Indicates where a program parses & validates successfully, but produces no output code'
        )
        .action(validate)

    program.parse(process.argv)
}
