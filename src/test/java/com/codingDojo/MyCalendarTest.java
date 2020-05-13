package com.codingDojo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyCalendarTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnZeroValueForYear() {
        MyCalendar.isLeapYear(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegativeValueForYear() {
        MyCalendar.isLeapYear(-1);
    }

    @Test
    public void shouldReturnTrueForMultipleOf400() {
        validateIsLeapYear(400);
        validateIsLeapYear(800);
        validateIsLeapYear(1600);
    }

    private void validateIsLeapYear(final int year) {
        assertTrue(MyCalendar.isLeapYear(year));
    }

}
