package com.juhnkim.helper;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringFormatter {

    public LocalTime parseTime(String timeString) {
        DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("H:mm:ss");
        LocalTime time = LocalTime.parse(timeString, parseFormat);
        return time;
    }

    public LocalDate parseDate(String dateString) {
        DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateString, parseFormat);
        return date;
    }
}
