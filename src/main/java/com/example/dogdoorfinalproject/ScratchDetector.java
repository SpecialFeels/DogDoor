package com.example.dogdoorfinalproject;

public class ScratchDetector {
    private final DogDoor dogDoor;

    public ScratchDetector(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    //method to detect scratching and open the door for the owners dog
    public void detectScratch() {
        //simulate scratching detection
        if (isOwnersDogScratching()) {
            System.out.println("ScratchDetector: Owner's dog is scratching at the door.");
            dogDoor.open();
        }
    }

    private boolean isOwnersDogScratching() {
        //return true to simulate owner dog scratching
        return true;
    }
}
