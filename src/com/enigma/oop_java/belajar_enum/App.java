package com.enigma.oop_java.belajar_enum;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {

//        Gender male = Gender.MALE;
//        Gender female = Gender.FEMALE;
//        System.out.println("Manggil ENUM : " + male);
//        System.out.println("Manggil ENUM : " + female);
//
//        String descPria = Gender.MALE.getDescription();
//        String descPerempuan = Gender.FEMALE.getDescription();
//        System.out.println("Ini Description ENUM "  + descPria);
//        System.out.println("Ini Description ENUM "  + descPerempuan);
//        System.out.println("Ini Static Method ENUM : " + Gender.tes());
//
//        System.out.println("----------------------");

        Direction face = Direction.valueOf("WEST");
        System.out.println(face.turnRight());
        System.out.println(face.turnLeft());



//        System.out.println(Direction.values()[1]);
//        System.out.println(Direction.NORTH.turnRight());
//        if(north.name() instanceof String){
//            System.out.println("Benar");
//        }
    }
}
