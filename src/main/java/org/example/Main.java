package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class Main {

    private static Logger log = LogManager.getLogger(Main.class);

    private static Scanner scanner = new Scanner(System.in);

    private static MeasureConvertor measureConvertor = new MeasureConvertor();
    private static TimeConvertor timeConvertor = new TimeConvertor();
    private static int typeToConvert;
    public static int convertor;

    public static void main(String[] args) {

        log.trace("Chose your convertor: \n" +
                "1. Measure Convertor\n" +
                "2. Time Convertor");

        convertor = scanner.nextInt();


        switch (convertor){

            case 2 :
                TimeConvertorMenu.menu();
                break;
            case 1 :

                MeasureConvertorMenu.menu();
                break;
        }
    }
}