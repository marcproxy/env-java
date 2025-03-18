package com.example.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Application JavaFX Hello World.
 */
public class MainApp extends Application {

    /**
     * Point d'entrée principal de l'application.
     *
     * @param args arguments de la ligne de commande
     */
    public static void main(String[] args) {
        // Lancer l'application JavaFX
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Créer un label avec "Hello World"
        Label label = new Label("Hello World!");
        
        // Créer un conteneur StackPane et y ajouter le label
        StackPane root = new StackPane();
        root.getChildren().add(label);
        
        // Créer une scène avec le conteneur root
        Scene scene = new Scene(root, 300, 200);
        
        // Configurer et afficher la fenêtre
        primaryStage.setTitle("Hello World JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}