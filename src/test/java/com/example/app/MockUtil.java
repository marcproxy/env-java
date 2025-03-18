package com.example.app;

/**
 * Utilitaire pour les tests avec mock JavaFX.
 */
public class MockUtil {
    
    /**
     * Crée un mock pour Label.
     */
    public static class MockLabel {
        private String text;
        
        public void setText(String text) {
            this.text = text;
        }
        
        public String getText() {
            return this.text;
        }
    }
    
    /**
     * Crée un mock pour Button.
     */
    public static class MockButton {
        private String text;
        
        public void setText(String text) {
            this.text = text;
        }
        
        public String getText() {
            return this.text;
        }
    }
}