export interface SceneDTO {
    width: number;
    height: number;
    entities: EntityDTO[];
    timestamps: TimestampDTO[];
}

export interface TimestampDTO {
    x: number;
    y: number;
    angle: number;
    time: number;
}

export interface EntityDTO {
    type: string;
    x: number;
    y: number;
    width: number;
    height: number;
}
