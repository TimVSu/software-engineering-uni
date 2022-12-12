package main;


import java.util.ArrayList;

public class Team implements OlympicTeams{
    public String name;

    public ArrayList<OlympicTeams> subOlympicTeams = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    @Override
    public void getAthletes() {
        System.out.print(this.name + ": \n");
        for(OlympicTeams sub : subOlympicTeams) {
            sub.getAthletes();
        }
    }

    @Override
    public void getGold() {
        System.out.print(this.name + ": \n");
        for(OlympicTeams sub : subOlympicTeams) {
            sub.getAthletes();
        }
    }

    @Override
    public String getName() {
        return name;
    }


}

