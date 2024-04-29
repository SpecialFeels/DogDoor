package com.example.dogdoorfinalproject;

class DogDoor {
    private boolean open;

    public void open() {
        System.out.println("DogDoor: The dog door is open.");
        open = true;
    }

    public void close() {
        System.out.println("DogDoor: The dog door is closed.");
        open = false;
    }

    public void lock() {
        System.out.println("DogDoor: The dog door is locked.");
    }

    public void unlock() {
        System.out.println("DogDoor: The dog door is unlocked.");
    }

    public boolean isOpen() {
        return open;
    }

    public void detectScratch() {
        System.out.println("DogDoor: Scratch detected.");
    }
}