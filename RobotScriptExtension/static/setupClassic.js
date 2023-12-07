import { addMonacoStyles, defineUserServices, MonacoEditorLanguageClientWrapper } from './bundle/index.js';
import monarchSyntax from "../syntaxes/robot-script.monarch.js";
import { configureWorker } from './setup.js';

addMonacoStyles('monaco-editor-styles');

export const setupConfigClassic = () => {
    return {
        wrapperConfig: {
            serviceConfig: defineUserServices(),
            editorAppConfig: {
                $type: 'classic',
                languageId: 'robot-script',
                code: `// RobotScript is running in the web!`,
                useDiffEditor: false,
                languageExtensionConfig: { id: 'langium' },
                languageDef: monarchSyntax,
                editorOptions: {
                    'semanticHighlighting.enabled': true,
                    theme: 'vs-dark'
                }
            }
        },
        languageClientConfig: configureWorker()
    };
};

const typecheck = (async () => {
    console.info('typechecking current code...');

    // To implement (Bonus)
    
    if(errors.length > 0){
        const modal = document.getElementById("errorModal");
        modal.style.display = "block";
    } else {
        const modal = document.getElementById("validModal");
        modal.style.display = "block";
    }
});

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
window.typecheck = typecheck;
window.parseAndValidate = parseAndValidate;
window.setupSimulator = setupSimulator;

var errorModal = document.getElementById("errorModal");
var validModal = document.getElementById("validModal");
var closeError = document.querySelector("#errorModal .close");
var closeValid = document.querySelector("#validModal .close");
closeError.onclick = function() {
    errorModal.style.display = "none";
}
closeValid.onclick = function() {
    validModal.style.display = "none";
}
window.onclick = function(event) {
    if (event.target == validModal) {
        validModal.style.display = "none";
    }
    if (event.target == errorModal) {
        errorModal.style.display = "none";
    }
  } 

export const executeClassic = async (htmlElement) => {
    const userConfig = setupConfigClassic();
    const wrapper = new MonacoEditorLanguageClientWrapper();
    await wrapper.start(userConfig, htmlElement);
};
