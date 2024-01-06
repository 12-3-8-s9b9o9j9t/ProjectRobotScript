import { P5CanvasInstance } from "@p5-wrapper/react";
import { Entity, createEntity } from "./entity";
import { Robot, Timestamp } from "./robot";
import { EntityDTO, TimestampDTO } from "./dto";

export class Scene {
    entities: Entity[];
    timestamps: Timestamp[];
    robot?: Robot;
    time: number;
    lastTs: number;

    constructor(
        public width: number,
        public height: number,
        entities: EntityDTO[],
        timestamps: TimestampDTO[]
    ) {
        this.entities = entities.map(createEntity);
        this.timestamps = timestamps;
        const t0 = this.timestamps.at(0);
        this.robot = t0 ? new Robot(t0.x, t0.y, t0.angle) : undefined;
        this.time = 0;
        this.lastTs = 0;
    }

    reset(): Scene {
        this.time = 0;
        this.lastTs = 0;
        const t0 = this.timestamps.at(0);
        this.robot = t0 ? new Robot(t0.x, t0.y, t0.angle) : undefined;
        return this;
    }

    update(p5: P5CanvasInstance): Scene {
        for (const entity of this.entities) {
            entity.show(p5);
        }

        if (this.robot && this.timestamps.length > this.lastTs+1) {
            this.time += p5.deltaTime;

            const last = this.timestamps[this.lastTs];
            const next = this.timestamps[this.lastTs+1];
            
            this.robot.x = p5.map(this.time, last.time, next.time, last.x, next.x, true)
            this.robot.y = p5.map(this.time, last.time, next.time, last.y, next.y, true)
            this.robot.angle = p5.map(this.time, last.time, next.time, normalize(last.angle), next.angle, true)
            
            if(this.time >= next.time){
                this.time = next.time;
                this.lastTs++;
            }
            
        }

        this.robot?.show(p5);

        return this;
    }

    /*toDTO(): SceneDTO {
        return {
            width: this.width,
            height: this.height,
            entities: this.entities.map(e => e.toDTO()),
            timestamps: this.timestamps
        }
    }*/

}

function normalize(angle: number): number {
    const tmp = angle % 360;
    return tmp < 0 ? tmp + 360 : tmp;
}

/*
export const baseScene = new Scene(
    1000,
    1000,
    [
        { type: "Wall", x: 0, y: 0, width: 1000, height: 0 },
        { type: "Wall", x: 0, y: 0, width: 0, height: 1000 },
        { type: "Wall", x: 1000, y: 1000, width: 1000, height: 0 },
        { type: "Wall", x: 1000, y: 1000, width: 0, height: 1000 },
    ],
    [
        { x: 500, y: 500, angle: 0, time: 0 },
    ]
);*/