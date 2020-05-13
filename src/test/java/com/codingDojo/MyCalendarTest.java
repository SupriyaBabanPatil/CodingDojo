package com.codingDojo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class MyCalendarTest {

    @Test
    public void shouldCreateClassAndMethod() {
        assertFalse(MyCalendar.isLeapYear(1));

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnZeroValueForYear() {
        MyCalendar.isLeapYear(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegativeValueForYear() {
        MyCalendar.isLeapYear(-1);
    }
}
