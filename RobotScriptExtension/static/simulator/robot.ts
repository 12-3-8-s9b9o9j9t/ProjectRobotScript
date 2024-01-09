import { P5CanvasInstance } from '@p5-wrapper/react'
import { TimestampDTO } from './dto'

export type Timestamp = TimestampDTO

export class Robot {
    width = 50 // mm

    constructor(
        public x: number,
        public y: number,
        public angle: number,
    ) {}

    show(p5: P5CanvasInstance) {
        p5.push()
        const h = (Math.sqrt(3) / 2) * (this.width / 3)
        p5.translate(this.x, this.y)
            .rotate(-this.angle)
            .stroke(255, 255, 255)
            .square(-this.width / 2, -this.width / 2, this.width)
            .stroke(255, 0, 0)
            .fill(255, 0, 0)
            .triangle(-0.5 * h, -(this.width / 6), -0.5 * h, this.width / 6, 0.5 * h, 0)
        p5.pop()
    }
}
