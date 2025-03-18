package com.example.app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

/**
 * Contrôleur pour l'interface principale.
 */
public class MainController {

    @FXML
    private Label welcomeLabel;
    
    @FXML
    private Label envLabel;
    
    @FXML
    private Button clickButton;
    
    private int clickCount = 0;
    
    /**
     * Initialise le contrôleur.
     * Cette méthode est automatiquement appelée après le chargement du fichier FXML.
     */
    @FXML
    public void initialize() {
        welcomeLabel.setText("Bienvenue dans l'application!");
        clickButton.setText("Cliquez-moi!");
    }
    
    /**
     * Gère l'événement de clic sur le bouton.
     *
     * @param event l'événement de clic
     */
    @FXML
    public void handleButtonClick(ActionEvent event) {
        clickCount++;
        welcomeLabel.setText("Nombre de clics: " + clickCount);
    }
    
    /**
     * Définit l'environnement à afficher dans l'interface.
     *
     * @param environment l'environnement (dev, prod, etc.)
     */
    public void setEnvironment(String environment) {
        envLabel.setText("Environnement: " + environment);
    }
    
    /**
     * Méthode pour les tests, retourne le nombre de clics actuel.
     *
     * @return le nombre de clics
     */
    public int getClickCount() {
        return clickCount;
    }
}