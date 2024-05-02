package com.example.dogdoorfinalproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
    private DogDoor dogDoor;
    private final List<Bark> allowedBarks;

    // Constructor to initialize the BarkRecognizer with a DogDoor instance
    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
        this.allowedBarks = new ArrayList<>(); // Initialize the list of allowed barks
    }

    // Method to register an allowed bark
    public void registerAllowedBark(Bark bark) {
        allowedBarks.add(bark);
    }

    // Method to recognize a bark and open/close the dog door accordingly
    public void recognizeBark(Bark bark) {
        System.out.println("BarkRecognizer: Heard a bark."); // Log that a bark was heard
        Iterator<Bark> iterator = allowedBarks.iterator();
        boolean recognized = false;
        while (iterator.hasNext()) {
            Bark allowedBark = iterator.next();
            if (allowedBark.getSound().equals(bark.getSound())) {
                System.out.println("BarkRecognizer: Recognized the owner's dog's bark."); // Log that the bark was recognized
                recognized = true;
                if (dogDoor != null) {
                    dogDoor.open(); // Open the dog door if the bark is recognized
                }
                break;
            }
        }
        if (!recognized) {
            System.out.println("BarkRecognizer: Unrecognized bark."); // Log that the bark was unrecognized
            if (dogDoor != null) {
                dogDoor.close(); // Close the door if bark is unrecognized
            }
        }
    }
}
