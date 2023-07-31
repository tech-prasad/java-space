package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest2 {
	public void test() {
		FileInputStream in = null;
		try {
			in = new FileInputStream("c://test.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		ExceptionTest2 t = new ExceptionTest2();

		t.test();
	}
}
