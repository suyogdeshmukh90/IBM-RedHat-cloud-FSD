package com.example;

public class Manager extends Employee {

	private String department;

	public Manager() {
		super();
	}

	public Manager(Integer employeeId, String fistName, String lastName, String email, String department) {
		super(employeeId, fistName, lastName, email);
		this.department=department;
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + ", toString()=" + super.toString() + "]";
	}

	

	
	

}
