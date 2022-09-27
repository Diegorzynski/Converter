package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Scanner;

public class TimeConvertorMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static Logger log = LogManager.getLogger(TimeConvertorMenu.class);
    private static TimeConvertor timeConvertor = new TimeConvertor();
    private static int typeToConvert;

    public static void menu() {

        log.trace("Chose the time measures to convert:\n" +
                "1. Hours to Minutes\n" +
                "2. Minutes to Seconds\n" +
                "3. Seconds to Milliseconds.");
        typeToConvert = scanner.nextInt();

        if (typeToConvert == 1) {
            log.trace("Enter the hours");
            int hours = scanner.nextInt();
            log.trace("Result in minutes: " +timeConvertor.hoursToMinutes(hours));
            Menu.checkShutDown();
        } else if (typeToConvert == 2) {
            log.trace("Enter the minutes");
            int minutes = scanner.nextInt();
            log.trace("Result in seconds: " +timeConvertor.minutesToSeconds(minutes));
            Menu.checkShutDown();
        } else if (typeToConvert == 3) {
            log.trace("Enter the seconds");
            int seconds = scanner.nextInt();
            log.trace("Result in milliseconds: " + timeConvertor.secondsToMilliseconds(seconds));
            Menu.checkShutDown();
        }
    }
}
