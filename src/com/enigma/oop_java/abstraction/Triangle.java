package com.enigma.oop_java.abstraction;

public class Triangle extends Shape{

    private Double base;
    private Double height;

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Double getCircumference() {
        return null;
    }

    @Override
    public Double getArea() {
        return 0.5 * base * height;
    }
}
