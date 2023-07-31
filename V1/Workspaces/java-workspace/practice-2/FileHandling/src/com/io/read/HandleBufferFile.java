package com.io.read;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class HandleBufferFile {

	public static void read(String fileName) {

		File file = new File(fileName);

		Reader r = null;
		try {
			r = new FileReader(file);

			BufferedReader in = new BufferedReader(r);

			String line;

			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}

			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (r != null) {
				try {
					r.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void write(String fileName) {
		File file = new File(fileName);

		String content = "Errors: runtime errors. OutOfMemoryError: caused by JVM. StackOverflowError: caused by JVM.";
		Writer writer = null;
		try {

			if (!file.exists()) {
				file.createNewFile();
			}

			writer = new FileWriter(file, true);

			BufferedWriter out = new BufferedWriter(writer);

			out.write(content);

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
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
		write("F:\\Work\\test_v9.txt");
		read("F:\\Work\\test_v9.txt");
	}

}
