package com.example.dogdoorfinalproject;

public class Keypad {
    private final String combination;
    private boolean locked;

    //constructor to initialize the Keypad with a combination
    public Keypad(String combination) {
        this.combination = combination;
        this.locked = true; //start with keypad locked
    }

    //method to enter a code and unlock/lock the keypad accordingly
    public void enterCode(String code) {
        if (code.equals(combination)) {
            locked = !locked; //toggle locked state
            System.out.println("Keypad: Correct combination entered. Windows " + (locked ? "locked" : "unlocked"));
        } else {
            System.out.println("Keypad: Incorrect combination entered. Windows remain " + (locked ? "locked" : "unlocked"));
        }
    }

}

