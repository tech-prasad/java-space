package com.emp.dto;

import java.sql.Date;

public class CreateEmployeeDto {

	private String employeeName;
	private double salary;
	private int age;
	private Date hireDate;
	private int departmentId;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "EmployeeCreateDto [employeeName=" + employeeName + ", salary=" + salary + ", age=" + age + ", hireDate="
				+ hireDate + ", departmentId=" + departmentId + "]";
	}

}
