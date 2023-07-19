package com.loop.whileex;

public class PrimeExample {

	public static void main(String[] args) {

		int number = 54;

		int factors = 0;

		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {
				factors++;
			}
		}

		if (factors == 2) {
			System.out.println("Given number is prime: " + number);
		} else {
			System.out.println("Given number is NOT prime: " + number);
		}

	}
}
