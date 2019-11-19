package com.company.Movie;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class MovieTime {
    private LocalDate releaseDate;
    private Duration filmDuration;
    int releaseYear;
    int releaseMonth;
    int releaseDay;
    private int timesPlayed;

    public MovieTime(int releaseYear, int releaseMonth, int releaseDay, Duration filmDuration) {
        this.releaseDate = LocalDate.of(releaseYear, releaseMonth, releaseDay);
        this.filmDuration = filmDuration;
    }

    public String dayOfTheRelease() {
        return "The movie was released on " + releaseDate.getDayOfWeek();
    }

    public String timesPlayedInQOfYears(long yearsIn) {
        for (LocalDate currentDate = releaseDate; currentDate.isBefore(releaseDate.plusYears(yearsIn)); currentDate = currentDate.plusDays(1)) {
            if (currentDate == releaseDate) {
                timesPlayed++;
            }
            if (currentDate.getDayOfWeek() == DayOfWeek.SUNDAY || currentDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
                timesPlayed++;
            }
        }
        return "In first " + yearsIn + " years the movie was played " + timesPlayed + " times.";
    }

    public String durationPlayedInQOfYears(long yearsIn) {
        timesPlayed = 0;
        timesPlayedInQOfYears(yearsIn);
        Duration spanFor2Years = filmDuration.multipliedBy(timesPlayed);
        long totalDays = spanFor2Years.toDays();
        long totalHours = spanFor2Years.toHours() - (totalDays * 24);
        long totalMinutes = spanFor2Years.toMinutes() - (totalDays * 1440) - (totalHours * 60);
        return "Total time during first " + yearsIn + " years = " + totalDays + " days, " + totalHours + " hours, "
                + totalMinutes + " minutes.";
    }

    public String bonusTimesPlayedInQOfYears(long yearsIn) {
        timesPlayed = 0;
        for (LocalDate currentDate = releaseDate; currentDate.isBefore(releaseDate.plusYears(yearsIn)); currentDate = currentDate.plusDays(1)) {
            if (currentDate == releaseDate) {
                timesPlayed++;
            }
            if (currentDate.getDayOfWeek() == DayOfWeek.SUNDAY || currentDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
                if (currentDate.getMonth() == Month.JANUARY && currentDate.getDayOfMonth() == 1) {
                } else {
                    timesPlayed++;
                }
            }
            if (currentDate.getMonth() == Month.FEBRUARY && currentDate.getDayOfMonth() == 29) {
                timesPlayed++;
            }
        }
        return "In first " + yearsIn + " years the movie was played " + timesPlayed + " times.";
    }

    public String bonusDurationPlayedInQOfYears(long yearsIn) {
        timesPlayed = 0;
        bonusTimesPlayedInQOfYears(yearsIn);
        Duration spanFor2Years = filmDuration.multipliedBy(timesPlayed);
        long totalDays = spanFor2Years.toDays();
        long totalHours = spanFor2Years.toHours() - (totalDays * 24);
        long totalMinutes = spanFor2Years.toMinutes() - (totalDays * 1440) - (totalHours * 60);
        return "Total time during first " + yearsIn + " years = " + totalDays + " days, " + totalHours + " hours, "
                + totalMinutes + " minutes.";
    }
}
