import { Command } from 'commander'
import { RobotScriptLanguageMetaData } from '../language/generated/module.js'
import { createRobotScriptServices } from '../language/robot-script-module.js'
import { extractAstNode, extractDestinationAndName, extractDocument } from './cli-util.js'
import { NodeFileSystem } from 'langium/node'
import * as url from 'node:url'
import * as fsp from 'node:fs/promises'
import * as fs from 'node:fs'
import * as path from 'node:path'
import chalk from 'chalk'

import { EntryPoint } from '../semantics/visitor.js';
import { Compiler } from '../semantics/compiler.js'
import { DocWithScope } from '../language/robot-script-validator.js'

const __dirname = url.fileURLToPath(new URL('.', import.meta.url))

const packagePath = path.resolve(__dirname, '..', '..', 'package.json')
const packageContent = await fsp.readFile(packagePath, 'utf-8')

export const compileAction = async (fileName: string, opts: GenerateOptions): Promise<void> => {
    const services = createRobotScriptServices(NodeFileSystem).RobotScript;
    const ep = await extractAstNode<EntryPoint>(fileName, services);
    
    const data = extractDestinationAndName(fileName, opts.destination);
    const generatedFilePath = `${path.join(data.destination, data.name)}.ino`;

    if (!fs.existsSync(data.destination)) {
        fs.mkdirSync(data.destination, { recursive: true });
    }

    const scope = (ep.$document as DocWithScope<EntryPoint>).scope;

    const compiler = new Compiler(scope);
    const result = compiler.visitEntryPoint(ep);

    fs.writeFileSync(generatedFilePath, result);
    
    console.log(chalk.green(`Program compiled successfully: ${generatedFilePath}`));
};

export type GenerateOptions = {
    destination?: string
}

export const validateAction = async (fileName: string): Promise<void> => {
    // retrieve the services for our language
    const services = createRobotScriptServices(NodeFileSystem).RobotScript
    // extract a document for our program
    const document = await extractDocument(fileName, services)
    // extract the parse result details
    const parseResult = document.parseResult
    // verify no lexer, parser, or general diagnostic errors show up
    if (
        parseResult.lexerErrors.length === 0 &&
        parseResult.parserErrors.length === 0 &&
        document.diagnostics?.filter(d => d.severity === 1 /*Error*/).length === 0
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
        .command('compile')
        .argument('<file>', `source file (possible file extensions: ${fileExtensions})`)
        .option('-d, --destination <dir>', 'destination directory of generating')
        .description('generates arduino code from a given source file')
        .action(compileAction);

    program
        .command('validate')
        .argument('<file>', `Source file to parse & validate (ending in ${fileExtensions})`)
        .description('Indicates where a program parses & validates successfully, but produces no output code')
        .action(validateAction)

    program.parse(process.argv)
}
