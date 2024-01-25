package com.enigma.oop_java;

import com.enigma.oop_java.abstraction.*;
import com.enigma.oop_java.abstraction.Vehicle;
import com.enigma.oop_java.example_static.Constant;
import com.enigma.oop_java.example_static.Helper;
import com.enigma.oop_java.inheritance.Animal;
import com.enigma.oop_java.inheritance.Mammals;
import com.enigma.oop_java.object_interaction.Hero;
import com.enigma.oop_java.object_interaction.Monster;
import com.enigma.oop_java.polymorphism.Developer;
import com.enigma.oop_java.polymorphism.Employee;
import com.enigma.oop_java.polymorphism.Manager;

public class Main {
    public static void main(String[] args) {
//        // Car ayla = new Car("Daihatsu","Silver",4);
//
//        // Before Encapsulation
//        // ayla.fuel = 50; // direct access
//
////
////        ayla.setFuel(25);
////        ayla.start();
////        System.out.println(ayla.getFuel());
//
////        Vehicle honda = new Vehicle("Jazz", 2020);
////        Vehicle toyota = new Vehicle("Fortuner",2019);
////
////        Person person1 = new Person("Rafi", 25);
////        Person person2 = new Person("Rani", 23);
////        Person person3 = new Person("Rahma", 18);
////
////        Fruit buah1 =  new Fruit("Nanas","Kuning");
////        Fruit buah2 = new Fruit("Bengkoang","Putih");
////
////        // Cetak detil info untuk setiap objek
//////        System.out.println(honda.detailInfo());
//////        System.out.println(toyota.detailInfo());
//////        System.out.println();
//////        System.out.println(person1.detailInfo());
//////        System.out.println(person2.detailInfo());
//////        System.out.println(person3.detailInfo());
//////        System.out.println();
//////        System.out.println(buah1.detailInfo());
//////        System.out.println(buah2.detailInfo());
//
////        Rectangle rectangle = new Rectangle(2, 3);
////        Block block = new Block(2, 3, 10);
////
////        System.out.println("Luas persegi: " + rectangle.getArea());
////        System.out.println("Keliling persegi: " + rectangle.getCircumference());
////        System.out.println("Volume balok: " + block.getVolume());
////        System.out.println("Luas Permukaan balok: " + block.getArea());
//
////        Hero miya = new Hero("Miya", 5000, 200);
////        Hero balmond = new Hero("Balmond", 10000, 150);
////
////        Hero ironMan = new Hero("Iron Man", 5000, 400);
////        Monster monster = new Monster("Monster",9000,300);
////        Monster thanos = new Monster("Thanos",10000,500);
////
////        ironMan.attack(thanos);
//
////        System.out.println(miya.getName() + " is Attacking " + balmond.getName());
////        miya.attack(balmond);
////        System.out.println(balmond.getName() + " health is : " + balmond.getHp() + "\n------");
//
//        Lamp lamp = new Lamp();
//        Room room = new Room(lamp);
//
//        room.switchLamp();
//
//        System.out.println(lamp.isOn());
//
//        Animal animal = new Mammals();
//        Mammals mammals = (Mammals) animal;
//
//        System.out.println(animal);
//        System.out.println(mammals);
//
//        Employee employee = new Employee("Rafi");
//        employee.sayHello("Budi");
//
//        employee = new Manager("Rahma");
//        employee.sayHello("Rani");
//
//        employee = new Developer("Sadikin");
//        employee.sayHello("Gunawan");
//        Shape shape = new Square(10.0);
//        Shape triangle = new Triangle(10.0, 5.0);
//
//        Double keliling = shape.getCircumference();
//        Double luas = shape.getArea();
//        Double triangleArea = triangle.getArea();
//
//        System.out.println("Keliling : " + keliling);
//        System.out.println("Luas : " + luas);
//        System.out.println("Luas Segitiga : " + triangleArea);
//        Flyable[] vehicle = new Flyable[2];
////        vehicle[0] = new Motorcycle();
//        vehicle[1] = new Airplane();

//        Hero hero = new Hero("Rafi Hadiyasa", 10000,1000);
//        Monster monster = new Monster("Olla", 5000, 700);
//
//        hero.attack(monster);
//        monster.attack(hero);

        System.out.println(Constant.APPLICATION);

        String nama = Helper.inputan("Masukan Nama : ");
        String umur = Helper.inputan("Masukan umur : ");
        System.out.println(nama);
        System.out.println(umur);

    }
}
