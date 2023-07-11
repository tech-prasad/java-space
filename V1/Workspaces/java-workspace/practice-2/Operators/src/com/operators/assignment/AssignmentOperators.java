package com.operators.assignment;

public class AssignmentOperators {

	public static void main(String[] args) {

		String value = "Working fine";

		System.out.println(value);

		int a = 8;

		System.out.println("a: " + a);

		int b = 3;

		b += a; // b = b + a;

		System.out.println("a: " + a);
		System.out.println("b: " + b);

		int c = 5;

		c -= a; // c = c - a;

		System.out.println("a: " + a);
		System.out.println("c: " + c);

		int d = 4;

		d *= a; // d = d * a;

		System.out.println("a: " + a);
		System.out.println("d: " + d);

		int e = 16;

		e /= a; // e = e / a;

		System.out.println("a: " + a);
		System.out.println("e: " + e);

		int f = 67;

		f %= a; // f = f % a;

		System.out.println("a: " + a);
		System.out.println("f: " + f);
	}

}
