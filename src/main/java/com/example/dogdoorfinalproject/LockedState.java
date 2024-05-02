package com.example.dogdoorfinalproject;

// LockedState.java
public class LockedState implements DoorState {
    private DogDoor door;

    public LockedState(DogDoor door) {
        this.door = door;
    }

    @Override
    public void open() {
        System.out.println("The dog door is locked. Cannot open.");
    }

    @Override
    public void close() {
        System.out.println("The dog door is closed.");
    }

    @Override
    public void lock() {
        System.out.println("The dog door is already locked.");
    }

    @Override
    public void unlock() {
        System.out.println("The dog door is unlocked.");
        door.changeState(new ClosedState(door));
    }
}
