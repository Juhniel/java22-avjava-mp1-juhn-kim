package com.juhnkim.models;

import com.juhnkim.helpers.StringFormatter;

import java.time.LocalDate;
import java.time.LocalTime;

public class Clock {
    private StringFormatter stringFormatter;
    private LocalDate localDate;
    private LocalTime localTime;

    public Clock() {
        this.localDate = LocalDate.now();
        this.localTime = LocalTime.now();
    }

    public LocalDate getLocalDate() {

        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalTime getLocalTime() {
//        formatter = DateTimeFormatter.ofPattern("HH:mm");
//        return "Current time: " + localTime.format(formatter);
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }
}
