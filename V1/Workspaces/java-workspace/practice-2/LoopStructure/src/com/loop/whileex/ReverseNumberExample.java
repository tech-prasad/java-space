package com.loop.whileex;

public class ReverseNumberExample {
	public static void main(String[] args) {

		int number = 12345;

		int reversedNumber = 0;

		while (number != 0) {

			int digit = number % 10;

			reversedNumber = reversedNumber * 10 + digit;

			number = number / 10;
		}

		System.out.println(reversedNumber);
	}
}
