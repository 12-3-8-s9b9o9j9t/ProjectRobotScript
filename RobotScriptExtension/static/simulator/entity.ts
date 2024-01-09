import { P5CanvasInstance } from '@p5-wrapper/react'
import { EntityDTO } from './dto'

export abstract class Entity {
    constructor(
        public x: number,
        public y: number,
        public width: number,
        public height: number,
    ) {}

    abstract show(p5: P5CanvasInstance): void
    //abstract toDTO(): EntityDTO;
}

export class Block extends Entity {
    constructor(x: number, y: number, width: number, height: number) {
        super(x, y, width, height)
    }

    show(p5: P5CanvasInstance): void {
        p5.line(this.x, this.y, this.x + this.width, this.y)
            .line(this.x, this.y, this.x, this.y + this.height)
            .line(this.x + this.width, this.y, this.x + this.width, this.y + this.height)
            .line(this.x, this.y + this.height, this.x + this.width, this.y + this.height)
    }

    /*toDTO(): EntityDTO {
        return {
            type: "Block",
            x: this.x,
            y: this.y,
            width: this.width,
            height: this.height
        }
    }*/
}

export class Wall extends Entity {
    constructor(x: number, y: number, width: number, height: number) {
        super(x, y, width, height)
    }

    show(p5: P5CanvasInstance): void {
        p5.line(this.x, this.y, this.width, this.height)
    }

    /*toDTO(): EntityDTO {
        return {
            type: "Wall",
            x: this.x,
            y: this.y,
            width: this.width,
            height: this.height
        }
    }*/
}

export const createEntity = (entity: EntityDTO): Entity => {
    switch (entity.type) {
        case 'Block':
            return new Block(entity.x, entity.y, entity.width, entity.height)
        case 'Wall':
            return new Wall(entity.x, entity.y, entity.width, entity.height)
        default:
            throw new Error(`Unknown entity type: ${entity.type}`)
    }
}
