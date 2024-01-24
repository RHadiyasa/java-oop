package com.enigma.oop_java.abstraction;

import org.w3c.dom.ls.LSOutput;

public class Airplane implements Vehicle, Flyable {

    @Override
    public void run() {
        System.out.println("Plane is taking off");
    }

    @Override
    public void stop() {
        System.out.println("Plane is landing");
    }

    @Override
    public void fly() {
        System.out.println("Plane is Flying");
    }
}
