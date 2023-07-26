package com.operators.arithmetic;

public class Calculator {
	public void mul(int a, int b) {
		int c = a * b;
		System.out.println("mul: " + c);
	}

	public void div(int a, int b) {
		try {
			int c = a / b;
			System.out.println("div: " + c);
		} catch (ArithmeticException e) {
			System.out.println("div: " + 0);
		}

		System.out.println("div completed");
	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("add: " + c);
	}
	public void sub(int a, int b) {
		int c = a - b;

		System.out.println("sub: " + c);
	}
	public static void main(String[] args) {

		Calculator c = new Calculator();

		int x = 5;
		int y = 0;

		c.mul(x, y);//0
		c.div(x, y);//0/div completed
		c.sub(x, y);//5
		c.add(x, y);//5
	}

}
