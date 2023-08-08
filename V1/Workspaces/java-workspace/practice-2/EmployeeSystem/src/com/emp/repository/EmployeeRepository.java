package com.emp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.emp.entity.EmployeeEntity;
import com.emp.util.ConnectionUtil;

public class EmployeeRepository {

	private static final String INSERT_QUERY = "insert into employee (employee_id, employee_name, salary, age, hire_date, department_Id) values (?, ?, ?, ?, ?, ?)";

	public int insertEmployee(EmployeeEntity entity) {

		int rowsAffcted = 0;

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(INSERT_QUERY);

			preparedStatement.setInt(1, entity.getEmployeeId());
			preparedStatement.setString(2, entity.getEmployeeName());
			preparedStatement.setDouble(3, entity.getSalary());
			preparedStatement.setInt(4, entity.getAge());
			preparedStatement.setDate(5, entity.getHireDate());
			preparedStatement.setInt(6, entity.getDepartmentId());

			rowsAffcted = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionUtil.releaseResource(connection, preparedStatement);
		}

		return rowsAffcted;
	}

}
