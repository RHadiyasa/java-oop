package com.enigma.oop_java;

import java.beans.PersistenceDelegate;

public class Main {
    public static void main(String[] args) {

        Car ayla = new Car("Daihatsu","Silver",4);

        // Before Encapsulation
        // ayla.fuel = 50; // direct access

//
//        ayla.setFuel(25);
//        ayla.start();
//        System.out.println(ayla.getFuel());

        Vehicle honda = new Vehicle("Jazz", 2020);
        Vehicle toyota = new Vehicle("Fortuner",2019);

        Person person1 = new Person("Rafi", 25);
        Person person2 = new Person("Rani", 23);
        Person person3 = new Person("Rahma", 18);

        Fruit buah1 =  new Fruit("Nanas","Kuning");
        Fruit buah2 = new Fruit("Bengkoang","Putih");

        // Cetak detil info untuk setiap objek
        System.out.println(honda.detailInfo());
        System.out.println(toyota.detailInfo());
        System.out.println();
        System.out.println(person1.detailInfo());
        System.out.println(person2.detailInfo());
        System.out.println(person3.detailInfo());
        System.out.println();
        System.out.println(buah1.detailInfo());
        System.out.println(buah2.detailInfo());

    }


}
