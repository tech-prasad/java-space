package com.user.input;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Please enter name: ");

		String name = s.nextLine();

		System.out.print("Please enter age: ");

		int age = s.nextInt();

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
