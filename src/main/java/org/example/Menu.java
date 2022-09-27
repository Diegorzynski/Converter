package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static Logger log = LogManager.getLogger(Main.class);
    private static Scanner scanner = new Scanner(System.in);
    public static int convertor;

    public static void menu(){
        scanner = new Scanner(System.in);
        log.trace("Choose your convertor: \n" +
                "1. Measure Convertor\n" +
                "2. Time Convertor");
    try {
        convertor = scanner.nextInt();
    } catch (InputMismatchException e){
        log.warn("Please enter a whole number");
        menu();
        scanner.close();
    }

        switch (convertor){

            case 2 :
                TimeConvertorMenu.menu();
                break;
            case 1 :
                MeasureConvertorMenu.menu();
                break;
        }
    }

    public static void checkShutDown(){
        log.trace("Would like to convert anything else? y/n");
        String anythingElse = scanner.next();
        if(anythingElse.toLowerCase().equals("y")){
            menu();
        } else {
            log.trace("Shutting down");
            scanner.close();
        }
    }
}
