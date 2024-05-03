package com.example.dogdoorfinalproject;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;
import java.util.Scanner;

public class DogDoorApp extends Application {

    private static DogDoor dogDoor;
    private static BarkRecognizer barkRecognizer;
    private static Keypad keypad;

    @Override
    public void start(Stage primaryStage) throws Exception {
        dogDoor = new DogDoor(); //initialize the DogDoor instance
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Hello.fxml")));
        primaryStage.setTitle("Dog Door App");

        //create the scene
        Scene scene = new Scene(root, 300, 200);

        //add the Ccss file to the scenes stylesheets
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/style.css")).toExternalForm());

        //set the scene to the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dog Door App");

        //show the stage
        primaryStage.show();
    }



    public static void main(String[] args) {
        //initialize the dogdoor instance
        dogDoor = new DogDoor();

        //initialize the barkrecognizer instance
        barkRecognizer = new BarkRecognizer(dogDoor);
        Bark ownerBark = new Bark("Woof");
        barkRecognizer.registerAllowedBark(ownerBark);

        //recognize a bark
        Bark bark = new Bark("Woof");
        barkRecognizer.recognizeBark(bark);

        //recognize another bark
        Bark anotherDogBark = new Bark("Bark");
        barkRecognizer.recognizeBark(anotherDogBark);

        //initialize the scratchdetector instance
        ScratchDetector scratchDetector = new ScratchDetector(dogDoor);

        //simulate scratching by the owner's dog
        scratchDetector.detectScratch();

        //initialize the Keypad instance with a combination
        keypad = new Keypad("1234");
        //use of the Keypad
        System.out.println("Enter the keypad combination to unlock the windows and to access the remote!:");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        keypad.enterCode(code);

        // after operations launch JavafX application
        launch(args);
    }

    // getter for dogDoor
    public static DogDoor getDogDoor() {
        return dogDoor;
    }

}


