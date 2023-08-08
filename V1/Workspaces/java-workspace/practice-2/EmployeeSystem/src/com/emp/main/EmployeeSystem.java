package com.emp.main;

import java.sql.Date;

import com.emp.controller.EmployeeController;
import com.emp.dto.CreateEmployeeDto;
import com.emp.dto.CreateEmployeeResponseDto;
import com.emp.repository.EmployeeRepository;
import com.emp.service.EmployeeService;

public class EmployeeSystem {
	public static void main(String[] args) {

		EmployeeRepository employeeRepository = new EmployeeRepository();

		EmployeeService employeeService = new EmployeeService(employeeRepository);

		EmployeeController employeeController = new EmployeeController(employeeService);

		CreateEmployeeDto createEmployeeDto = new CreateEmployeeDto();

		createEmployeeDto.setEmployeeName("Zaho");
		createEmployeeDto.setAge(45);
		createEmployeeDto.setSalary(5678923.45);
		createEmployeeDto.setHireDate(Date.valueOf("2019-09-22"));
		createEmployeeDto.setDepartmentId(1);

		CreateEmployeeResponseDto createEmployeeResponseDto = employeeController.createEmployee(createEmployeeDto);

		System.out.println(createEmployeeResponseDto.getEmployeeId());
	}
}
