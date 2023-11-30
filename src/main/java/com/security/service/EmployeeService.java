package com.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.Dao.EmployeeDao;
import com.security.model.Employee;

@Service
public class EmployeeService {
	
	
	
	@Autowired
	EmployeeDao employeeDao;

	
	
	public String saveEmployee(Employee employee) {
		
		// TODO Auto-generated method stub
		
		employeeDao.save(employee);
		
		return employee.getEmp_name();
		
	}

}
