package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class MeasureConvertorMenu {

    private static Scanner scanner = new Scanner(System.in);
    private static Logger log = LogManager.getLogger(MeasureConvertorMenu.class);

    private static MeasureConvertor measureConvertor = new MeasureConvertor();

    private static int measureToConvert;

    public static void menu(){
        log.trace("Chose the time measures to convert:\n" +
                "1. Centimeters to Minutes\n" +
                "2. Meters to Milimeters\n" +
                "3. Centimeters to Meters\n" +
                "4, Meters to Centimeters");
        measureToConvert = scanner.nextInt();

        switch (measureToConvert){
            case 1 :
                log.trace("Enter the Centimeters");
                double centimeters = scanner.nextDouble();
                log.info("Result: " + measureConvertor.centimetersToMeters(centimeters));
                break;
            case 2 :
                log.trace("Enter the Meters");
                double minutes = scanner.nextDouble();
                log.info("Result: " + measureConvertor.metersToMilimeters(minutes));
                break;
            case 3 :
                log.trace("Enter the Milimeters");
                int milimeters = scanner.nextInt();
                log.info("Result: " + measureConvertor.metersToMilimeters(milimeters));
                break;
            case 4 :
                log.trace("Enter the Meters");
                double meters = scanner.nextDouble();
                log.info("Result: " + measureConvertor.metersToCentimeters(meters));
                break;
        }

    }

}
