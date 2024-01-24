package com.enigma.oop_java.polymorphism;

public class Manager extends Employee {

    public Manager(String name){
        super(name);
    }

    public void sayHello(String name){
        System.out.println("Hello " + name + ", saya adalah Manager " + this.name);
    }
}
