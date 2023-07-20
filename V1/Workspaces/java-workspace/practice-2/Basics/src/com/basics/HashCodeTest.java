package com.basics;

public class HashCodeTest {
	public static void main(String[] args) {

		Student s = new Student();

		int hashCode = s.hashCode();

		System.out.println(hashCode);
	}
}
