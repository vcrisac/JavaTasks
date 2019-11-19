package com.company;

public class Sport {
    private String teamName;

    public Sport(String teamName){
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Team name: " + teamName;
    }
}
