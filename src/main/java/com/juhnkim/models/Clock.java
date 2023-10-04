package com.juhnkim.models;

import com.juhnkim.interfaces.ActionInterface;

import java.time.LocalDate;
import java.time.LocalTime;

public class Clock implements ActionInterface {

    private LocalDate localDate;
    private LocalTime localTime;
    private ClockState clockState;


    public Clock() {

    }

    public Clock(LocalDate localDate, LocalTime localTime, ClockState clockState) {
        this.localDate = localDate;
        this.localTime = localTime;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
    public LocalTime getLocalTime() {
        return localTime;
    }
    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }


    @Override
    public void changeMode() {
        // TODO Auto-generated method stub

    }

    @Override
    public void set() {
        // TODO Auto-generated method stub

    }

    @Override
    public void readyToSet() {
        // TODO Auto-generated method stub

    }
}
