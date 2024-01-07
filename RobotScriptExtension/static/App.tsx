import { useRef } from 'react';
import useScene from './hooks/useScene';
import { SceneDTO } from './simulator/dto';
import { Scene } from './simulator/scene';
import { vscode } from 'monaco-editor-wrapper';
import MonacoEditor, { Editor } from './components/MonacoEditor';
import Simulator from './components/Simulator';

const App = () => {
    const editorRef = useRef<Editor|undefined>(undefined);
    const {setScene} = useScene();

    const handleEditorDidMount = (editor: Editor|undefined) => {
        editorRef.current = editor;
    }

    const validate = (async () => {
        const code = editorRef.current?.getValue();
        const diagnostics = await vscode.commands.executeCommand<string[]>('validateCode', code)
    
        if (diagnostics.length === 0) {
            console.info('code is valid');
        } else {
            console.error('code is invalid');
            for (const diagnostic of diagnostics) {
                console.error(diagnostic);
            }
        }
    })
    
    const execute = (async () => {
        console.info('running current code...');
        
        const code = editorRef.current?.getValue();
        const {width, height, entities, timestamps} = await vscode.commands.executeCommand<SceneDTO>('generateScene', code)
        setScene(new Scene(width, height, entities, timestamps));
    })

    const compile = (async () => {
        console.info('compiling current code...');
        
        const code = editorRef.current?.getValue();
        const inocode = await vscode.commands.executeCommand<string>('generateCode', code)
        
        if (inocode) {
            // Create a Blob containing the inocode
            const blob = new Blob([inocode], { type: 'text/plain' });
    
            // Create a link element
            const link = document.createElement('a');
            link.href = window.URL.createObjectURL(blob);
            link.download = 'compiled_code.ino'; // Set the desired file name with .ino extension
    
            // Append the link to the body
            document.body.appendChild(link);
    
            // Trigger a click on the link to start the download
            link.click();
    
            // Remove the link from the body
            document.body.removeChild(link);
        }
    })

    return (
        <>
            <h1>RobotScript in Langium</h1>
            <div id="buttons">
                <input className="build" type="button" value="Validate" onClick={() => validate()}/>
                <input className="build" type="button" value="Execute Simulation" onClick={() => execute()}/>
                <input className="build" type="button" value="Restart Simulation" onClick={() => setScene(s => s?.reset())}/>
                <input className="build" type="button" value="Compile" onClick={() => compile()}/>
            </div>

            <div id="page-wrapper">
                <MonacoEditor onEditorDidMount={handleEditorDidMount}/>
                <Simulator />
            </div>

            <footer>
                <p style={{'fontStyle': "italic"}}>Powered by</p>
                <img width="125" src="https://langium.org/assets/langium_logo_w_nib.svg" alt="Langium"/>
            </footer>
        </>
    )
}

export default App
