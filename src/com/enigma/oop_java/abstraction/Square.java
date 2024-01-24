package com.enigma.oop_java.abstraction;

public class Square extends Shape {

    private Double side;

    public Square(Double side) {
        this.side = side;
    }
    @Override
    public Double getCircumference(){
        return 4 * side;
    }
}
