import { vscode, addMonacoStyles, defineUserServices, MonacoEditorLanguageClientWrapper } from './bundle/index.js';
import monarchSyntax from "../syntaxes/robot-script.monarch.js";
import { configureWorker } from './setup.js';
import { code } from "./baseCode.js";

addMonacoStyles('monaco-editor-styles');

export const setupConfigClassic = () => {
    return {
        wrapperConfig: {
            serviceConfig: defineUserServices(),
            editorAppConfig: {
                $type: 'classic',
                languageId: 'robot-script',
                code,
                useDiffEditor: false,
                languageExtensionConfig: { id: 'langium' },
                languageDef: monarchSyntax,
                editorOptions: {
                    'semanticHighlighting.enabled': true,
                    theme: 'vs-dark',
                    fontSize: 16,
                },
            }
        },
        languageClientConfig: configureWorker()
    };
};


const parseAndValidate = (async () => {
    console.info('validating current code...');
    // To implement
});

const execute = (async () => {
    console.info('running current code...');
    // To implement
});

const setupSimulator = (scene) => {
    const wideSide = max(scene.size.x, scene.size.y);
    let factor = 1000 / wideSide;

    window.scene = scene;

    scene.entities.forEach((entity) => {
        if (entity.type === "Wall") {
            window.entities.push(new Wall(
                (entity.pos.x)*factor,
                (entity.pos.y)*factor,
                (entity.size.x)*factor,
                (entity.size.y)*factor
                ));
        }
        if (entity.type === "Block") {
            window.entities.push(new Wall(
                (entity.pos.x)*factor,
                (entity.pos.y)*factor,
                (entity.size.x)*factor,
                (entity.size.y)*factor
                ));
        }
    });

    window.p5robot = new Robot(
        factor,
        scene.robot.pos.x,
        scene.robot.pos.y,
        scene.robot.size.x * factor,
        scene.robot.size.y * factor,
        scene.robot.rad
    );
}

window.execute = execute;
//window.parseAndValidate = parseAndValidate;
window.setupSimulator = setupSimulator;


const generateAndDisplay = (async () => {
    console.info('generating & running current code...');
    const value = client.editor.getValue();
    const minilogoCmds = await vscode.commands.executeCommand('parseAndGenerate', value);
    updateScene(minilogoCmds);
});

window.parseAndValidate = generateAndDisplay;

function updateScene(cmds) {
    alert(JSON.stringify(cmds));
}

window.setupSimulator = setupSimulator;

export const executeClassic = async (htmlElement) => {
    const userConfig = setupConfigClassic();
    const wrapper = new MonacoEditorLanguageClientWrapper();
    await wrapper.start(userConfig, htmlElement);
};
