/**
 * Desarrollo de Intefaces - 2DAM
 * Tema 1 Apartado 4.2
 * Hello World, JavaFX Style
 * Autor: Shihan
 */

package es.ieslosmontecillos.helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    //The start() method is the main entry point for all JavaFX applications
    @Override
    public void start(Stage primaryStage){

        //We create a button
        Button btn = new Button();
        // Text for the button
        btn.setText("Say 'Hello World'");
        //An event handler to print a message when the button is pressed.
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event){
                System.out.println("Hello World");
            }
        });

        // In this case, the root node is a StackPane object
        StackPane root = new StackPane();
        //It contains one child node, the button control
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}