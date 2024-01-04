import { SceneDTO, TimestampDTO as Timestamp } from './dto.js'
import { Entity, Wall } from './entity.js';
import { Robot } from './robot.js';
import { Vector } from "./utils.js"

export class Scene {
    timestamps: Timestamp[];
    time: number = 0;
    robot: Robot;

    constructor(
        public width: number,
        public height: number,
        public entities: Entity[],
        start: Timestamp
    ) {
        this.robot = new Robot(start.x, start.y, start.angle, this);
        this.timestamps = [start];
    }

    addTimestamp(dt: number):void {
        this.time += dt;
        this.timestamps.push(
            {
                x: this.robot.x,
                y: this.robot.y,
                angle: this.robot.angle,
                time: this.time
            }
        );
    }

    toDTO(): SceneDTO {
        return {
            width: this.width,
            height: this.height,
            entities: this.entities.map(e => e.toDTO()),
            timestamps: this.timestamps
        }
    }
}

export const getBaseScene = () => new Scene(
    1000,
    1000,
    [
        new Wall(new Vector(0,0), new Vector(1000,0)),
        new Wall(new Vector(0,0), new Vector(0,1000)),
        new Wall(new Vector(1000,1000), new Vector(0,1000)),
        new Wall(new Vector(1000,1000), new Vector(1000,0))
    ],
    {
        x: 500,
        y: 500,
        angle: 0,
        time: 0
    }
)
