import { P5CanvasInstance } from "@p5-wrapper/react";
import { TimestampDTO } from "./dto";

export type Timestamp = TimestampDTO;

export class Robot {
    width = 50;
    height = 75;

    constructor(
        public x: number,
        public y: number,
        public angle: number
    ) {}
  
    show(p5: P5CanvasInstance) {
        p5.push();
        const canvasX = this.x;
        const canvasY = this.y;
        p5.translate(canvasX, canvasY);
        p5.rotate(this.angle);
        p5.stroke(255, 255, 255);
        p5.rect(-this.height/2, -this.width/2, this.height, this.width);
        p5.stroke(255, 0, 0);
        p5.fill(255, 0, 0);
        const h = (Math.sqrt(3)/2) * (this.width/3)
        p5.triangle(-0.5*h, -(this.height/6), -0.5*h, this.height/6, 0.5*h, 0);
        p5.pop();
    }
}