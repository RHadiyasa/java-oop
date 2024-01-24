package com.enigma.oop_java.abstraction;

public class Motorcycle implements Vehicle {
    @Override
    public void run() {
        System.out.println("Motor berjalan");
    }

    @Override
    public void stop() {
        System.out.println("Motor berhenti");
    }
}
