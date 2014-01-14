package com.froyo;

import java.util.Set;

import com.froyo.domain.GameCharacter;


public class GameContext {

    private Set<GameCharacter> characters;

    public void setCharacters() {
        
    }

    public void setBuildings() {
        
    }

    public boolean checkEndGameState() {

        // If player has built their spacestation with <maxmodules> the game finishes
        calculateScores();
        
        return false;
    }
    
    private void calculateScores() {

        // Number of modules - luna value
        // All colors - 5 points
        // First to <maxmodules> buildings - 5 points

        // Others?
    }

    public void addCharacter(GameCharacter c) {
        this.characters.add(c);
    }


}
