package com.array;

public class StudentExample {
	public static void main(String[] args) {

		Student[] students = new Student[3];

		Student s1 = new Student();
		s1.setRollNumber(1);
		s1.setName("Anil");
		s1.setAge(22);

		Student s2 = new Student();
		s2.setRollNumber(2);
		s2.setName("Bharat");
		s2.setAge(21);

		Student s3 = new Student();
		s3.setRollNumber(3);
		s3.setName("Chandu");
		s3.setAge(22);

		students[0] = s1;
		students[1] = s3;
		students[2] = s2;

		for (int i = 0; i < students.length; i++) {
			Student s = students[i];

			System.out.println(s.getRollNumber());
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println();
		}
	}
}
