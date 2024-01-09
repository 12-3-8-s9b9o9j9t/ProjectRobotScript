import { FC, useEffect, useRef } from 'react'
import { MonacoEditorLanguageClientWrapper, monaco } from 'monaco-editor-wrapper'
import { defaultCode } from '../default-code'
import monarchSyntax from '../../syntaxes/robot-script.monarch.js'

export type Editor = monaco.editor.IStandaloneCodeEditor

export interface MonacoEditorProps {
    onEditorDidMount: (editor: Editor | undefined) => void
}

const buildWorker = (url: URL, name: string) => {
    return new Worker(url.href, {
        type: 'classic',
        name,
    })
}

self.MonacoEnvironment = {
    getWorker(_, label) {
        console.log('getWorker: workerId: ' + _ + ' label: ' + label)
        let workerUrl: URL
        if (label === 'json') {
            workerUrl = new URL('../monaco-workers/jsonWorker-iife.js', import.meta.url)
        }
        if (label === 'css' || label === 'scss' || label === 'less') {
            workerUrl = new URL('../monaco-workers/cssWorker-iife.js', import.meta.url)
        }
        if (label === 'html' || label === 'handlebars' || label === 'razor') {
            workerUrl = new URL('../monaco-workers/htmlWorker-iife.js', import.meta.url)
        }
        if (label === 'typescript' || label === 'javascript') {
            workerUrl = new URL('../monaco-workers/tsWorker-iife.js', import.meta.url)
        }
        workerUrl = new URL('../monaco-workers/editorWorker-iife.js', import.meta.url)
        return buildWorker(workerUrl, label)
    },
}

//MonacoEditorLanguageClientWrapper.addMonacoStyles('monaco-editor-styles');

const client = new MonacoEditorLanguageClientWrapper()

const editorConfig = client.getEditorConfig()
editorConfig.setMainLanguageId('robot-script')
editorConfig.setMonarchTokensProvider(monarchSyntax)
editorConfig.setMainCode(defaultCode)
editorConfig.setTheme('vs-dark')
editorConfig.setUseLanguageClient(true)
editorConfig.setUseWebSocket(false)

const workerUrl = new URL('../ls-worker/robot-script-server-worker.js', import.meta.url)
const lsWorker = new Worker(workerUrl.href, {
    type: 'classic',
    name: 'RobotScript Language Server',
})
client.setWorker(lsWorker)

const MonacoEditor: FC<MonacoEditorProps> = ({ onEditorDidMount }) => {
    const rootRef = useRef<HTMLDivElement>(null)

    useEffect(() => {
        client
            .startEditor(rootRef.current!)
            .then((s) => {
                console.log(s)
                onEditorDidMount(client.getEditor())
            })
            .catch((e: Error) => console.error(e))
    }, [])

    return (
        <div className="flex h-full w-full flex-col">
            <div className="flex-grow" ref={rootRef} />
        </div>
    )
}

export default MonacoEditor
