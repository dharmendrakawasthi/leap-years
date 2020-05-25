package com.leapyear;

public class YearDetails {

	private Integer year;
	private String calenderType;
	private Boolean isLeapYear;
	
	public YearDetails() {}

	public YearDetails(Integer year) {
		this.year = year;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getCalenderType() {
		return calenderType;
	}

	public void setCalenderType(String calenderType) {
		this.calenderType = calenderType;
	}

	public Boolean getIsLeapYear() {
		return isLeapYear;
	}

	public void setIsLeapYear(Boolean isLeapYear) {
		this.isLeapYear = isLeapYear;
	}
}
