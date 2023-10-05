package com.juhnkim.models;

import com.juhnkim.helpers.StringFormatter;
import com.juhnkim.interfaces.ActionInterface;

public class ClockStates implements ActionInterface {

    private STATE currentState = STATE.DisplayTime;
    private Clock clock;
    private StringFormatter stringFormatter;

    public ClockStates(Clock clock, StringFormatter stringFormatter) {
        this.clock = clock;
        this.stringFormatter = stringFormatter;
    }

    public STATE getCurrentState() {
        return currentState;
    }

    public void setCurrentState(STATE currentState) {
        this.currentState = currentState;
    }

    @Override
    public void changeMode() {
        if(getCurrentState() == STATE.DisplayTime) {
            setCurrentState(STATE.DisplayDate);
        } else if(getCurrentState() == STATE.DisplayDate){
            setCurrentState(STATE.DisplayTime);
        } else {
            System.out.println("Invalid State");
        }
    }

    @Override
    public void set() {
        if(getCurrentState() == STATE.DisplayTime) {
            System.out.println(clock.getLocalTime());
        }else {
            System.out.println(clock.getLocalDate());
        }
    }

    @Override
    public void readyToSet(String userInput) {
        StringFormatter sf = new StringFormatter();
        if(getCurrentState() == STATE.ChangeTime) {
            clock.setLocalTime(sf.parseTime(userInput));
        } else if(getCurrentState() == STATE.ChangeDate) {
            clock.setLocalDate(sf.parseDate(userInput));
        }
    }


    public enum STATE {
        DisplayTime,
        ChangeTime,
        DisplayDate,
        ChangeDate
    }
}
