package com.enigma.oop_java.inheritance;

public class Mammals extends Animal {

    public void getBirth(){
        System.out.println("Birth");
    }

    @Override
    public void breathe(){
        super.breathe();
    }
}
