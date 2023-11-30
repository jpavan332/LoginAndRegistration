package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.Employee;
import com.security.model.EmployeeLogin;
import com.security.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("app/v1/employee")

public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee)
	{
		System.out.println("EMployee Save: "+employee.getEmail());
		return employeeService.saveEmployee(employee);
	}
	
	@PostMapping("login")
	public ResponseEntity<String> checkLogin(@RequestBody EmployeeLogin empLogin)
	{
		System.out.println("Fetching Controller : "+ empLogin.getEmail());
		return employeeService.checkLogin(empLogin);
	}
	

}
