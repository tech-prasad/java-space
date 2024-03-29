package com.sms;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentSystem {

	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_ms";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";

	private static final String INSERT_QUERY = "insert into student (roll_number, name, dob, mobile) values (?, ?, ?, ?)";

	private static final String SELECT_QUERY = "select roll_number, name, dob, mobile from student where roll_number = ?";

	private static final String UPDATE_QUERY = "update student set mobile = ? where roll_number = ?";

	private static final String DELETE_QUERY = "delete from student where roll_number = ?";

	public void insert(Student student) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = getConnection();

			preparedStatement = connection.prepareStatement(INSERT_QUERY);

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
			releaseResource(connection, preparedStatement);
		}
	}

	public Student getStudent(int rollNumber) {
		Student student = null;

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = getConnection();

			preparedStatement = connection.prepareStatement(SELECT_QUERY);

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
		} finally {
			releaseResource(connection, preparedStatement);
		}

		return student;
	}

	public Student updateStudent(int rollNumber, int updatedMobile) {
		Student student = null;

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = getConnection();

			preparedStatement = connection.prepareStatement(UPDATE_QUERY);

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
		} finally {
			releaseResource(connection, preparedStatement);
		}

		return student;
	}

	public void deleteStudent(int rollNumber) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = getConnection();

			preparedStatement = connection.prepareStatement(DELETE_QUERY);

			preparedStatement.setInt(1, rollNumber);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Delete success");
			} else {
				System.out.println("Delete failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			releaseResource(connection, preparedStatement);
		}
	}

	private Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(JDBC_URL, USER_NAME, PASSWORD);

		return connection;
	}

	private void releaseResource(Connection connection, PreparedStatement preparedStatement) {
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

	public static void main(String[] args) {

		StudentSystem studentSystem = new StudentSystem();

//		Student student = new Student();
//		student.setRollNumber(6);
//		student.setName("Eshwar");
//		student.setDateOfBirth(Date.valueOf("1993-09-23"));
//		student.setMobileNumber(34567);
//
//		studentSystem.insert(student);

		Student student = studentSystem.getStudent(5);

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

		//studentSystem.deleteStudent(6);

		student = studentSystem.getStudent(3);

		if (student != null) {
			System.out.println(student.toString());
		} else {
			System.out.println("Student not found");
		}

	}

}
