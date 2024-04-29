package com.example.dogdoorfinalproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class BarkRecognizer {
    private List<Bark> allowedBarks = new ArrayList<>();
    private DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void recognizeBark(Bark bark) {
        System.out.println("BarkRecognizer: Heard a bark");
        Iterator<Bark> barkIterator = allowedBarks.iterator();
        while (barkIterator.hasNext()) {
            Bark allowedBark = barkIterator.next();
            if (allowedBark.getSound().equals(bark.getSound())) {
                System.out.println("BarkRecognizer: Recognized the owner's dog's bark");
                dogDoor.open();
                return;
            }
        }
        System.out.println("BarkRecognizer: Unrecognized bark");
    }

    public void registerAllowedBark(Bark bark) {
        allowedBarks.add(bark);
    }
}