import { Entity } from './entity.js'

export class Vector {
    x: number
    y: number

    static fromAngle(rad: number, norm: number): Vector {
        return new Vector(Math.cos(rad) * norm, Math.sin(rad) * norm)
    }

    static null(): Vector {
        return new Vector(0, 0)
    }

    constructor(x: number, y: number) {
        this.x = x
        this.y = y
    }

    plus(other: Vector): Vector {
        return new Vector(this.x + other.x, this.y + other.y)
    }

    minus(other: Vector): Vector {
        return new Vector(this.x - other.x, this.y - other.y)
    }

    scale(factor: number): Vector {
        return new Vector(this.x * factor, this.y * factor)
    }

    projX(): Vector {
        return new Vector(this.x, 0)
    }

    projY(): Vector {
        return new Vector(0, this.y)
    }

    norm(): number {
        return Math.sqrt(this.x * this.x + this.y * this.y)
    }
}

export class Ray {
    origin: Vector
    vector: Vector

    constructor(origin: Vector, vector: Vector) {
        this.origin = origin
        this.vector = vector
    }

    intersect(entities: Entity[]): Vector | undefined {
        let pois: Vector[] = []
        for (var i = 0; i < entities.length; i++) {
            let e = entities[i]
            let entityPOI = e.intersect(this)
            console.log(entityPOI)
            pois = pois.concat(entityPOI)
        }

        return this.findClosestIntersection(pois)
    }

    findClosestIntersection(pois: Vector[]): Vector | undefined {
        let idx = 0
        let minDist = Infinity
        if (pois.length > 0) {
            for (var i = 0; i < pois.length; i++) {
                let d = this.origin.minus(pois[i]).norm()
                if (d < minDist) {
                    minDist = d
                    idx = i
                }
            }
            return pois[idx]
        } else {
            return undefined
        }
    }

    getPoiFinder(): (p1: Vector, p2: Vector) => Vector | undefined {
        return (p1: Vector, p2: Vector): Vector | undefined => {
            const P = p1.minus(p2)
            const V = this.vector

            const den = P.x * V.y - V.x * P.y
            if (den != 0) {
                const I = p1.minus(this.origin)

                let nomT = I.x * V.y - V.x * I.y
                let nomU = P.x * I.y - I.x * P.y
                let t = nomT / den
                let u = -nomU / den

                if (t > 0 && t < 1 && u > 0) {
                    return p1.plus(P.scale(-t))
                }
            }
            return undefined
        }
    }
}

/*
class Ray {

  constructor(x, y, angle) {
    this.x = x;
    this.y = y;
    this.angle = angle
    this.v = p5.Vector.fromAngle(this.angle, 1000);
    this.poi = null;
  }

  show() {
    push();
    stroke(10, 255, 10);
    translate(this.x, this.y);
    line(0, 0, this.v.x, this.v.y);
    pop();
  }

  intersect() {
    let pois = [];
    for (var i = 0; i < entities.length; i++) {
      let e = entities[i];
      let entityPOI = e.intersect(this);
      pois = pois.concat(entityPOI);
    }

    this.findClosestPoi(pois);
  }

  findClosestPoi(pois) {
    let idx = 0;
    let minDist = Infinity;
    if (pois.every(ele => ele === null)) {
      this.poi = null;
    } else {
      for (var i = 0; i < pois.length; i++) {
        if (pois[i] != null) {
          let d = dist(this.x, this.y, pois[i][0], pois[i][1]);
          if (d < minDist) {
            minDist = d;
            idx = i;
          }
        }
      }
      this.poi = pois[idx];
    }
    this.setV();
  }

  setV() {
    if (this.poi == null) {
      this.v = p5.Vector.fromAngle(this.angle, 1000);
    } else {
      this.v.x = this.poi[0] - this.x;
      this.v.y = this.poi[1] - this.y;
    }
  }
}
*/
