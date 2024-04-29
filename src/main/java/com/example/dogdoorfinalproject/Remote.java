package com.example.dogdoorfinalproject;

class Remote {
    private DogDoor dogDoor;

    public Remote(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void pressButtonToOpen() {
        dogDoor.open();
    }

    public void pressButtonToClose() {
        dogDoor.close();
    }

    public void pressButtonToLock() {
        dogDoor.lock();
    }

    public void pressButtonToUnlock() {
        dogDoor.unlock();
    }
}