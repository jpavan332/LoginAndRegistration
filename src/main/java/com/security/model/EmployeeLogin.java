package com.security.model;


public class EmployeeLogin {
	
	private String email;
	private String password;
	
	
	@Override
	public String toString() {
		return "EmployeeLogin [emial=" + email + ", password=" + password + "]";
	}
	public EmployeeLogin() {
		super();
		
	}
	public EmployeeLogin(String email, String password) {
		super();
		System.out.println("Employee Login ====="+this.email);
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
