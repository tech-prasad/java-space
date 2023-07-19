package com.loop.breakex;

public class BreakExample {
	public static void main(String[] args) {

		for (int a = 1; a <= 100; a++) {

			if (a == 51) {
				break;
			}

			System.out.println(a);
		}
	}
}
