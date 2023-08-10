package com.emp.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.entity.EmployeeEntity;
import com.emp.util.ConnectionUtil;

public class EmployeeRepository {

	private static final String INSERT_QUERY = "insert into employee (employee_id, employee_name, salary, age, hire_date, department_Id) values (?, ?, ?, ?, ?, ?)";
	private static final String SELECT_QUERY = "select employee_id, employee_name, salary, age, hire_date, department_id from employee where employee_id = ?";
	private static final String SELECT_ALL_QUERY = "select employee_id, employee_name, salary, age, hire_date, department_id from employee";
	private static final String SELECT_MAX_KEY = "select max(employee_id) maxid from employee";
	private static final String UPDATE_QUERY = "update employee set salary = ? where employee_id = ?";
	private static final String DELETE_QUERY = "delete from employee where employee_id = ?";

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

	public int getNextEmployeeId() {

		int empId = 0;

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(SELECT_MAX_KEY);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				empId = resultSet.getInt("maxid");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.releaseResource(connection, preparedStatement, resultSet);
		}

		return empId + 1;
	}

	public EmployeeEntity getEmployeeById(int employeeId) {
		EmployeeEntity employeeEntity = null;

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(SELECT_QUERY);

			preparedStatement.setInt(1, employeeId);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				int empId = resultSet.getInt("employee_id");
				String employeeName = resultSet.getString("employee_name");
				double salary = resultSet.getDouble("salary");
				int age = resultSet.getInt("age");
				Date hireDate = resultSet.getDate("hire_date");
				int departmentId = resultSet.getInt("department_id");

				employeeEntity = new EmployeeEntity();

				employeeEntity.setEmployeeId(empId);
				employeeEntity.setEmployeeName(employeeName);
				employeeEntity.setSalary(salary);
				employeeEntity.setAge(age);
				employeeEntity.setHireDate(hireDate);
				employeeEntity.setDepartmentId(departmentId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.releaseResource(connection, preparedStatement, resultSet);
		}

		return employeeEntity;
	}

	public List<EmployeeEntity> getAllEmployees() {
		List<EmployeeEntity> employees = new ArrayList<>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				int empId = resultSet.getInt("employee_id");
				String employeeName = resultSet.getString("employee_name");
				double salary = resultSet.getDouble("salary");
				int age = resultSet.getInt("age");
				Date hireDate = resultSet.getDate("hire_date");
				int departmentId = resultSet.getInt("department_id");

				EmployeeEntity employeeEntity = new EmployeeEntity();

				employeeEntity.setEmployeeId(empId);
				employeeEntity.setEmployeeName(employeeName);
				employeeEntity.setSalary(salary);
				employeeEntity.setAge(age);
				employeeEntity.setHireDate(hireDate);
				employeeEntity.setDepartmentId(departmentId);

				employees.add(employeeEntity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.releaseResource(connection, preparedStatement, resultSet);
		}

		return employees;
	}

	public int updateEmployee(int employeeId, double salary) {

		int rowsAffcted = 0;

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(UPDATE_QUERY);

			preparedStatement.setDouble(1, salary);

			preparedStatement.setInt(2, employeeId);

			rowsAffcted = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionUtil.releaseResource(connection, preparedStatement);
		}

		return rowsAffcted;
	}

	public int deleteEmployee(int employeeId) {
		int rowsAffcted = 0;

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(DELETE_QUERY);

			preparedStatement.setInt(1, employeeId);

			rowsAffcted = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.releaseResource(connection, preparedStatement);
		}

		return rowsAffcted;
	}

}
