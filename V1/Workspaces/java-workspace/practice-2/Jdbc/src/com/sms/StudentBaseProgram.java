package com.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentBaseProgram {

	public static void insert() {

		String query = "insert into student (roll_number, name, dob, mobile) values (3, 'Chandhu', '1992-02-20', 3333333)";

		String jdbcUrl = "jdbc:mysql://localhost:3306/student_ms";
		String userName = "root";
		String password = "root";// change password as per ur database

		Connection connection = null;
		Statement statement = null;

		try {
			connection = DriverManager.getConnection(jdbcUrl, userName, password);

			statement = connection.createStatement();

			int rowsAffected = statement.executeUpdate(query);

			if (rowsAffected > 0) {
				System.out.println("Insert successful");
			} else {
				System.out.println("Insert failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
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

	public static void main(String[] args) {
		insert();
	}

}
