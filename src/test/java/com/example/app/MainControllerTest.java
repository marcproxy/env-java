package com.example.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ApplicationExtension.class)
public class MainControllerTest {

    private MainController controller;
    private Label welcomeLabel;
    private Label envLabel;
    
    @Start
    private void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/app/MainView.fxml"));
        AnchorPane root = loader.load();
        this.controller = loader.getController();
        
        // Récupérer les références aux composants
        this.welcomeLabel = (Label) root.lookup("#welcomeLabel");
        this.envLabel = (Label) root.lookup("#envLabel");
        
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Test
    public void testInitialize() {
        // Vérifier que le texte est correctement initialisé
        assertEquals("Bienvenue dans l'application!", welcomeLabel.getText());
    }
    
    @Test
    public void testButtonClick(FxRobot robot) {
        // État initial
        assertEquals(0, controller.getClickCount());
        
        // Simuler un clic sur le bouton
        robot.clickOn("#clickButton");
        
        // Vérifier que le compteur a été incrémenté
        assertEquals(1, controller.getClickCount());
        assertEquals("Nombre de clics: 1", welcomeLabel.getText());
        
        // Simuler un second clic
        robot.clickOn("#clickButton");
        
        // Vérifier que le compteur a été incrémenté à nouveau
        assertEquals(2, controller.getClickCount());
        assertEquals("Nombre de clics: 2", welcomeLabel.getText());
    }
    
    @Test
    public void testSetEnvironment() {
        // Appeler la méthode avec un environnement de test
        controller.setEnvironment("test");
        
        // Vérifier que le label est mis à jour correctement
        assertEquals("Environnement: test", envLabel.getText());
    }
}