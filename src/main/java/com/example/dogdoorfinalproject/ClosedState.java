package com.example.dogdoorfinalproject;

public class ClosedState implements Remote {
    private DogDoor door;

    public ClosedState(DogDoor door) {
        this.door = door;
    }

    @Override
    public void open() {
        //open the door and change state to OpenState
        System.out.println("The dog door is now open.");
        door.changeState(new OpenState(door));
    }

    @Override
    public void close() {
        //inform that the door is already closed
        System.out.println("The dog door is already closed.");
    }

    @Override
    public void lock() {
        //lock the door and change state to LockedState
        System.out.println("The dog door is now locked");
        door.changeState(new LockedState(door));
    }

    @Override
    public void unlock() {
        //inform that the door needs to be locked first before unlocking
        System.out.println("The dog door first needs to be locked.");
    }
}

