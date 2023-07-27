package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

	public void test() throws FileNotFoundException {
		FileInputStream in = new FileInputStream("c://test.txt");
	}

	public static void main(String[] args) {
		ExceptionTest t = null;

		try {
			t.test();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
