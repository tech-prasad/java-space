package com.emp.service;

import java.util.Random;

import com.emp.dto.CreateEmployeeDto;
import com.emp.dto.CreateEmployeeResponseDto;
import com.emp.entity.EmployeeEntity;
import com.emp.repository.EmployeeRepository;

public class EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public CreateEmployeeResponseDto createEmployee(CreateEmployeeDto dto) {

		CreateEmployeeResponseDto responseDto = null;

		EmployeeEntity entity = new EmployeeEntity();

		Random random = new Random();

		int id = random.nextInt(10000000);

		entity.setEmployeeId(id);
		entity.setEmployeeName(dto.getEmployeeName());
		entity.setSalary(dto.getSalary());
		entity.setAge(dto.getAge());
		entity.setHireDate(dto.getHireDate());
		entity.setDepartmentId(dto.getDepartmentId());

		int rowsAffected = employeeRepository.insertEmployee(entity);

		if (rowsAffected > 0) {
			System.out.println("Employee created with ID: " + entity.getEmployeeId());

			responseDto = new CreateEmployeeResponseDto();

			responseDto.setEmployeeId(entity.getEmployeeId());
		} else {
			throw new RuntimeException("Employee creation failed");
		}

		return responseDto;
	}

}
