package com.io.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HandleFile {

	private static void read(String fileName) {

		FileInputStream in = null;

		try {
			File file = new File(fileName);

			System.out.println(file.exists());

			in = new FileInputStream(file);

			int d;

			while ((d = in.read()) != -1) {

				char c = (char) d;

				System.out.print(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
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

	public static void write(String fileName) {

		File file = new File(fileName);
		FileOutputStream out = null;
		try {
			String content = "Errors: runtime errors. OutOfMemoryError: caused by JVM. StackOverflowError: caused by JVM.";
			out = new FileOutputStream(file, true);

			out.write(content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		String fileName = "F:\\Work\\test_v2.txt";
		read(fileName);
		System.out.println();
		System.out.println();
		write(fileName);
		read(fileName);
	}
}
