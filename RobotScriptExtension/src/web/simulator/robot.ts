import { Scene } from './scene.js'

export class Robot {
    width: number = 50 // mm
    speed: number = 0 // mm/s

    constructor(
        public x: number,
        public y: number,
        public angle: number,
        public scene: Scene,
    ) {}

    /*intersect(ray: Ray): Vector[] {
        return [] as Vector[];
    }*/

    /**
     *
     * @param angle angle in degree
     */
    turn(angle: number): void {
        this.angle += angle
        const rad = (angle * Math.PI) / 180
        const omega = (this.speed * 2) / this.width
        const dt = (Math.abs(rad) / omega) * 1000
        this.scene.addTimestamp(dt)

        this.angle %= 360
        if (this.angle < 0) this.angle += 360
    }

    /**
     *
     * @param dist distance in mm
     */
    move(dist: number): void {
        const rad = (this.angle * Math.PI) / 180
        this.x += Math.cos(rad) * dist
        this.y -= Math.sin(rad) * dist

        const dt = (Math.abs(dist) / this.speed) * 1000
        this.scene.addTimestamp(dt)
    }

    /**
     *
     * @param dist distance in mm
     */
    side(dist: number): void {
        const rad = (this.angle * Math.PI) / 180
        this.x += Math.sin(rad) * dist
        this.y += Math.cos(rad) * dist

        const dt = (Math.abs(dist) / this.speed) * 1000
        this.scene.addTimestamp(dt)
    }

    /*getRay(){
        return new Ray(this.pos, Vector.fromAngle(this.rad, 10000).scale(-1));
    }*/
}
