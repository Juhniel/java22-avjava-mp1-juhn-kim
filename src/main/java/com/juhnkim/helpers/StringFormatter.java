package com.juhnkim.helpers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringFormatter {

    public LocalTime parseTime(String timeString) {
        DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(timeString, parseFormat);
    }

    public LocalDate parseDate(String dateString) {
        DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("yy-MM-dd");
        return LocalDate.parse(dateString, parseFormat);
    }
}
