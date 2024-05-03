package com.example.dogdoorfinalproject;

public class OpenState implements Remote {
    private final DogDoor door;

    //constructor to initialize openstate with dogdoor instance
    public OpenState(DogDoor door) {
        this.door = door;
    }

    @Override
    //method to open the door (its already open)
    public void open() {
        System.out.println("The dog door is already open.");
    }

    @Override
    //method to close the door and change its state to closedstate
    public void close() {
        System.out.println("The dog door is closed.");
        door.changeState(new ClosedState(door));
    }

    @Override
    //method to lock the door (not allowed while open)
    public void lock() {
        System.out.println("The dog door cannot be locked while it's open.");
    }

    @Override
    //method to unlock the door (not allowed while open)
    public void unlock() {
        System.out.println("The dog door cannot be unlocked while it's open.");
    }
}
