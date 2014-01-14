package com.froyo.domain;

import com.google.common.base.Objects;


public class GameAction {
    
    private String description;

    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .addValue(description)
                .toString();
    }
}
