package com.task;

import java.util.ArrayList;
import java.util.List;

public class Prime {

	public List<Integer> primes(int range) {

		List<Integer> primeNumbers = new ArrayList<>();

		for (int i = 1; i <= range; i++) {
			int number = i;

			int factors = 0;

			for (int j = 1; j <= number; j++) {

				if (number % j == 0) {
					factors++;
				}
			}

			if (factors == 2) {
				primeNumbers.add(number);

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		return primeNumbers;
	}
}
