package com.array;

public class EnhancedForLoopExample {

	public static void main(String[] args) {

		int[] numbers = new int[12];

		System.out.println("Size: " + numbers.length);

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		for (int i : numbers) {
			System.out.println(i);
		}
	}
}
