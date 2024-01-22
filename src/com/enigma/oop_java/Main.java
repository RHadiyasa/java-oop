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
        System.out.println("Nama: " + honda.getBrand() + " | Tahun: " + honda.getYear());
        System.out.println("Nama: " + toyota.getBrand() + " | Tahun: " + toyota.getYear());
        System.out.println();
        System.out.println("Nama: " + person1.getName() + " | Umur: " + person1.getAge());
        System.out.println("Nama: " + person2.getName() + " | Umur: " + person2.getAge());
        System.out.println("Nama: " + person3.getName() + " | Umur: " + person3.getAge());
        System.out.println();
        System.out.println("Nama: " + buah1.getName() + " | Warna: " + buah1.getColor());
        System.out.println("Nama: " + buah2.getName() + " | Warna: " + buah2.getColor());

    }


}
