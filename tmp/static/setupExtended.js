import { addMonacoStyles, defineUserServices, MonacoEditorLanguageClientWrapper } from './bundle/index.js';
import { configureWorker } from './setup.js';
import { code } from './baseCode.js';

addMonacoStyles('monaco-editor-styles');

export const setupConfigExtended = () => {
    const extensionFilesOrContents = new Map();
    const languageConfigUrl = new URL('../language-configuration.json', window.location.href);
    const textmateConfigUrl = new URL('../syntaxes/robot-script.tmLanguage.json', window.location.href);
    extensionFilesOrContents.set('/language-configuration.json', languageConfigUrl);
    extensionFilesOrContents.set('/robot-script-grammar.json', textmateConfigUrl);

    return {
        wrapperConfig: {
            serviceConfig: defineUserServices(),
            editorAppConfig: {
                $type: 'extended',
                languageId: 'robot-script',
                code,
                useDiffEditor: false,
                extensions: [{
                    config: {
                        name: 'robot-script-web',
                        publisher: 'generator-langium',
                        version: '1.0.0',
                        engines: {
                            vscode: '*'
                        },
                        contributes: {
                            languages: [{
                                id: 'robot-script',
                                extensions: [
                                    '.robot-script'
                                ],
                                configuration: './language-configuration.json'
                            }],
                            grammars: [{
                                language: 'robot-script',
                                scopeName: 'source.robot-script',
                                path: './robot-script-grammar.json'
                            }]
                        }
                    },
                    filesOrContents: extensionFilesOrContents,
                }],
                editorOptions: {
                    'semanticHighlighting.enabled': true,
                    theme: 'vs-dark',
                    fontSize: 18,
                }
            }
        },
        languageClientConfig: configureWorker()
    };
};

export const executeExtended = async (htmlElement) => {
    const userConfig = setupConfigExtended();
    const wrapper = new MonacoEditorLanguageClientWrapper();
    await wrapper.start(userConfig, htmlElement);
};

const generateAndDisplay = (async () => {
    console.info('generating & running current code...');
    const value = client.editor.getValue();
    const minilogoCmds = await vscode.commands.executeCommand('parseAndGenerate', value);
    updateScene(minilogoCmds);
});

window.generateAndDisplay = generateAndDisplay;

function updateScene(cmds) {
    alert(JSON.stringify(cmds));
}
