package com.company.Movie;

import java.time.Duration;

//Star Wars Episode IV was released on May 25, 1977 and has a running time of 120 minutes.
//Assume that it was played in cinemas on premiere (May 25, 1977) and then only once a day on every Saturday and Sunday
//What day of the week was it released?
//How many times was it played in the first 2 years?
//How many TOTAL minutes/hours/days of playtime it summed up in the 1st year?

public class Main {
    public static void main(String[] args) {
        MovieTime starWars = new MovieTime (1977, 05, 25, Duration.ofMinutes(120));
        System.out.println(starWars.dayOfTheRelease());
        System.out.println(starWars.timesPlayedInQOfYears(2));
        System.out.println(starWars.durationPlayedInQOfYears(1));
        System.out.println(starWars.bonusTimesPlayedInQOfYears(2));
        System.out.println(starWars.bonusDurationPlayedInQOfYears(1));
    }
}
