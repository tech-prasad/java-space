package com.emp.service;

import java.util.ArrayList;
import java.util.List;

import com.emp.dto.CreateEmployeeDto;
import com.emp.dto.CreateEmployeeResponseDto;
import com.emp.dto.EmployeeResponseDto;
import com.emp.entity.DepartmentEntity;
import com.emp.entity.EmployeeEntity;
import com.emp.repository.DepartmentRepository;
import com.emp.repository.EmployeeRepository;

public class EmployeeService {

	private EmployeeRepository employeeRepository;
	private DepartmentRepository departmentRepository;

	public EmployeeService(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
		this.employeeRepository = employeeRepository;
		this.departmentRepository = departmentRepository;
	}

	public CreateEmployeeResponseDto createEmployee(CreateEmployeeDto dto) {

		CreateEmployeeResponseDto responseDto = null;

		EmployeeEntity entity = new EmployeeEntity();

		int nextEmployeeId = employeeRepository.getNextEmployeeId();

		entity.setEmployeeId(nextEmployeeId);
		entity.setEmployeeName(dto.getEmployeeName());
		entity.setSalary(dto.getSalary());
		entity.setAge(dto.getAge());
		entity.setHireDate(dto.getHireDate());

		String departmentName = dto.getDepartmentName();

		DepartmentEntity departmentEntity = departmentRepository.getDepartmentByName(departmentName);

		entity.setDepartmentId(departmentEntity.getDepartmentId());

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

	public EmployeeResponseDto getEmployeeById(int employeeId) {

		EmployeeResponseDto responseDto = null;

		EmployeeEntity employeeEntity = employeeRepository.getEmployeeById(employeeId);

		if (employeeEntity != null) {
			responseDto = new EmployeeResponseDto();
			responseDto.setEmployeeId(employeeEntity.getEmployeeId());
			responseDto.setEmployeeName(employeeEntity.getEmployeeName());
			responseDto.setSalary(employeeEntity.getSalary());
			responseDto.setAge(employeeEntity.getAge());
			responseDto.setHireDate(employeeEntity.getHireDate());

			int departmentId = employeeEntity.getDepartmentId();

			DepartmentEntity departmentEntity = departmentRepository.getDepartmentById(departmentId);

			responseDto.setDepartmentId(departmentEntity.getDepartmentId());

			responseDto.setDepartmentName(departmentEntity.getDepartmentName());
		} else {
			throw new RuntimeException("Employee no found");
		}

		return responseDto;
	}

	public List<EmployeeResponseDto> getAllEmployees() {

		List<EmployeeResponseDto> responseDtos = new ArrayList<>();

		List<EmployeeEntity> employees = employeeRepository.getAllEmployees();

		for (EmployeeEntity employeeEntity : employees) {

			EmployeeResponseDto responseDto = new EmployeeResponseDto();

			responseDto.setEmployeeId(employeeEntity.getEmployeeId());
			responseDto.setEmployeeName(employeeEntity.getEmployeeName());
			responseDto.setSalary(employeeEntity.getSalary());
			responseDto.setAge(employeeEntity.getAge());
			responseDto.setHireDate(employeeEntity.getHireDate());

			int departmentId = employeeEntity.getDepartmentId();

			DepartmentEntity departmentEntity = departmentRepository.getDepartmentById(departmentId);

			responseDto.setDepartmentId(departmentEntity.getDepartmentId());

			responseDto.setDepartmentName(departmentEntity.getDepartmentName());

			responseDtos.add(responseDto);
		}

		return responseDtos;
	}

	public String updateSalaryOfEmployee(int employeeId, double salary) {

		String status = null;

		int rowsAffected = employeeRepository.updateEmployee(employeeId, salary);

		if (rowsAffected > 0) {
			status = "update success";
		} else {
			status = "update failed";
		}

		return status;
	}

	public String deleteEmployeeById(int employeeId) {
		String status = null;

		int rowsAffected = employeeRepository.deleteEmployee(employeeId);

		if (rowsAffected > 0) {
			status = "Delete success";
		} else {
			status = "Delete failed";
		}

		return status;
	}

}
