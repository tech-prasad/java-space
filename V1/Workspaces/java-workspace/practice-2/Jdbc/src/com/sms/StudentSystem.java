package com.sms;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentSystem {

	public void insert(Student student) {

		String query = "insert into student (roll_number, name, dob, mobile) values (?, ?, ?, ?)";

		String jdbcUrl = "jdbc:mysql://localhost:3306/student_ms";
		String userName = "root";
		String password = "root";

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = DriverManager.getConnection(jdbcUrl, userName, password);

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, student.getRollNumber());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setDate(3, student.getDateOfBirth());
			preparedStatement.setInt(4, student.getMobileNumber());

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("insert success");
			} else {
				System.out.println("insert failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public Student getStudent(int rollNumber) {
		Student student = null;

		String query = "select roll_number, name, dob, mobile from student where roll_number = ?";

		String jdbcUrl = "jdbc:mysql://localhost:3306/student_ms";
		String userName = "root";
		String password = "root";

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = DriverManager.getConnection(jdbcUrl, userName, password);

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, rollNumber);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				student = new Student();

				int studentNumber = resultSet.getInt("roll_number");
				String name = resultSet.getString("name");
				Date date = resultSet.getDate("dob");
				int mobile = resultSet.getInt("mobile");

				student.setRollNumber(studentNumber);
				student.setName(name);
				student.setDateOfBirth(date);
				student.setMobileNumber(mobile);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return student;
	}

	public Student updateStudent(int rollNumber, int updatedMobile) {
		Student student = null;

		String query = "update student set mobile = ? where roll_number = ?";

		String jdbcUrl = "jdbc:mysql://localhost:3306/student_ms";
		String userName = "root";
		String password = "root";

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = DriverManager.getConnection(jdbcUrl, userName, password);

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, updatedMobile);
			preparedStatement.setInt(2, rollNumber);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Update success");

				student = getStudent(rollNumber);
			} else {
				System.out.println("Update failed");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return student;
	}

	public void deleteStudent(int rollNumber) {

		String query = "delete from student where roll_number = ?";

		String jdbcUrl = "jdbc:mysql://localhost:3306/student_ms";
		String userName = "root";
		String password = "root";

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = DriverManager.getConnection(jdbcUrl, userName, password);

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, rollNumber);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Delete success");
			} else {
				System.out.println("Delete failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		StudentSystem studentSystem = new StudentSystem();

//		Student student = new Student();
//		student.setRollNumber(6);
//		student.setName("Eshwar");
//		student.setDateOfBirth(Date.valueOf("1993-09-23"));
//		student.setMobileNumber(34567);
//
//		studentSystem.insert(student);

		Student student = studentSystem.getStudent(6);

		if (student != null) {
			System.out.println(student.toString());
		} else {
			System.out.println("Student not found");
		}

//		Student updateStudent = studentSystem.updateStudent(6, 999999);
//
//		if (student != null) {
//			System.out.println(updateStudent.toString());
//		} else {
//			System.out.println("updateStudent not found");
//		}

		studentSystem.deleteStudent(6);

		student = studentSystem.getStudent(6);

		if (student != null) {
			System.out.println(student.toString());
		} else {
			System.out.println("Student not found");
		}

	}

}
