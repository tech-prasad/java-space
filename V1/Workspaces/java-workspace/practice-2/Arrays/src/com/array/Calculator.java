package com.array;

public class Calculator {

	private int[] numbers = new int[] { 2, 4, 1, 3, 5, 7 };

	public void mul(int a, int b) {
		int c = numbers[a] * b;
		System.out.println("mul: " + c);
	}

	public void div(int a, int b) {
		try {
			int c = numbers[a] / b;
			System.out.println("div: " + c);
		} catch (ArithmeticException e) {
			System.out.println("div: " + 0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void add(int a, int b) {
		int c = numbers[a] + b;
		System.out.println("add: " + c);
	}

	public void sub(int a, int b) {
		int c = numbers[a] - b;

		System.out.println("sub: " + c);
	}

	public static void main(String[] args) {

		// 2, 4, 1, 3, 5, 7

		Calculator c = new Calculator();

		int x = 8;
		int y = 0;

		c.div(x, y);// error msg
		c.mul(x, y);// 0
		c.sub(x, y);// 1
		c.add(x, y);// 1
	}

}
