package com.edu.ocp.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.ResourceBundle;

public class App03 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.NOVEMBER, 6);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime1);

        ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
        System.out.println(dateTime2);

        long hours = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        int clock1 = dateTime1.getHour();
        int clock2 = dateTime2.getHour();

        System.out.println(hours + ", " + clock1 + ", " + clock2);

    }
}
