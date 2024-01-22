package com.enigma.oop_java;

public class Car {
    /*
    * Tahapan pertama membuat object adalah membuat blueprint
    * */

    // Properti atau Attribute
    public String brand;
    public String color;
    public Integer tier;

    public Car (String brand, String color, Integer tier) { // --> Constructor
        this.brand = brand; // this memanggil dirinya sendiri dari class
        this.color = color; // karena nama parameternya sama, kecuali kalo beda
        this.tier = tier; // constructor itu harus berurutan ketika dipanggil sama objectnya
    }

    // Method atau Fungsi
    public void start(){
        System.out.println("Brum");
    }

    public void stop(){
        System.out.println("Cittt");
    }
}
