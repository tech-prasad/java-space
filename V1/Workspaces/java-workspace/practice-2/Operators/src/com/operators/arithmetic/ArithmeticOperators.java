package com.operators.arithmetic;

public class ArithmeticOperators {

	public static void main(String[] args) {

		int a = 3;
		int b = 5;
		int c = 8;

		int add = a + b + c + 99;

		System.out.println("Add: " + add);

		int sub = a - b - c - 67;

		System.out.println("Sub: " + sub);

		int mul = a * b * c * 2;

		System.out.println("Mul: " + mul);

		int div = 2000 / a / b / c;

		System.out.println("Div: " + div);

		int percent = 2000 % a % b % c;

		System.out.println("Percent: " + percent);

		int x = 10;

		System.out.println("X: " + x);

		int z = x++;

		System.out.println("Z: " + z);
		System.out.println("X: " + x);

		int i = 7;

		System.out.println("I: " + i);

		int k = ++i;

		System.out.println("K: " + k);
		System.out.println("I: " + i);

		int p = 6;

		System.out.println("P: " + p);

		++p;

		System.out.println("P: " + p);

		int n = 9;

		System.out.println("N: " + n);

		int q = n--;

		System.out.println("Q: " + q);
		System.out.println("N: " + n);

		int u = 4;

		System.out.println("U: " + u);

		int v = --u;

		System.out.println("V: " + v);
		System.out.println("U: " + u);

		int h = 8;

		System.out.println("H: " + h);

		System.out.println("H: " + --h);

	}

}
