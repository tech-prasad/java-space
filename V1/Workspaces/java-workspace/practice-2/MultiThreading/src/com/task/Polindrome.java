package com.task;

import java.util.ArrayList;
import java.util.List;

public class Polindrome {
	public List<Integer> polindromes(int range) {

		List<Integer> polindromeNumbers = new ArrayList<>();

		for (int i = 10; i <= range; i++) {
			int number = i;

			int reversedNumber = 0;

			while (number != 0) {

				int digit = number % 10;

				reversedNumber = reversedNumber * 10 + digit;

				number = number / 10;
			}

			if (i == reversedNumber) {
				polindromeNumbers.add(reversedNumber);

				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		return polindromeNumbers;
	}
}
