package com.enigma.oop_java;

import com.enigma.oop_java.inheritance.Block;
import com.enigma.oop_java.inheritance.Rectangle;
import com.enigma.oop_java.object_interaction.Hero;
import com.enigma.oop_java.object_interaction.Monster;

public class Main {
    public static void main(String[] args) {

        // Car ayla = new Car("Daihatsu","Silver",4);

        // Before Encapsulation
        // ayla.fuel = 50; // direct access

//
//        ayla.setFuel(25);
//        ayla.start();
//        System.out.println(ayla.getFuel());

//        Vehicle honda = new Vehicle("Jazz", 2020);
//        Vehicle toyota = new Vehicle("Fortuner",2019);
//
//        Person person1 = new Person("Rafi", 25);
//        Person person2 = new Person("Rani", 23);
//        Person person3 = new Person("Rahma", 18);
//
//        Fruit buah1 =  new Fruit("Nanas","Kuning");
//        Fruit buah2 = new Fruit("Bengkoang","Putih");
//
//        // Cetak detil info untuk setiap objek
////        System.out.println(honda.detailInfo());
////        System.out.println(toyota.detailInfo());
////        System.out.println();
////        System.out.println(person1.detailInfo());
////        System.out.println(person2.detailInfo());
////        System.out.println(person3.detailInfo());
////        System.out.println();
////        System.out.println(buah1.detailInfo());
////        System.out.println(buah2.detailInfo());

//        Rectangle rectangle = new Rectangle(2, 3);
//        Block block = new Block(2, 3, 10);
//
//        System.out.println("Luas persegi: " + rectangle.getArea());
//        System.out.println("Keliling persegi: " + rectangle.getCircumference());
//        System.out.println("Volume balok: " + block.getVolume());
//        System.out.println("Luas Permukaan balok: " + block.getArea());

        Hero miya = new Hero("Miya", 5000, 200);
        Hero balmond = new Hero("Balmond", 10000, 150);

        Hero ironMan = new Hero("Iron Man", 5000, 400);
        Monster monster = new Monster("Monster",9000,300);
        Monster thanos = new Monster("Thanos",10000,500);

        ironMan.attack(thanos);

//        System.out.println(miya.getName() + " is Attacking " + balmond.getName());
//        miya.attack(balmond);
//        System.out.println(balmond.getName() + " health is : " + balmond.getHp() + "\n------");
    }


}
