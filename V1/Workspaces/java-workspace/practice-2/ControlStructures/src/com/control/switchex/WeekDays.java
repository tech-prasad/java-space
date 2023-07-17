package com.control.switchex;

public class WeekDays {

	public static void main(String[] args) {

		String weekDay = "Monday";

		switch (weekDay) {
		case "Monday":
			System.out.println("Its Monday-workday");
			break;
		case "Tuesday":
			System.out.println("Its Tuesday-workday");
			break;
		case "Wednessday":
			System.out.println("Its Wednessday-workday");
			break;
		case "Thersday":
			System.out.println("Its Thersday-workday");
			break;
		case "Friday":
			System.out.println("Its Friday-workday");
			break;
		case "Saturday":
			System.out.println("Its Saturday-Holiday");
			break;
		case "Sunday":
			System.out.println("Its Sunday-Holiday");
			break;
		}
	}
}
