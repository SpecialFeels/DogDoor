package com.example.dogdoorfinalproject;

class DogDoor {
    private boolean open;
    private boolean locked;

    public void open() {
        if (!locked) {
            System.out.println("DogDoor: The dog door is open.");
            open = true;
        } else {
            System.out.println("DogDoor: Cannot open the door. It is locked.");
        }
    }

    public void close() {
        System.out.println("DogDoor: The dog door is closed.");
        open = false;
    }

    public void lock() {
        System.out.println("DogDoor: The dog door is locked.");
        locked = true;
    }

    public void unlock() {
        System.out.println("DogDoor: The dog door is unlocked.");
        locked = false;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isLocked() {
        return locked;
    }

    public void detectScratch() {
        System.out.println("DogDoor: Scratch detected.");
    }
}
