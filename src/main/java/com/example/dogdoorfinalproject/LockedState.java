package com.example.dogdoorfinalproject;

public class LockedState implements Remote {
    private final DogDoor door;

    //constructor to initialize lockedstate with a dogDoor instance
    public LockedState(DogDoor door) {
        this.door = door;
    }

    @Override
    //method to open the door (not allowed when locked)
    public void open() {
        System.out.println("The dog door is locked. Cannot open.");
    }

    @Override
    //method to close the door
    public void close() {
        System.out.println("The dog door is closed.");
    }

    @Override
    //method to lock the door (already locked)
    public void lock() {
        System.out.println("The dog door is already locked.");
    }

    @Override
    //method to unlock the door and change its state to closedstate
    public void unlock() {
        System.out.println("The dog door is unlocked.");
        door.changeState(new ClosedState(door));
    }
}
