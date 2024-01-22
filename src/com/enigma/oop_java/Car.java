package com.enigma.oop_java;

public class Car {
    /*
     * Tahapan pertama membuat object adalah membuat blueprint
     * */

    // Properti atau Attribute
    private String brand;
    private String color;
    private Integer tier;
    private Integer fuel;

    public Car(String brand, String color, Integer tier) { // --> Constructor
        this.brand = brand; // this memanggil dirinya sendiri dari class
        this.color = color; // karena nama parameternya sama, kecuali kalo beda
        this.tier = tier; // constructor itu harus berurutan ketika dipanggil sama objectnya
        this.fuel = 0;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void fuelConsumption(){
        fuel -= 1;
    }

    // Contoh Getter biasanya cuma sebaris, tapi bisa dikasih validasi
    public Integer getFuel(){
        if (fuel == null){
            return 0;
        } else {
            return fuel;
        }
    }

    // Contoh Setter. Sama juga, biasanya cuma sebaris, tapi bisa dikasih validasi
    public void setFuel(Integer fuel){
        if (fuel >  30 || fuel <= 0){
            System.out.println("Tidak boleh minus dan tangki kepenuhan!");
        } else {
            System.out.println("Mobil Bisa jalan!");
        }
        this.fuel += fuel;
    }

    // Method atau Fungsi
    public void start() {

        if (fuel >  30 || fuel <= 0){
            System.out.println("Tangki bermasalah");
        } else {
            System.out.println("Jalan!");
            fuelConsumption();
        }
    }

    public void stop() {
        System.out.println("Cittt");
    }

    public String print(){
        return "Brand : " + brand ;
    }
}
