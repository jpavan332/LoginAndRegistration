package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.Employee;
import com.security.service.EmployeeService;

@RestController

@RequestMapping("app/v1/employee")

public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("save")
	public String saveEmployee(Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}

}
