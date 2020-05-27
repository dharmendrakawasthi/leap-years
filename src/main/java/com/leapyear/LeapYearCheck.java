package com.leapyear;

public class LeapYearCheck {

	/*
	 * The method setCalenderType(YearDetails year) is to set the calendar type for
	 * year It takes YearDetails POJO object with year defined already
	 */
	public YearDetails setCalendarType(YearDetails year) {

		if (year.getYear() == 0 || year.getYear() == null) {
			return null;
		}

		if (year.getYear() <= 1582) {
			year.setCalenderType("JU");
		} else if (year.getYear() > 1582) {
			year.setCalenderType("GR");
		}
		return year;
	}

	/*
	 * The method setisLeapYear(YearDetails year) is to set the leap year check
	 * Method takes YearDetails POJO with year and calendar type defines
	 */
	public YearDetails setisLeapYear(YearDetails year) {

		if ((year.getCalenderType() == "JU" && year.getYear() > 1582)
				|| (year.getCalenderType() == "GR" && year.getYear() < 1582)) {
			throw new InvaliedValueException("Invalied Value");
		}

		if (year.getYear() % 4 != 0) {
			year.setIsLeapYear(false);
		}

		if (year.getYear() % 400 == 0) {
			year.setIsLeapYear(true);
		}

		if (year.getYear() % 4 == 0 && year.getYear() % 100 != 0) {
			year.setIsLeapYear(true);
		}

		if (year.getYear() % 100 == 0 && year.getYear() % 400 != 0) {
			year.setIsLeapYear(false);
		}

		return year;
	}
}
