package com.company.Flight;

import java.time.*;

public class DurationOfFlight {
    public DurationOfFlight(String departZone, String arriveZone,
                            int departYear, int departMonth, int departDay, int departHour, int departMinute,
                            int arriveYear, int arriveMonth, int arriveDay, int arriveHour, int arriveMinute) {

        ZoneId departZ = ZoneId.of(departZone);
        ZoneId arriveZ = ZoneId.of(arriveZone);
        LocalDateTime departT = LocalDateTime.of(departYear, departMonth, departDay, departHour, departMinute);
        LocalDateTime arriveT = LocalDateTime.of(arriveYear, arriveMonth, arriveDay, arriveHour, arriveMinute);
        ZonedDateTime dep = ZonedDateTime.of(departT, departZ);
        ZonedDateTime arr = ZonedDateTime.of(arriveT, arriveZ);
        Instant departingInstant = dep.toInstant();
        Instant arrivingInstant = arr.toInstant();
        Duration duration = Duration.between(departingInstant, arrivingInstant);
        System.out.println(duration);

    }
}
