package com.enigma.oop_java.belajar_enum;

public enum Gender {
    // Enum adalah sebuah class, karena semua yang ada di java adalah object.
    // Gunakan SCREAMING_UPPERCASE
    MALE("Laki-laki"),
    FEMALE("Perempuan");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static String tes(){
        return "Test";
    }
}
