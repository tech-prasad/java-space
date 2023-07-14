package com.operators.bitwise;

public class BitwiseOperators {
	public static void main(String[] args) {

		int a = 5;
		int b = 3;

		int c = a & b;
		System.out.println("& c: " + c);

		int d = a | b;
		System.out.println("| d: " + d);

		int f = a ^ b;
		System.out.println("^ f: " + f);

		int e = ~1;
		System.out.println("~ e: " + e);

		int g = 5 << 2;
		System.out.println("<< g: " + g);

		int h = -20 >> 2;
		System.out.println(">> h: " + h);

		int i = -4 >>> 2;
		System.out.println(">>> i: " + i);
	}
}
