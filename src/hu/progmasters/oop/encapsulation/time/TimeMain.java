package hu.progmasters.oop.encapsulation.time;

import java.util.Arrays;

public class TimeMain {
    public static void main(String[] args) {
        Time currentTime = new Time(44, 88, 26);
        currentTime.testPrint();
        currentTime.setHour(55);
        currentTime.testPrint();
    }
}
