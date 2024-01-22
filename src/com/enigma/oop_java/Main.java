package com.enigma.oop_java;

public class Main {
    public static void main(String[] args) {

        Car ayla = new Car("Daihatsu","Silver",4);

        // Before Encapsulation
        // ayla.fuel = 50; // direct access


        ayla.setFuel(25);
        ayla.start();
        System.out.println(ayla.getFuel());

    }
}
