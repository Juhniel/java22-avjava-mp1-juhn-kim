package com.juhnkim.views;

import com.juhnkim.helper.StringFormatter;
import com.juhnkim.models.Clock;

import java.util.Scanner;

public class ClockApplication {
    Scanner scan = new Scanner(System.in);
    String userInput = scan.nextLine();
    Clock clock = new Clock();
    StringFormatter sf = new StringFormatter();

    public void runClockApp() {




        while (userInput != "6") {


            System.out.println("-- CLOCK -- \n " + "1. Display time \n" + "2. Display Date \n" + "6. Exit");

            switch (userInput) {
                case "1":
                    clock.getLocalTime();

                    break;
                case "2":
                    clock.getLocalDate();
            }
        }
    }


    public void clockMenu() {
        while(userInput != "3") {
            System.out.println("-- CLOCK -- \n " + "1. Edit time \n" + "2. Display Date \n" + "3. Back");

            switch(userInput) {
                case "1":
                    System.out.println("Enter new time in the format: 'H:mm:ss'");
            }
        }
    }

    public void dateMenu() {
        while(userInput != "3") {
            System.out.println("-- CLOCK -- \n " + "1. Edit date \n" + "2. Display Time \n" + "3. Back");

            switch(userInput) {
                case "1":
                    System.out.println("Enter new date in the format: 'dd-MM-yyyy'");
            }
        }


    }


}
