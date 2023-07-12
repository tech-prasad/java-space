package com.operators.ternary;

public class TernaryOperator {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		boolean c = a > b;

		int d = c ? 123 : 345;

		System.out.println("d: " + d);

		int e = 45 > 44 ? 123 : 345;

		System.out.println("e: " + e);

		int f = c && (45 > 44) ? 123 : 345;

		System.out.println("f: " + f);
		
		int g = !(!c && (45 > 44)) ? 123 : 345;

		System.out.println("g: " + g);
		
		String t = c ? "Apple" : "Google";

		System.out.println("t: " + t);
		
		String v = !c ? "Apple" : "Google";

		System.out.println("v: " + v);

	}

}
