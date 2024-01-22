package com.enigma.oop_java.inheritance;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(){

    }

    public double getArea() {
        return length * width;
    }

    public double getCircumference() {
        return 2 * (length * width);
    }

    public double getVolume() {
        return length * width * 1;
    }
}
