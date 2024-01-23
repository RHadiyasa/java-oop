package com.enigma.oop_java.object_interaction;

public class Lamp {

    private boolean isOn = false;

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
