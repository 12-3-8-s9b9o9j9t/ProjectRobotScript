import { P5CanvasInstance, ReactP5Wrapper, Sketch, SketchProps } from '@p5-wrapper/react'
import { Scene } from '../simulator/scene';
import { Dispatch, SetStateAction } from 'react';
import useScene from '../hooks/useScene';

type SimulationSketchProps = SketchProps & {
    setScene: Dispatch<SetStateAction<Scene|undefined>>
}

const sketch: Sketch<SimulationSketchProps> = p5 => {
    let setScene: Dispatch<SetStateAction<Scene|undefined>> = () => {
        throw new Error("sketch's setScene function must be overriden")
    }

    p5.setup = () => {
        p5.createCanvas(1000, 1000);
        p5.angleMode(p5.DEGREES);
    }

    p5.updateWithProps = props => {
        setScene = props.setScene;
    }

    p5.draw = () => {
        p5.background(0)
            .stroke(255)
            .strokeWeight(1);

        setScene(s => s?.update(p5 as P5CanvasInstance));
    }
}

const Simulator = () => {
    const {setScene} = useScene();

    return (
        <div className="simulator">
            <ReactP5Wrapper sketch={sketch} setScene={setScene} />
        </div>
    );
}

export default Simulator;