package main;

public class Main {
    public static void main (String[] args) {
        Team asiaTeam = new Team("Asia Team");
        Team africaTeam = new Team("Africa Team");
        Team europeTeam = new Team("Europe Team");
        Team southAmerikaTeam = new Team("South Amerika Team");
        Team afghanistanTeam = new Team("Afghanistan Team");
        Team chinaTeam = new Team("China Team");
        Team germanTeam = new Team("German Team");
        Team italyTeam = new Team ("Italy Team");
        Team chinaWomen = new Team("China Women");
        Team chinaMen = new Team("China men");
        Team germanWomen = new Team("German Women");
        Team germanMen = new Team("German men");
        Team italyWomen = new Team("Italy Women");
        Team italyMen = new Team("Italy Men");

        Athletes teakwondo = new Athletes("Womens Teakwondo", 7, 3);
        Athletes waterpolo = new Athletes("Womens Waterpolo", 7, 3);
        Athletes artGym = new Athletes("Womens Artistic Gymnastics",7, 3);
        Athletes shooting = new Athletes("Mens Shooting", 7, 3);
        Athletes cycling = new Athletes("Womens Cycling", 7, 3 );
        Athletes tennis = new Athletes("German Womens Tennis", 7, 3);
        Athletes tableTennis = new Athletes("Mens table Tennis", 7, 3);
        Athletes footballGe = new Athletes("German Mens Football", 11, 11);
        Athletes alpSki = new Athletes("Italian Womens Alpine Ski", 7, 3);
        Athletes footballIt = new Athletes("Italian Mens Football", 11, 0);
        Athletes swimming = new Athletes("Italian Mens Swimming", 7, 3);


        asiaTeam.subOlympicTeams.add(chinaTeam);
        asiaTeam.subOlympicTeams.add(afghanistanTeam);
        europeTeam.subOlympicTeams.add(germanTeam);
        europeTeam.subOlympicTeams.add(italyTeam);
        chinaTeam.subOlympicTeams.add(chinaWomen);
        chinaTeam.subOlympicTeams.add(chinaMen);
        germanTeam.subOlympicTeams.add(germanWomen);
        germanTeam.subOlympicTeams.add(germanMen);
        italyTeam.subOlympicTeams.add(italyWomen);
        italyTeam.subOlympicTeams.add(italyMen);

        chinaWomen.subOlympicTeams.add(teakwondo);
        chinaWomen.subOlympicTeams.add(waterpolo);
        chinaWomen.subOlympicTeams.add(artGym);
        chinaMen.subOlympicTeams.add(shooting);

        germanWomen.subOlympicTeams.add(cycling);
        germanWomen.subOlympicTeams.add(tennis);
        germanMen.subOlympicTeams.add(tableTennis);
        germanMen.subOlympicTeams.add(footballGe);

        italyWomen.subOlympicTeams.add(alpSki);
        italyMen.subOlympicTeams.add(footballIt);
        italyMen.subOlympicTeams.add(swimming);

        germanTeam.getAthletes();

    }

}

