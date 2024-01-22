package com.enigma.oop_java;

public class Fruit {

    private String name;
    private String color;

    public Fruit(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String detailInfo(){
        return "Nama: " + name + " | Warna: " + color;
    }
}
