import { FC, useEffect } from "react";
import { MonacoEditorLanguageClientWrapper, monaco } from "monaco-editor-wrapper";
import { buildWorkerDefinition } from "monaco-editor-workers";
import { defaultCode } from "../default-code";
import monarchSyntax from "../../syntaxes/robot-script.monarch.js";

export type Editor = monaco.editor.IStandaloneCodeEditor;

export interface MonacoEditorProps {
    onEditorDidMount: (editor: Editor|undefined) => void;
}

buildWorkerDefinition('../../node_modules/monaco-editor-workers/dist/workers', import.meta.url, false);

//MonacoEditorLanguageClientWrapper.addMonacoStyles('monaco-editor-styles');

const client = new MonacoEditorLanguageClientWrapper()

const editorConfig = client.getEditorConfig()
editorConfig.setMainLanguageId('robot-script')
editorConfig.setMonarchTokensProvider(monarchSyntax)
editorConfig.setMainCode(defaultCode)
editorConfig.setTheme('vs-dark')
editorConfig.setUseLanguageClient(true)
editorConfig.setUseWebSocket(false)

const workerUrl = new URL('../worker/robot-script-server-worker.js', import.meta.url)
const lsWorker = new Worker(workerUrl.href, {
    type: 'classic',
    name: 'RobotScript Language Server'
})
client.setWorker(lsWorker)

const MonacoEditor: FC<MonacoEditorProps> = ({onEditorDidMount}) => {

    useEffect(() => {
        client.startEditor(document.getElementById('monaco-editor-root') as HTMLElement)
            .then((s) => {
                console.log(s)
                onEditorDidMount(client.getEditor())
            })
            .catch((e: Error) => console.error(e));
    }, [])
    
    return (
        <div className="editor">
            <div className="wrapper">
                <div id="monaco-editor-root"></div>
            </div>
        </div>
    )
}

export default MonacoEditor