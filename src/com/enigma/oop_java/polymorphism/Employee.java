package com.enigma.oop_java.polymorphism;

public class Employee {
    protected String name;

    public Employee(String name){
        this.name = name;
    }

    public void sayHello(String name){
        System.out.println("Hallo " + name + ", saya adalah Karyawan " + this.name);
    }
}
