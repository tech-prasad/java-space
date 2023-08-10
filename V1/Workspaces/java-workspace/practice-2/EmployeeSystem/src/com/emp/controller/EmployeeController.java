package com.emp.controller;

import java.util.List;

import com.emp.dto.CreateEmployeeDto;
import com.emp.dto.CreateEmployeeResponseDto;
import com.emp.dto.EmployeeResponseDto;
import com.emp.service.EmployeeService;

public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public CreateEmployeeResponseDto createEmployee(CreateEmployeeDto dto) {

		CreateEmployeeResponseDto responseDto = null;

		try {
			responseDto = employeeService.createEmployee(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return responseDto;
	}

	public EmployeeResponseDto getEmployee(int employeeId) {
		EmployeeResponseDto responseDto = null;

		try {
			responseDto = employeeService.getEmployeeById(employeeId);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return responseDto;
	}

	public List<EmployeeResponseDto> getAllEmployees() {
		List<EmployeeResponseDto> allEmployees = null;

		try {
			allEmployees = employeeService.getAllEmployees();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return allEmployees;
	}

	public String updateSalaryOfEmployee(int employeeId, double salary) {
		String status = null;

		try {
			status = employeeService.updateSalaryOfEmployee(employeeId, salary);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public String deleteEmployeeById(int employeeId) {
		String status = null;

		try {
			status = employeeService.deleteEmployeeById(employeeId);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

}
