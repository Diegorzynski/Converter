package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TimeConvertor {

    private static Logger log = LogManager.getLogger(TimeConvertor.class);
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
