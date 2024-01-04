import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.tsx'
import './index.css'
import SceneProvider from './components/SceneProvider.tsx'

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
  <React.StrictMode>
    <SceneProvider>
      <App />
    </SceneProvider>
  </React.StrictMode>,
)
