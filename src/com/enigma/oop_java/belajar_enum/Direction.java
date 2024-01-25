package com.enigma.oop_java.belajar_enum;

public enum Direction {
    NORTH, //ordinal ke 0
    EAST, //ordinal ke 1
    SOUTH, //ordinal ke 2
    WEST; //ordinal ke 3

    public Direction turnRight() {
        // return Direction.values()[(this.ordinal() - 1 + 4) % 4];
        return values()[(this.ordinal() - 1 + 4) % 4];
    }

    public Direction turnLeft() {
        return values()[(this.ordinal() + 1 + 4) % 4];
    }
}
