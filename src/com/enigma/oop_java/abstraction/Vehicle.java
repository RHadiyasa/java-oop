package com.enigma.oop_java.abstraction;

/*
1. Interface hanya dapat membuat method abstract
2. Interface disebut dengan kontrak
3. Abstract menggunakan keyword extends, Interface menggunakan keyword Implements
4. Multiple inheritance, bisa memiliki lebih dari 1 parent
5. Inferface tidak bisa dibuat sebagai objek
 */
public interface Vehicle {
    // Secara default abstract method dari interface itu harus public.
    // Interface bukan tampilan, tapi sebuah contract.

    void run();
    void stop();
}
