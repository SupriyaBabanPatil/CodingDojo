package com.codingDojo;

public class MyCalendar {

    public static boolean isLeapYear(final int year) {
        if (year <= 0)
            throw new IllegalArgumentException("Invalid year value");
        if (year % 400 == 0)
            return true;
        return false;
    }
}
