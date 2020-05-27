# leap-years
Check if the year is a leap year 
# Purpose of project:
This project aims to show case the Test Driven Development (TDD), using JUnit 5.

# Libraries Used 
JUnit 5+

# Maven plug-in
Jacoco 0.8.5, maven-surefire-plugin 2.21.0, junit-platform-surefire-provider 1.2.0
# Functionality 
leap-year is ment to determine if year is a leap year, so that user can plan the task for one more day for febraury.

# Test Cases 
1) Check if year is of Julian Calender
2) Check if year is of Gregorian Calender
3) Check if object passed have year as null
4) Check if year is of Julian Calender and it is a leap year
5) Check if year is of Gregorian Calendar and it is a leap year
6) Check if year belongs to Gregorian Calendar and checking for Julian Calendar
7) Check if year belongs to Gregorian Calendar and checking for Julian Calendar
8) Check if year is of Julian Calendar and it is not a leap year
9) Check if year is of Gregorian Calendar and it is not a leap year

# How to run project
>mvn clean package

# Code Review report
> leap-years/target/site/jacoco/index.html