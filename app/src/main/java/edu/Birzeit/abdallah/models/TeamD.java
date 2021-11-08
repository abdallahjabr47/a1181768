package edu.Birzeit.abdallah.models;

import java.util.ArrayList;
import java.util.List;

public class TeamD implements TeamData {
    private  List<Team> teams = new ArrayList<>();

    @Override
    public List<Team> getTeams() {
        teams.add(new Team("Palestine"));
        teams.add(new Team("Spain"));
        teams.add(new Team("England"));
        teams.add(new Team("Italy"));
        return teams;
    }

    public String[] getTeamsNames(){
        String[] teamsNames={"Palestine","Spain","England","Italy"};
        return teamsNames;
    }
}
