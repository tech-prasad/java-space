package com.control.structuresifelseif;

public class Student {

	private int rollNumber;
	private String name;
	private int age;

	private int marks1;
	private int marks2;
	private int marks3;
	private int marks4;
	private int marks5;
	private int marks6;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	public int getMarks4() {
		return marks4;
	}

	public void setMarks4(int marks4) {
		this.marks4 = marks4;
	}

	public int getMarks5() {
		return marks5;
	}

	public void setMarks5(int marks5) {
		this.marks5 = marks5;
	}

	public int getMarks6() {
		return marks6;
	}

	public void setMarks6(int marks6) {
		this.marks6 = marks6;
	}

	public String getResultStatus() {

		String result = "";

		if (getMarks1() <= 34) {
			result = "Failed";
		} else if (getMarks2() <= 34) {
			result = "Failed";
		} else if (getMarks3() <= 34) {
			result = "Failed";
		} else if (getMarks4() <= 34) {
			result = "Failed";
		} else if (getMarks5() <= 34) {
			result = "Failed";
		} else if (getMarks6() <= 34) {
			result = "Failed";
		} else {
			result = "Passed";
		}

		return result;
	}

	public String getValue(int number) {

		String givenNumber = "givenNumber is: ";

		if (number == 0) {
			givenNumber = givenNumber + number;
		} else if (number == 1) {
			givenNumber = givenNumber + number;
		} else if (number == 2) {
			givenNumber = givenNumber + number;
		} else if (number == 3) {
			givenNumber = givenNumber + number;
		} else if (number == 4) {
			givenNumber = givenNumber + number;
		} else if (number == 5) {
			givenNumber = givenNumber + number;
		} else {
			givenNumber = givenNumber + "Not sure";
		}

		return givenNumber;
	}

	public static void main(String[] args) {
		Student s = new Student();

		s.setRollNumber(34);
		s.setName("Anil");
		s.setAge(23);

		s.setMarks1(45);
		s.setMarks2(56);
		s.setMarks3(66);
		s.setMarks4(55);
		s.setMarks5(66);
		s.setMarks6(22);

		String resultStatus = s.getResultStatus();
		System.out.println(resultStatus);

		String value = s.getValue(58);
		System.out.println(value);
	}

}