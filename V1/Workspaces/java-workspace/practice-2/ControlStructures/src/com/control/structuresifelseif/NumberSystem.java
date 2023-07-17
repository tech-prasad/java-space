package com.control.structuresifelseif;

public class NumberSystem {
	public static void main(String[] args) {

		int number = 0;

		if (number > 0) {
			System.out.println("Given number is Positive: " + number);
		} else if (number < 0) {
			System.out.println("Given number is Negative: " + number);
		} else {
			System.out.println("Given number is Zero");
		}
	}
}
