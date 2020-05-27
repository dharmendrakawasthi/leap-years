package com.leapyear;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LeapYearCheckTest {

	LeapYearCheck check = null;
	YearDetails year = null;

	@BeforeEach
	void beforeEach() {
		this.check = new LeapYearCheck();
		this.year = new YearDetails();
	}

	@AfterEach
	void afterEach() {
		this.check = null;
		this.year = null;
	}

	@Test
	void julianTypeTest() {
		// Check if year is of Julian Calender
		this.year.setYear(1581);
		this.check.setCalendarType(this.year);
		Assertions.assertNotNull(this.year);
		Assertions.assertEquals(this.year.getCalenderType(), "JU");

		// Check if object passed have year as null
		this.year.setYear(null);
		Assertions.assertThrows(NullPointerException.class, () -> {
			this.check.setCalendarType(this.year);
		});
	}

	@Test
	void gregorianTypeTest() {

		// Check if year is of Gregorian Calender
		this.year.setYear(2000);
		this.check.setCalendarType(this.year);
		Assertions.assertNotNull(this.year);
		Assertions.assertTrue(this.year.getYear() > 0);
		Assertions.assertEquals(this.year.getCalenderType(), "GR");

		// Check if object passed have year as null
		this.year.setYear(null);
		Assertions.assertThrows(NullPointerException.class, () -> {
			check.setCalendarType(this.year);
		});
	}

	
}
