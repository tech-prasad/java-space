package com.basics;

public class EqualExample {
	public static void main(String[] args) {
		Student s1 = new Student();

		System.out.println(s1.equals(s1));

		Student s2 = new Student();

		System.out.println(s2.equals(s1));
	}
}
