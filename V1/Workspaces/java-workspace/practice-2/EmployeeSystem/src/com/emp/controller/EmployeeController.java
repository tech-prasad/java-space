package com.emp.controller;

import com.emp.dto.CreateEmployeeDto;
import com.emp.dto.CreateEmployeeResponseDto;
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

}
