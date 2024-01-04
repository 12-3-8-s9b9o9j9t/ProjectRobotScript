import { Vector, Ray } from './utils.js';
import { EntityDTO } from './dto.js';

export abstract class Entity {
    constructor(
        public pos: Vector,
        public size: Vector
    ) {}

    abstract intersect(ray: Ray): Vector[];

    abstract toDTO(): EntityDTO;
}

export class Block extends Entity {

    constructor(pos:Vector, size:Vector) {
        super(pos, size);
    }  
  
    override intersect(ray: Ray): Vector[] {

        let getPOI = ray.getPoiFinder()  
        let pois: (Vector|undefined)[] = new Array(4);
        pois[0] = getPOI(this.pos,                         this.pos.plus(this.size.projX()));
        pois[1] = getPOI(this.pos,                         this.pos.plus(this.size.projY()));
        pois[2] = getPOI(this.pos.plus(this.size.projX()), this.pos.plus(this.size));
        pois[3] = getPOI(this.pos.plus(this.size.projY()), this.pos.plus(this.size));

        return pois.filter(x => x !== undefined) as Vector[];
    }

    override toDTO(): EntityDTO {
        return {
            type: 'Block',
            x: this.pos.x,
            y: this.pos.y,
            width: this.size.x,
            height: this.size.y
        };
    }
}

export class Wall extends Entity {
    constructor(pos:Vector, size:Vector) {
        super(pos, size);
    }
      
    override intersect(ray:Ray) : Vector[] {
        const poi = ray.getPoiFinder()(this.pos, this.size);
        return poi ? ([poi] as Vector[]) : ([] as Vector[]);
    }

    override toDTO(): EntityDTO {
        return {
            type: 'Wall',
            x: this.pos.x,
            y: this.pos.y,
            width: this.size.x,
            height: this.size.y
        };
    }
}