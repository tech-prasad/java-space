package com.array;

public class NumberSystem {

	public static void main(String[] args) {
		int[] numbers = new int[12];

		System.out.println("Size: " + numbers.length);

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		for (int a = 0; a < numbers.length; a++) {
			int x = numbers[a];

			System.out.println(x);
		}

		System.out.println("Number: " + numbers[3]);
	}

	static void simpleNumberPrint() {
		int[] numbers = new int[9];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		numbers[5] = 6;
		numbers[6] = 7;
		numbers[7] = 8;
		numbers[8] = 9;

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		System.out.println(numbers[6]);
		System.out.println(numbers[7]);
		System.out.println(numbers[8]);
	}
}
