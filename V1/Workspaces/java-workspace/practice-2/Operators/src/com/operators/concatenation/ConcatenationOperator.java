package com.operators.concatenation;

public class ConcatenationOperator {
	public static void main(String[] args) {
		String x = "ABC";
		String y = "DEF";
		String z = x + y + "PQR"; // ABCDEFPQR

		System.out.println(z);

		String i = x + 7 + "IJK" + 4; // ABC7IJK4

		System.out.println(i);

		String u = y + (6 + 7) + "UVW" + 6 + (8 + 9); // DEF13UVW6

		System.out.println(u);
	}
}
