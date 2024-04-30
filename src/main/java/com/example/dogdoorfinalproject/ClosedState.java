package com.example.dogdoorfinalproject;

// ClosedState.java
public class ClosedState implements DoorState {
    private DogDoor door;

    public ClosedState(DogDoor door) {
        this.door = door;
    }

    @Override
    public void open() {
        System.out.println("DogDoor: The dog door is open.");
        door.changeState(new OpenState(door));
    }

    @Override
    public void close() {
        System.out.println("The dog door is already closed.");
    }

    @Override
    public void lock() {
        System.out.println("DogDoor: The dog door is locked.");
        door.changeState(new LockedState(door));
    }

    @Override
    public void unlock() {
        System.out.println("DogDoor: The dog door cannot be unlocked while it's closed.");
    }
}