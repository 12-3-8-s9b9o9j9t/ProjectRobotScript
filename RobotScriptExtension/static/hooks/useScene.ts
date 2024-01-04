import { useContext } from "react"
import { SceneContext } from "../components/SceneProvider"

const useScene = () => {
    return useContext(SceneContext)
}

export default useScene