package com.emp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.emp.entity.DepartmentEntity;
import com.emp.util.ConnectionUtil;

public class DepartmentRepository {

	private static final String INSERT_QUERY = "insert into department (department_id, department_name) values (?, ?)";
	private static final String SELECT_BY_ID_QUERY = "select department_id, department_name from department where department_id = ?";
	private static final String SELECT_BY_NAME_QUERY = "select department_id, department_name from department where department_name = ?";

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

	public DepartmentEntity getDepartmentById(int departmentId) {
		DepartmentEntity departmentEntity = null;

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			connection = ConnectionUtil.getConnection();

			preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY);

			preparedStatement.setInt(1, departmentId);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int deptId = resultSet.getInt("department_id");
				String departmentName = resultSet.getString("department_name");

				departmentEntity = new DepartmentEntity();

				departmentEntity.setDepartmentId(deptId);
				departmentEntity.setDepartmentName(departmentName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.releaseResource(connection, preparedStatement, resultSet);
		}

		return departmentEntity;
	}

	public DepartmentEntity getDepartmentByName(String deptName) {
		DepartmentEntity departmentEntity = null;

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(SELECT_BY_NAME_QUERY);
			preparedStatement.setString(1, deptName);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				departmentEntity = new DepartmentEntity();

				int departmentId = resultSet.getInt("department_id");
				String departmentName = resultSet.getString("department_name");

				departmentEntity.setDepartmentId(departmentId);
				departmentEntity.setDepartmentName(departmentName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.releaseResource(connection, preparedStatement, resultSet);
		}

		return departmentEntity;
	}

}
