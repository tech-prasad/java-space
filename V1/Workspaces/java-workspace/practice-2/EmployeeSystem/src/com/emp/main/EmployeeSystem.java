package com.emp.main;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.emp.controller.EmployeeController;
import com.emp.dto.CreateEmployeeDto;
import com.emp.dto.CreateEmployeeResponseDto;
import com.emp.dto.EmployeeResponseDto;
import com.emp.repository.DepartmentRepository;
import com.emp.repository.EmployeeRepository;
import com.emp.service.EmployeeService;

public class EmployeeSystem {
	public static void main(String[] args) {

		EmployeeRepository employeeRepository = new EmployeeRepository();
		DepartmentRepository departmentRepository = new DepartmentRepository();

		EmployeeService employeeService = new EmployeeService(employeeRepository, departmentRepository);

		EmployeeController employeeController = new EmployeeController(employeeService);

		Scanner s = new Scanner(System.in);

		for (;;) {
			System.out.println();
			System.out.println("1: Create employee");
			System.out.println("2: Get employee by id");
			System.out.println("3: Get all employees");
			System.out.println("4: Update employee");
			System.out.println("5: Delete employee");
			System.out.println("Enter operation: ");
			int operation = s.nextInt();

			switch (operation) {
			case 1:
				CreateEmployeeDto createEmployeeDto = new CreateEmployeeDto();

				System.out.println("Enter employee details: ");

				System.out.println("Enter employee name: ");
				createEmployeeDto.setEmployeeName(s.next());

				System.out.println("Enter age: ");
				createEmployeeDto.setAge(s.nextInt());

				System.out.println("Enter salary: ");
				double nextDouble2 = s.nextDouble();
				double nextDouble = nextDouble2;
				createEmployeeDto.setSalary(nextDouble);

				System.out.println("Enter hire date (YYYY-MM-DD): ");
				createEmployeeDto.setHireDate(Date.valueOf(s.next()));

				System.out.println("Enter department name: ");
				createEmployeeDto.setDepartmentName(s.next());

				CreateEmployeeResponseDto createEmployeeResponseDto = employeeController
						.createEmployee(createEmployeeDto);

				System.out.println(createEmployeeResponseDto);
				break;
			case 2:
				System.out.println("Enter employee id: ");
				EmployeeResponseDto employeeResponseDto = employeeController.getEmployee(s.nextInt());

				if (employeeResponseDto != null) {
					System.out.println(employeeResponseDto);
				}
				break;
			case 3:
				List<EmployeeResponseDto> allEmployees = employeeController.getAllEmployees();

				if (allEmployees != null) {
					for (EmployeeResponseDto responseDto : allEmployees) {
						System.out.println(responseDto);
					}
				}
				break;
			case 4:
				System.out.println("Enter employee id: ");
				int employeeId = s.nextInt();

				System.out.println("Enter new salary: ");
				double salary = s.nextDouble();

				String status = employeeController.updateSalaryOfEmployee(employeeId, salary);

				System.out.println(status);
				break;
			case 5:
				System.out.println("Enter employee id: ");
				int eId = s.nextInt();

				String statusValue = employeeController.deleteEmployeeById(eId);

				System.out.println(statusValue);
				break;
			case -1:
				System.out.println("Exit");
				return;
			}
		}
	}
}
