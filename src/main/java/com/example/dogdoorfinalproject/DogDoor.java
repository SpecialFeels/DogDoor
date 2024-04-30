package com.example.dogdoorfinalproject;

public class DogDoor {
    private DoorState currentState;

    public DogDoor() {
        this.currentState = new ClosedState(this); // Start with closed state
    }

    public void changeState(DoorState newState) {
        this.currentState = newState;
    }

    public void open() {
        currentState.open();
    }

    public void close() {
        currentState.close();
    }

    public void lock() {
        currentState.lock();
    }

    public void unlock() {
        currentState.unlock();
    }

    public boolean isLocked() {
        return currentState instanceof LockedState;
    }
}
