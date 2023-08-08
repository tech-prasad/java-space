package com.emp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionUtil {

	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employee_db";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";

	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(JDBC_URL, USER_NAME, PASSWORD);

		return connection;
	}

	public static void releaseResource(Connection connection, PreparedStatement preparedStatement) {
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
