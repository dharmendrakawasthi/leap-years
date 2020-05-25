package com.leapyear;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeapYearCheckTest {

	@Test
	void calenderTypeTest() {
		
		LeapYearCheck check = new LeapYearCheck();
		// Check if year is of Gregorian Calender
		YearDetails yearDetails = new YearDetails();
		yearDetails.setYear(2000);
		check.setCalendarType(yearDetails);
		
		Assertions.assertNotNull(yearDetails);
		Assertions.assertEquals(yearDetails.getCalenderType(), "GR");
		Assertions.assertTrue(yearDetails.getYear() > 0);
		
		// Check if year is of Julian Calender
		YearDetails yearDetails2 = new YearDetails();
		yearDetails2.setYear(1581);
		check.setCalendarType(yearDetails2);
		
		Assertions.assertNotNull(yearDetails2);
		Assertions.assertEquals(yearDetails2.getCalenderType(), "JU");
		Assertions.assertTrue(yearDetails2.getYear() > 0);
		
		// Check if object passed have year as null
		YearDetails yearDetails3 = new YearDetails();
	    Assertions.assertThrows(NullPointerException.class,()->{
	    	check.setCalendarType(yearDetails3);
	    });   
	}
}
