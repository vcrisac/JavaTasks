package com.company;

import java.util.ArrayList;
import java.util.List;

public class League<newTeamName extends Sport> {
    private String leagueName;

    List<Sport> teamList = new ArrayList<>();

    public void add(Sport sportTeam) {
        teamList.add(sportTeam);
    }

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    @Override
    public String toString() {
        return "League{" +
                "leagueName='" + leagueName + '\'' +
                ", teamList=" + teamList +
                '}';
    }
}

