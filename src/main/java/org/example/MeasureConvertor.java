package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MeasureConvertor {

    private static Logger log = LogManager.getLogger(MeasureConvertor.class);

    public double metersToCentimeters(double meters){
        return meters * 100;
    }

    public double metersToMillimeters(double meters){
        return meters/1000;
    }

    public double centimetersToMeters(double centimeters){
        return centimeters/100;
    }

    public double millimetersToMeters(int millimeters){
        return millimeters / 1000;
    }
}
