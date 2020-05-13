package com.codingDojo;

public class MyCalendar {

    public static boolean isLeapYear(final int year) {
        if (year <= 0)
            throw new IllegalArgumentException("Invalid year value");
        return isDivisibleBy(year, 400) || !isDivisibleBy(year, 100) && isDivisibleBy(year, 4);
    }

    private static boolean isDivisibleBy(final int year, final int i) {
        return year % i == 0;
    }
}
