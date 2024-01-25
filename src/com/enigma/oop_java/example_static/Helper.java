package com.enigma.oop_java.example_static;

import java.util.Scanner;

public class Helper {

    public static String inputan(String text){
        System.out.printf("%s", text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
