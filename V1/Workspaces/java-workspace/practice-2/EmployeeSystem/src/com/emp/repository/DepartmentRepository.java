package com.emp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.emp.entity.DepartmentEntity;
import com.emp.util.ConnectionUtil;

public class DepartmentRepository {

	private static final String INSERT_QUERY = "insert into department (department_id, department_name) values (?, ?)";

	public int insertDepartment(DepartmentEntity entity) {

		int rowsAffcted = 0;

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(INSERT_QUERY);

			preparedStatement.setInt(1, entity.getDepartmentId());
			preparedStatement.setString(2, entity.getDepartmentName());

			rowsAffcted = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionUtil.releaseResource(connection, preparedStatement);
		}

		return rowsAffcted;
	}

}
