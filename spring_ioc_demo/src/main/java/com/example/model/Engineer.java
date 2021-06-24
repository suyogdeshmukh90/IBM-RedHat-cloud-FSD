package com.example.model;

public class Engineer extends Employee {


	private Integer id;
	private String firstName;
	private String lastName;
	private String branch;
	
	
	public Engineer() {
		super();
	}


	public Engineer(Integer id, String firstName, String lastName, String branch) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Id: "+id+" first name: "+firstName+" last name: "+lastName+" Branch: "+branch;
	}

}
