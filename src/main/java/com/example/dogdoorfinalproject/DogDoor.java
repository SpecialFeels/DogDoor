package com.example.dogdoorfinalproject;

public class DogDoor {
    private Remote currentState;

    public DogDoor() {
        //start with closed state by default
        this.currentState = new ClosedState(this);
    }

    public void changeState(Remote newState) {
        //change the state of the door
        this.currentState = newState;
    }

    public void open() {
        //delegate opening action to the current state
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
        //check if the door is locked
        return currentState instanceof LockedState;
    }
}

