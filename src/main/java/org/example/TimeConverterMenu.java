package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TimeConverterMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static Logger log = LogManager.getLogger(TimeConverterMenu.class);
    private static TimeConverter timeConverter = new TimeConverter();
    private static int typeToConvert;

    public static void menu() {

        log.trace("Chose the time measures to convert:\n" +
                "1. Hours to Minutes\n" +
                "2. Minutes to Seconds\n" +
                "3. Seconds to Milliseconds.");
        typeToConvert = scanner.nextInt();

        if (typeToConvert == 1) {
            log.trace("Enter the hours");
            try {
                int hours = scanner.nextInt();
                log.trace("Result in minutes: " + timeConverter.hoursToMinutes(hours));
                Menu.checkShutDown();
            }catch (InputMismatchException e){
                log.error("Please enter a whole number");
                menu();
            }
        } else if (typeToConvert == 2) {
            log.trace("Enter the minutes");
            try {
                int minutes = scanner.nextInt();
                log.trace("Result in seconds: " + timeConverter.minutesToSeconds(minutes));
                Menu.checkShutDown();
            }catch (InputMismatchException e){
                log.error("Please enter a whole number");
                menu();
            }
        } else if (typeToConvert == 3) {
            log.trace("Enter the seconds");
            try {
                int seconds = scanner.nextInt();
                log.trace("Result in milliseconds: " + timeConverter.secondsToMilliseconds(seconds));
                Menu.checkShutDown();
            }catch (InputMismatchException e){
                log.error("Please enter a whole number");
                menu();
            }
        }
    }
}
