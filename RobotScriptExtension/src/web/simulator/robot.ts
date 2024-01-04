import { Scene } from "./scene.js";

export class Robot {
    width: number = 50;
    height: number = 75;
    speed: number = 0; // mm/s

    constructor(
        public x: number,
        public y: number,
        public angle: number,
        public scene:Scene
    ) {}
  
    /*intersect(ray: Ray): Vector[] {
        return [] as Vector[];
    }*/

    /**
     * 
     * @param angle angle in degree
     */
    turn(angle:number) : void {
        this.angle += angle;
        /*if(this.angle<0){
            this.angle += 360;
        } else if (this.angle >= 360){
            this.angle -= 360;
        }*/
        /*const rad = Math.abs(angle) * Math.PI / 180;
        const dt = rad / this.speed * 1000;*/
        const dt = Math.abs(angle) / this.speed * 1000;
        this.scene.addTimestamp(dt);
    }

    /**
     * 
     * @param dist distance in mm
     */
    move(dist:number) : void {
        const rad = this.angle * Math.PI / 180;
        this.x += Math.cos(rad)*dist;
        this.y += Math.sin(rad)*dist;

        const dt = Math.abs(dist) / this.speed * 1000;
        this.scene.addTimestamp(dt);
    }

    /**
     * 
     * @param dist distance in mm
     */
    side(dist:number) : void {
        const rad = this.angle * Math.PI / 180;
        this.x -= Math.sin(rad)*dist;
        this.y += Math.cos(rad)*dist;

        const dt = Math.abs(dist) / this.speed * 1000;
        this.scene.addTimestamp(dt);
    }
    
    /*getRay(){
        return new Ray(this.pos, Vector.fromAngle(this.rad, 10000).scale(-1));
    }*/
  
}
