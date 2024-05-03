package com.example.dogdoorfinalproject;

public class ScratchDetector {
    private DogDoor dogDoor;

    public ScratchDetector(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    // Method to detect scratching and open the door for the owner's dog
    public void detectScratch() {
        // Simulate scratching detection
        if (isOwnersDogScratching()) {
            System.out.println("ScratchDetector: Owner's dog is scratching at the door.");
            dogDoor.open();
        }
    }

    // Placeholder method to simulate scratching detection for the owner's dog
    private boolean isOwnersDogScratching() {
        // Implement logic to identify the owner's dog scratching
        // For simplicity, let's assume it's always the owner's dog scratching
        return true;
    }
}
