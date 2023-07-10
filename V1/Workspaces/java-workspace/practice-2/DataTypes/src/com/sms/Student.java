package com.sms;

public class Student {

	public int rollNumber;
	public String name;
	public int age;
	public Address studentAddress;
	public College college;
	public Library library;

	public Student(int rollNumber, String name, int age, Address address, College college, Library library) {

		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.studentAddress = address;
		this.college = college;
		this.library = library;
	}

	public void print() {
		System.out.println("Student details");
		System.out.println(rollNumber);
		System.out.println(name);
		System.out.println(age);
		printStudentAddress();

		System.out.println("College details");
		System.out.println(college.getName());
		System.out.println(college.getType());
		printCollegeAddress();

		System.out.println("Library details");
		System.out.println(library.name);
		printLibraryAddress();
	}

	public void printStudentAddress() {
		System.out.printf("flatNo: %S, city: %S, state: %S, country: %S\n", studentAddress.flatNo, studentAddress.city,
				studentAddress.state, studentAddress.country);
	}

	public void printCollegeAddress() {
		Address collegeAddress = college.getCollegeAddress();
		System.out.printf("flatNo: %S, city: %S, state: %S, country: %S\n", collegeAddress.flatNo, collegeAddress.city,
				collegeAddress.state, collegeAddress.country);
	}

	public void printLibraryAddress() {
		System.out.printf("flatNo: %S, city: %S, state: %S, country: %S\n", library.libraryAddress.flatNo,
				library.libraryAddress.city, library.libraryAddress.state, library.libraryAddress.country);
	}

}