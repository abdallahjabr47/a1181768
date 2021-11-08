package edu.Birzeit.abdallah.models;

public class Team {
    private String Name;

    public Team(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
