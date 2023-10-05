package com.juhnkim.views;

import com.juhnkim.helpers.StringFormatter;
import com.juhnkim.models.Clock;
import com.juhnkim.models.ClockStates;

import java.util.Scanner;

public class ClockApplication {
    Scanner scan = new Scanner(System.in);
    String userInput = "";

    StringFormatter stringFormatter = new StringFormatter();
    Clock clock = new Clock();
    ClockStates clockStates = new ClockStates(clock, stringFormatter);

    public void timeMenu() {
        while (!userInput.equals("0")) {
            System.out.println("------------------------------------------------------");
            System.out.println("Current State: " + clockStates.getCurrentState());
            System.out.println("------------------------------------------------------");
            System.out.println("""
                    -- CLOCK --\s
                    1. Display Time \s
                    2. Edit time\s
                    3. Display Date\s
                    0. Exit""");

            userInput = scan.nextLine();
            switch (userInput) {
                case "1":
                    clockStates.set();
                    break;
                case "2":
                    System.out.println("Enter new time in the format: 'HH:mm'");
                    userInput = scan.nextLine();
                    clockStates.setCurrentState(ClockStates.STATE.ChangeTime);
                    clockStates.readyToSet(userInput);
                    changeTimeMenu();
                    break;
                case "3":
                    clockStates.changeMode();
                    dateMenu();
                    break;
                case "0":
                    System.out.println("Bye :(");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public void dateMenu() {
        while (!userInput.equals("0")) {
            System.out.println("------------------------------------------------------");
            System.out.println("Current State: " + clockStates.getCurrentState());
            System.out.println("------------------------------------------------------");
            System.out.println("""
                    -- CLOCK --\s
                    1. Display Date\s
                    2. Edit date\s
                    3. Display Time\s
                    0. Exit""");

            userInput = scan.nextLine();
            switch (userInput) {
                case "1":
                    clockStates.set();
                    break;
                case "2":
                    System.out.println("Enter new date in the format: 'yyyy-MM-dd'");
                    userInput = scan.nextLine();
                    clockStates.setCurrentState(ClockStates.STATE.ChangeDate);
                    clockStates.readyToSet(userInput);
                    changeDateMenu();
                    break;
                case "3":
                    clockStates.changeMode();
                    timeMenu();
                case "0":
                    System.out.println("Bye :(");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public void changeTimeMenu() {
        while (!userInput.equals("0")) {
            System.out.println("------------------------------------------------------");
            System.out.println("Current State: " + clockStates.getCurrentState());
            System.out.println("------------------------------------------------------");
            System.out.println("""
                    -- CLOCK --\s
                    1. Display Time\s
                    2. Edit Time\s
                    0. Exit""");

            userInput = scan.nextLine();
            switch(userInput) {
                case "1" :
                    // ändra logik?
                    clockStates.setCurrentState(ClockStates.STATE.DisplayTime);
                    timeMenu();
                    break;
                case "2" :
                    System.out.println("Enter new time in the format: 'HH:mm'");
                    userInput = scan.nextLine();
                    clockStates.readyToSet(userInput);
                    changeTimeMenu();
                    break;
                case "0":
                    System.out.println("Bye :(");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public void changeDateMenu() {
        while (!userInput.equals("0")) {
            System.out.println("------------------------------------------------------");
            System.out.println("Current State: " + clockStates.getCurrentState());
            System.out.println("------------------------------------------------------");
            System.out.println("""
                    -- CLOCK --\s
                    1. Edit Date\s
                    2. Display Date\s
                    0. Exit""");

            userInput = scan.nextLine();
            switch(userInput) {
                case "1" :
                    System.out.println("Enter new date in the format: 'yyyy-MM-dd'");
                    userInput = scan.nextLine();
                    clockStates.readyToSet(userInput);
                    changeDateMenu();
                    break;
                case "2" :
                    clockStates.setCurrentState(ClockStates.STATE.DisplayDate);
                    dateMenu();
                case "0":
                    System.out.println("Bye :(");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

}
