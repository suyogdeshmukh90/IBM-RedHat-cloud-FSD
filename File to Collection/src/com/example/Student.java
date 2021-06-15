package com.example;

public class Student implements Comparable{
	private String id;
	private String firstName;
	private String  lastName;
	private String email;
	private double gpa;
	public Student() {
		super();
	}
	public Student(String id, String firstName, String lastName, String email, double gpa) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gpa = gpa;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", gpa=" + gpa + "]";
	}
	@Override
	public int compareTo(Object o) {
		if(this.gpa>((Student)o).gpa)
		{
			return -1;
			
		}
		else if(this.gpa<((Student)o).gpa)
			return 1;
		else
			return 0;
	}

}
