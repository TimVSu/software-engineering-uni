package test;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.ValueSource;
import main.Calendar;
import java.util.GregorianCalendar;
import static org.junit.jupiter.api.Assertions.*;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = {2008,2012,2016,2020, 1864, 1932})
	public void Should_return_true(int year) {
		Calendar cal = new Calendar(year);
		assertTrue(cal.isLeapYear());
		// Implement
	}

	@ParameterizedTest
	@ValueSource(ints = {1805, 1915, 1986, 2262})
	public void Should_return_false(int year) {
		Calendar cal = new Calendar(year);
		assertFalse(cal.isLeapYear());
		// Implement
	}

	@ParameterizedTest
	@ValueSource(ints = {1928, 2379, 1763, 2020})
	public void Should_return_if_year_is_leap(int year) {
		Calendar cal = new Calendar(year);
		GregorianCalendar GreCal = new GregorianCalendar();
		assertEquals(GreCal.isLeapYear(year), cal.isLeapYear());
		// Implement
	}

	// Create a new method for boundary testing
}
