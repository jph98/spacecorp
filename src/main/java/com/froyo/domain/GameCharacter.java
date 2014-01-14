package com.froyo.domain;

import java.util.Set;

import com.froyo.Action;
import com.google.common.base.Objects;

public class GameCharacter {

    private int number;
    private String type;
    private String name;
    private String color;
    private Set<Action> actions;
    
    public void init(int number, String type, String name, String color, Set<Action> actions) {
        this.number = number;
        this.type = type;
        this.name = name;
        this.color = color;
        this.actions = actions;
    }

    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public Set<Action> getActions() {
        return actions;
    }
    
    public void setActions(Set<Action> actions) {
        this.actions = actions;
    }
    
    public String toString() {
        
        return Objects.toStringHelper(this)
                .addValue(type)
                .addValue(name)
                .addValue(color)
                .addValue(actions)
                .toString();                
    }
}
