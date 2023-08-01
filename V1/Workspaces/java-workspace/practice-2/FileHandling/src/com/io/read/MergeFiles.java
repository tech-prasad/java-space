package com.io.read;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFiles {
	public static void main(String[] args) {

		String fileOneContent = "";
		String fileTwoContent = "";

		File fileOne = new File("F:\\Work\\one.txt");
		File fileTwo = new File("F:\\Work\\two.txt");
		File fileThree = new File("F:\\Work\\three.txt");

		BufferedReader readOne = null;

		try {
			readOne = new BufferedReader(new FileReader(fileOne));

			String line = null;

			while ((line = readOne.readLine()) != null) {
				fileOneContent = fileOneContent + line + "\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (readOne != null) {
				try {
					readOne.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		BufferedReader readTwo = null;

		try {
			readTwo = new BufferedReader(new FileReader(fileTwo));

			String line = null;

			while ((line = readTwo.readLine()) != null) {
				fileTwoContent = fileTwoContent + line + "\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (readTwo != null) {
				try {
					readTwo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter(fileThree, true));

			writer.write(fileOneContent);
			writer.write("\n");
			writer.write(fileTwoContent);
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
}
