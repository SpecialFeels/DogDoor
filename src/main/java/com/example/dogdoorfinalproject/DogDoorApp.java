package com.example.dogdoorfinalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class DogDoorApp extends Application {

    private static DogDoor dogDoor;
    private static BarkRecognizer barkRecognizer;
    private static Keypad keypad;

    @Override
    public void start(Stage primaryStage) throws Exception {
        dogDoor = new DogDoor(); // Initialize the DogDoor instance
        Parent root = FXMLLoader.load(getClass().getResource("Hello.fxml"));
        primaryStage.setTitle("Dog Door App");
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Initialize the DogDoor instance
        dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);

        // Initialize the BarkRecognizer instance
        barkRecognizer = new BarkRecognizer(dogDoor);
        Bark ownerBark = new Bark("Woof");
        barkRecognizer.registerAllowedBark(ownerBark);

        // Recognize a bark
        Bark bark = new Bark("Woof");
        barkRecognizer.recognizeBark(bark);

        // Recognize another bark
        Bark anotherDogBark = new Bark("Bark");
        barkRecognizer.recognizeBark(anotherDogBark);

        // Initialize the Keypad instance with a combination
        keypad = new Keypad("1234");
        // Example usage of the Keypad
        System.out.println("Enter the keypad combination to unlock the windows:");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        keypad.enterCode(code);

        // After performing necessary operations, start the JavaFX application
        launch(args);
    }

    // Getters for accessing DogDoor, BarkRecognizer, and Keypad instances
    public static DogDoor getDogDoor() {
        return dogDoor;
    }

    public static BarkRecognizer getBarkRecognizer() {
        return barkRecognizer;
    }

    public static Keypad getKeypad() {
        return keypad;
    }
}


