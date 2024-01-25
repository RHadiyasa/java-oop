package com.enigma.oop_java.polymorphism;

import java.util.Objects;

public class Employee {
    protected String name;

    public Employee(String name){
        this.name = name;
    }

    public void sayHello(String name){
        System.out.println("Hallo " + name + ", saya adalah Karyawan " + this.name);
    }

    public String print(){
        return "Employee {name = " + name + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
