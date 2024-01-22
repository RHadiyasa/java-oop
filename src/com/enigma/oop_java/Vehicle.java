package com.enigma.oop_java;

public class Vehicle {
    private String brand;
    private Integer year;

    public Vehicle(String brand, Integer year){
        this.brand = brand;
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }
}
