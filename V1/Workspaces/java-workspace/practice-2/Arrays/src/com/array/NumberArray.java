package com.array;

public class NumberArray {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 4, 77, 5, 88 };

		System.out.println("Size: " + numbers.length);

		for (int i : numbers) {
			System.out.println(i);
		}
	}

}
