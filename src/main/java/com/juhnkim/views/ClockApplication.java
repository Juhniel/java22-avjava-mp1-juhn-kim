package com.juhnkim.views;

import com.juhnkim.models.ClockStates;

import java.util.Scanner;

public class ClockApplication {
    Scanner scan = new Scanner(System.in);
    String userInput = "";
    ClockStates clockStates = new ClockStates();


    public static void main(String[] args) {
        ClockApplication ca = new ClockApplication();
        ca.timeMenu();
    }

    public void timeMenu() {
        while (!userInput.equals("0")) {
            System.out.println("------------------------------------------------------");
            System.out.println("Current State: " + clockStates.getCurrentState());
            System.out.println("------------------------------------------------------");
            clockStates.set();
            System.out.println("""
                    -- CLOCK --\s
                    1. Edit time\s
                    2. Display Date\s
                    0. Exit""");

            userInput = scan.nextLine();
            switch (userInput) {
                case "1":
                    System.out.println("Enter new time in the format: 'HH:mm'");
                    userInput = scan.nextLine();
                    clockStates.readyToSet(userInput);
                    changeTimeMenu();
                    break;
                case "2":
                    clockStates.changeMode();
                    dateMenu();
                    break;
                case "0":
                    System.out.println("Bye :(");
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
            clockStates.set();
            System.out.println("""
                    -- CLOCK --\s
                    1. Edit date\s
                    2. Display Time\s
                    0. Exit""");

            userInput = scan.nextLine();
            switch (userInput) {
                case "1":
                    System.out.println("Enter new date in the format: 'yyyy-MM-dd'");
                    userInput = scan.nextLine();
                    clockStates.readyToSet(userInput);
                    changeDateMenu();
                    break;
                case "2":
                    clockStates.changeMode();
                    timeMenu();
                case "0":
                    System.out.println("Bye :(");
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
                    3. Exit""");

            userInput = scan.nextLine();
            switch(userInput) {
                case "1" :
                    timeMenu();
                    break;
                case "0":
                    System.out.println("Bye :(");
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
                    1. Display Date\s
                    0. Exit""");

            userInput = scan.nextLine();
            switch(userInput) {
                case "1" :
                    dateMenu();
                    break;
                case "0":
                    System.out.println("Bye :(");
                default:
                    System.out.println("Invalid input");
            }
        }
    }

}
