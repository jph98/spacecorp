package com.froyo;


public class RoundManager {

    
    public RoundManager() {
    }
    
    public void initialise() {

        assignCharacters();
    }
    
    public void assignCharacters() {

    }
    
    public void takeTurn() {

        System.out.println("Take turn");
        
        // Choose action
        takeLuna();

        applyCharacterSpecialActions();

        takeModule();

        // If player chooses, can't build identical buildings
        buildModule();
    }
    
    private void applyCharacterSpecialActions() {

    }
    
    private void buildModule() {

    }

    private void takeModule() {

    }

    private void takeLuna() {

    }

}
