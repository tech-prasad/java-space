package com.basics;

public class StringExample {
	public static void main(String[] args) {

		String value = "Test"; // String constant pool - (not in heap)

		String name = new String("Anil"); // in Heap & String constant pool

		for (int i = 0; i < name.length(); i++) {

			char c = name.charAt(i);

			System.out.println(c);
		}

		String s = name.substring(2);

		System.out.println(s);
	}
}
