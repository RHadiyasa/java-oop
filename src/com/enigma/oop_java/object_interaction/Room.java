package com.enigma.oop_java.object_interaction;

public class Room {
    private Lamp roomLamp;

    public Room(Lamp roomLamp){
        this.roomLamp = roomLamp;
    }

    public void switchLamp(){
        if(roomLamp.isOn()){
            roomLamp.turnOff();
        }else {
            roomLamp.turnOn();
        }
    }
}
