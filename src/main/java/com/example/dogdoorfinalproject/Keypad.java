package com.example.dogdoorfinalproject;

public class Keypad {
    private String combination;
    private boolean locked;

    public Keypad(String combination) {
        this.combination = combination;
        this.locked = true;
    }

    public void enterCode(String code) {
        if (code.equals(combination)) {
            locked = !locked;
            System.out.println("Keypad: Correct combination entered. Windows " + (locked ? "locked" : "unlocked"));
        } else {
            System.out.println("Keypad: Incorrect combination entered. Windows remain " + (locked ? "locked" : "unlocked"));
        }
    }

    public boolean isLocked() {
        return locked;
    }
}
