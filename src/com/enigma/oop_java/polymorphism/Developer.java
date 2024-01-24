package com.enigma.oop_java.polymorphism;

public class Developer extends Employee{

    public Developer(String name) {
        super(name);
    }
    public void sayHello(String name) {
        System.out.println("Hallo " + name + ", saya adalah Developer " + this.name);
    }
}

