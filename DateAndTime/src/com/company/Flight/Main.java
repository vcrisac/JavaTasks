package com.company.Flight;
//Frodo Baggins takes the plane from Sydney (SYD) to Los Angeles (LAX).
//The flight starts at 11:15 AM local Sydney time and ends at 06:00 AM local LA time.
//What is the duration of the flight?

public class Main {
    public static void main(String[] args) {

        DurationOfFlight durationOfFlight;
        durationOfFlight = new DurationOfFlight("Australia/Sydney", "America/Los_Angeles",
                2015, 02, 20, 11, 15,
                2015, 02, 20, 06, 00);
    }
}
