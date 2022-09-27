package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TimeConverter {

    private static Logger log = LogManager.getLogger(TimeConverter.class);
    public int hoursToMinutes(int hours){
        return hours * 60;
    }

    public double minutesToSeconds(double minutes){
        return minutes * 60;
    }

    public int secondsToMilliseconds(int seconds){
        return seconds * 1000;
    }
}
