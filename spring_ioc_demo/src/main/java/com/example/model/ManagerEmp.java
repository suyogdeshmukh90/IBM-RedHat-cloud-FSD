package com.example.model;

public class ManagerEmp extends Employee {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Id: "+id+" first name: "+firstName+" last name: "+lastName+" Email: "+email;
	}

	public ManagerEmp() {
		super();
	}

	public ManagerEmp(Integer id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
