package com.codingDojo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
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

    @Test
    public void shouldReturnFalseForMultipleOf100AndNotMultipleOf400() {
        validateIsNotLeapYear(100);
        validateIsNotLeapYear(200);
        validateIsNotLeapYear(300);
        validateIsNotLeapYear(500);
    }

    @Test
    public void shouldReturnTrueForMultipleOf4() {
        validateIsLeapYear(4);
        validateIsLeapYear(8);
        validateIsLeapYear(16);
        validateIsLeapYear(96);
        validateIsLeapYear(104);
    }

    @Test
    public void shouldReturnFalseForNonMultipleOf4() {
        validateIsNotLeapYear(1);
        validateIsNotLeapYear(2);
        validateIsNotLeapYear(3);
        validateIsNotLeapYear(5);
        validateIsNotLeapYear(6);
        validateIsNotLeapYear(7);
    }

    private void validateIsLeapYear(final int year) {
        assertTrue(MyCalendar.isLeapYear(year));
    }

    private void validateIsNotLeapYear(final int year) {
        assertFalse(MyCalendar.isLeapYear(year));
    }

}
