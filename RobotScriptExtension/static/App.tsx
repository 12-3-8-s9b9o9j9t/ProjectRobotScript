import { useRef, useState } from 'react'
import useScene from './hooks/useScene'
import { SceneDTO } from './simulator/dto'
import { Scene } from './simulator/scene'
import { vscode } from 'monaco-editor-wrapper'
import MonacoEditor, { Editor } from './components/MonacoEditor'
import Simulator from './components/Simulator'
import { Panel, PanelGroup, PanelResizeHandle } from 'react-resizable-panels'

const App = () => {
    const editorRef = useRef<Editor | undefined>(undefined)
    const { setScene } = useScene()
    const [isDragging, setIsDragging] = useState(false)

    const handleEditorDidMount = (editor: Editor | undefined) => {
        editorRef.current = editor
    }

    const validate = async () => {
        const code = editorRef.current?.getValue()
        const diagnostics = await vscode.commands.executeCommand<string[]>('validateCode', code)

        if (diagnostics.length === 0) {
            console.info('code is valid')
        } else {
            console.error('code is invalid')
            for (const diagnostic of diagnostics) {
                console.error(diagnostic)
            }
        }
    }

    const execute = async () => {
        console.info('running current code...')

        const code = editorRef.current?.getValue()
        const { width, height, entities, timestamps } =
            await vscode.commands.executeCommand<SceneDTO>('generateScene', code)
        setScene(new Scene(width, height, entities, timestamps))
    }

    const compile = async () => {
        console.info('compiling current code...')

        const code = editorRef.current?.getValue()
        const inocode = await vscode.commands.executeCommand<string>('generateCode', code)

        if (inocode) {
            // Create a Blob containing the inocode
            const blob = new Blob([inocode], { type: 'text/plain' })

            // Create a link element
            const link = document.createElement('a')
            link.href = window.URL.createObjectURL(blob)
            link.download = 'compiled_code.ino' // Set the desired file name with .ino extension

            // Append the link to the body
            document.body.appendChild(link)

            // Trigger a click on the link to start the download
            link.click()

            // Remove the link from the body
            document.body.removeChild(link)
        }
    }

    return (
        <>
            <div className="block overflow-hidden">
                <div className="flex h-12 select-none flex-row gap-x-[11px] bg-[#ea110c] px-4 pb-[10.5px] pt-3 align-middle">
                    <img src="/logo-inv.svg" />
                    <p className="text-2xl/[23px] font-medium">RobotScript</p>
                </div>
                <div id="buttons">
                    <input
                        className="build"
                        type="button"
                        value="Validate"
                        onClick={() => validate()}
                    />
                    <input
                        className="build"
                        type="button"
                        value="Execute Simulation"
                        onClick={() => execute()}
                    />
                    <input
                        className="build"
                        type="button"
                        value="Restart Simulation"
                        onClick={() => setScene((s) => s?.reset())}
                    />
                    <input
                        className="build"
                        type="button"
                        value="Compile"
                        onClick={() => compile()}
                    />
                </div>

                {/*https://www.npmjs.com/package/react-resizable-panels?activeTab=readme*/}
                <PanelGroup direction='horizontal' >
                    <Panel defaultSize={45} className='flex'>
                        <MonacoEditor onEditorDidMount={handleEditorDidMount}/>
                    </Panel>
                    <PanelResizeHandle className={`w-[6px] ${isDragging?'bg-gray-700':'bg-gray-800'} hover:bg-gray-700`} onDragging={setIsDragging}/>
                    <Panel defaultSize={55} className='flex'>
                        <Simulator />
                    </Panel>
                </PanelGroup>
            </div>
        </>
    )
}

export default App
