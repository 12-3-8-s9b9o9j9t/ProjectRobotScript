import { Dispatch, FC, PropsWithChildren, SetStateAction, createContext, useState } from "react";
import { Scene } from "../simulator/scene";

export const SceneContext = createContext<{
    scene?: Scene,
    setScene: Dispatch<SetStateAction<Scene|undefined>>
}> ({
    scene: undefined,
    setScene: () => {
        throw new Error('default setScene function must be overridden')
    },
})

const SceneProvider: FC<PropsWithChildren> = ({ children }) => {
    const [scene, setScene] = useState<Scene>()

    return (
        <SceneContext.Provider value={{scene, setScene}}>
            {children}
        </SceneContext.Provider>
    )
}

export default SceneProvider