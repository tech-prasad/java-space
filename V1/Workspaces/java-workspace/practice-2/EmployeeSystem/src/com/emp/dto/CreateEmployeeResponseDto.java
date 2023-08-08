package com.emp.dto;

public class CreateEmployeeResponseDto {

	private int employeeId;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "CreateEmployeeResponseDto [employeeId=" + employeeId + "]";
	}

}
