package com.example.dogdoorfinalproject;

// OpenState.java
public class OpenState implements Remote {
    private DogDoor door;

    public OpenState(DogDoor door) {
        this.door = door;
    }

    @Override
    public void open() {
        System.out.println("The dog door is already open.");
    }

    @Override
    public void close() {
        System.out.println("The dog door is closed.");
        door.changeState(new ClosedState(door));
    }

    @Override
    public void lock() {
        System.out.println("The dog door cannot be locked while it's open.");
    }

    @Override
    public void unlock() {
        System.out.println("The dog door cannot be unlocked while it's open.");
    }
}
