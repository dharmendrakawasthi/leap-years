package com.leapyear;

public class LeapYearCheck {
	
	/*
	 *  The method setCalenderType(YearDetails year) is to set the calendar type for year
	 *  It takes YearDetails POJO object with year defined already
	 */
	public static YearDetails setCalendarType(YearDetails year)throws IllegalArgumentException, NullPointerException {	
		
		if(year.getYear() <= 1582) {
			year.setCalenderType("JU");
		}else if(year.getYear() > 1982) {
			year.setCalenderType("GR");
		}
		return year;
	}
}
