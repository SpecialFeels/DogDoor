package com.example.dogdoorfinalproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
    private DogDoor dogDoor;
    private List<Bark> allowedBarks;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
        this.allowedBarks = new ArrayList<>();
    }

    public void registerAllowedBark(Bark bark) {
        allowedBarks.add(bark);
    }

    public void recognizeBark(Bark bark) {
        System.out.println("BarkRecognizer: Heard a bark");
        Iterator<Bark> iterator = allowedBarks.iterator();
        while (iterator.hasNext()) {
            Bark allowedBark = iterator.next();
            if (allowedBark.getSound().equals(bark.getSound())) {
                System.out.println("BarkRecognizer: Recognized the owner's dog's bark");
                if (dogDoor != null) {
                    dogDoor.open();
                }
                return; // Exit the method after opening the door
            }
        }
        System.out.println("BarkRecognizer: Unrecognized bark");
    }

}
