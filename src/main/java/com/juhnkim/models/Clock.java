package com.juhnkim.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock  {

    private LocalDate localDate;
    private LocalTime localTime;

    public Clock() {
        this.localDate = LocalDate.now();
        this.localTime = LocalTime.now();
    }

    public String getLocalDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return localDate.format(formatter);
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
    public String getLocalTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return "Current time: " + localTime.format(formatter);
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }
}
