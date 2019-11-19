package com.company;

public class Main {

    public static void main(String[] args) {
                League<Basketball> league = new League("NBA");
        Basketball basketball1 = new Basketball("LA Lakers");
        Basketball basketball2 = new Basketball("Chicago Bulls");
        Basketball basketball3 = new Basketball("Boston Celtics");
        league.add(basketball1);
        league.add(basketball2);
        league.add(basketball3);
        System.out.println("League name: " + league.getLeagueName());
        for (int i = 0; i <league.teamList.size() ; i++) {
            System.out.println(league.teamList.get(i));
        }
        System.out.println();

        League<Volleyball> league2 = new League<>("USA Volleyball");
        Volleyball volley1 = new Volleyball("USA National Team");
        Volleyball volley2 = new Volleyball("Italy National Team");
        Volleyball volley3 = new Volleyball("Australia National Team");
        league2.add(volley1);
        league2.add(volley2);
        league2.add(volley3);
        System.out.println("League name: " + league2.getLeagueName());
        for (int i = 0; i <league2.teamList.size() ; i++) {
            System.out.println(league2.teamList.get(i));
        }
        System.out.println();

        League<Golf> league3 = new League<>("The US Open");
        Golf golf1 = new Golf("Georgia Tech");
        Golf golf2 = new Golf("Texas Longhorns");
        Golf golf3 = new Golf("Arizona State");
        league3.add(golf1);
        league3.add(golf2);
        league3.add(golf3);
        System.out.println("League name: " + league3.getLeagueName());
        for (int i = 0; i <league3.teamList.size() ; i++) {
            System.out.println(league3.teamList.get(i));
        }
    }
}
