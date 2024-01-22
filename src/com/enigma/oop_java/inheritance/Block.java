package com.enigma.oop_java.inheritance;

public class Block extends Rectangle {

    protected double height;

    public Block(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public double getArea() {
        return (2 * (length * width)) + (2 * (height * length)) + (2 * (width * height));
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }
}
