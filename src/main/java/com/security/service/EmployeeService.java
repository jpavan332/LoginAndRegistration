package com.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.Dao.EmployeeDao;
import com.security.model.Employee;
import com.security.model.EmployeeLogin;

@Service
public class EmployeeService {
	
	
	
	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	public ResponseEntity<String> saveEmployee(Employee employee) {
		
		// TODO Auto-generated method stub

		System.out.println(employee.toString());
		System.out.println("PAssord:;;;;;;;;;;;;;;;;;;;;;;;"+employee.getEmail()+"-----"+employee.getEmp_name()+"---"+employee.getEmp_id()+"--"+employee.getPassword());
		employee.setPassword(this.passwordEncoder.encode(employee.getPassword()));
		
		employeeDao.save(employee);
		
		return new ResponseEntity<String>("Successfully Registered", HttpStatus.CREATED);
		
	}


	public ResponseEntity<String> checkLogin(EmployeeLogin empLogin) {
		// TODO Auto-generated method stub
		
		
		System.out.println("checkLogin    "+empLogin.getEmail());
		Employee findEmployee = employeeDao.findByEmail(empLogin.getEmail());
		String msg="";
		
		
		if(findEmployee!=null)
		{
			String clientpassword = empLogin.getPassword();
			String dbPassword = findEmployee.getPassword();
			Boolean isPwdRight = passwordEncoder.matches(clientpassword, dbPassword);
			if(isPwdRight)
			{
				
				System.out.println("Above Optional: "+empLogin.getEmail()+"---"+empLogin.getPassword());
				msg = "Login Success";
//				
			}
			else
			{
				msg=  "Password Doesn't Match";
			}
		}
		else
		{
			msg = "No employee Found with email";
		}
		
		return new ResponseEntity<String>(msg,HttpStatus.BAD_GATEWAY);
	}

}
