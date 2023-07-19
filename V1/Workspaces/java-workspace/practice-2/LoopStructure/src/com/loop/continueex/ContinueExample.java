package com.loop.continueex;

public class ContinueExample {
	public static void main(String[] args) {

		for (int a = 1; a <= 100; a++) {

			// I dont want to print 67
			if (a == 67) {
				continue;
			}
			System.out.println(a);
		}
	}
}
