package com.example;

public class Employee {
	private Integer employeeId;
	private String fistName;
	private String lastName;
	private String email;
	public Employee() {
		super();
	}
	public Employee(Integer employeeId, String fistName, String lastName, String email) {
		super();
		this.employeeId = employeeId;
		this.fistName = fistName;
		this.lastName = lastName;
		this.email = email;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", fistName=" + fistName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	
	

}
