package com.example;

public class Employee implements Comparable {
	private String eid;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	
	public Employee() {
		super();
	}
	

	public Employee(String eid, String firstName, String lastName, String email, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
	}


	public int compareTo(Object o)
	{
		if(this.salary>((Employee)o).salary)
		{
			return 1;
		}
		else if(this.salary>((Employee)o).salary)
		{
			return -1;
			
		}
		else
		{
			return 0;
			
		}
		}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", salary=" + salary + "]";
	}
		
	}
	

