package com.leapyear;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeapYearCheckTest {

	@Test
	void testSetCalenderType() {
		
		// Check if year is of Gregorian Calender
		YearDetails yearDetails = new YearDetails(2000);
		LeapYearCheck.setCalendarType(yearDetails);
		
		Assertions.assertNotNull(yearDetails);
		Assertions.assertEquals(yearDetails.getCalenderType(), "GR");
		Assertions.assertTrue(yearDetails.getYear() > 0);
		
		// Check if year is of Julian Calender
		YearDetails yearDetails2 = new YearDetails(1581);
		LeapYearCheck.setCalendarType(yearDetails2);
		
		Assertions.assertNotNull(yearDetails2);
		Assertions.assertEquals(yearDetails2.getCalenderType(), "JU");
		Assertions.assertTrue(yearDetails2.getYear() > 0);
		
		// Check if object passed have year as null
		YearDetails yearDetails3 = new YearDetails();
	    Assertions.assertThrows(NullPointerException.class,()->{
	    	LeapYearCheck.setCalendarType(yearDetails3);
	    });
	    
	}

}
