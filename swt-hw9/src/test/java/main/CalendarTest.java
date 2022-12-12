package main;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.ValueSource;
import main.Calendar;
import java.util.GregorianCalendar;
import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    @ParameterizedTest
    @ValueSource(ints = {1904})
    public void Should_return_true(int year) {
        Calendar cal = new Calendar(year);
        assertTrue(cal.isLeapYear());
    }

    @ParameterizedTest
    @ValueSource(ints = {1804, 2004})
    public void Should_return_false(int year) {
        Calendar cal = new Calendar(year);
        assertFalse(cal.isLeapYear());
    }

    @ParameterizedTest
    @ValueSource(ints = {1904, 1908, 1912, 1916, 1920})
    public void Should_return_if_leap_year_is_also_in_gregorian(int year) {
        Calendar cal = new Calendar(year);
        GregorianCalendar GreCal = new GregorianCalendar();
        assertEquals(GreCal.isLeapYear(year), cal.isLeapYear());
    }

}
