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
                "1. Centimeters to Meters\n" +
                "2. Meters to Millimeters\n" +
                "3. Centimeters to Meters\n" +
                "4, Meters to Centimeters");
        measureToConvert = scanner.nextInt();

        switch (measureToConvert){
            case 1 :
                log.trace("Enter the Centimeters");
                double centimeters = scanner.nextDouble();
                log.info("Result in meters: " + measureConvertor.centimetersToMeters(centimeters));
                Menu.checkShutDown();
                break;
            case 2 :
                log.trace("Enter the Meters");
                double minutes = scanner.nextDouble();
                log.info("Result in millimeters: " + measureConvertor.metersToMillimeters(minutes));
                Menu.checkShutDown();
                break;
            case 3 :
                log.trace("Enter the Millimeters");
                int millimeters = scanner.nextInt();
                log.info("Result in millimeters: " + measureConvertor.millimetersToMeters(millimeters));
                Menu.checkShutDown();
                break;
            case 4 :
                log.trace("Enter the Meters");
                double meters = scanner.nextDouble();
                log.info("Result: " + measureConvertor.metersToCentimeters(meters));
                Menu.checkShutDown();
                break;
        }
    }
}
