package main;

public class Athletes implements OlympicTeams{
    public String name;
    public int athleteNumber;
    public int goldNumber;

    public Athletes(String name, int athleteNumber, int goldNumber) {
        this.name = name;
        this.athleteNumber = athleteNumber;
        this.goldNumber = goldNumber;

    }

    @Override
    public void getAthletes() {
        System.out.println("Team: " + name + ": " + athleteNumber);
    }

    @Override
    public void getGold() {
        System.out.println("Team: " + name + ": " + goldNumber);


    }

    @Override
    public String getName() {
        return name;
    }

}
