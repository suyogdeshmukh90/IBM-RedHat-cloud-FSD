package com.example;

public class Engineer extends Employee {
	private String branch;

	public Engineer() {
		super();
	}

	public Engineer(Integer employeeId, String fistName, String lastName, String email, String branch) {
		super(employeeId, fistName, lastName, email);
		this.branch=branch;
		
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Engineer [branch=" + branch + ", toString()=" + super.toString() + "]";
	}
	
	

}
