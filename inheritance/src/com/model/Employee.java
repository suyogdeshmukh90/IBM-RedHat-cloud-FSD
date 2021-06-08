package com.model;

import java.util.Random;

public class Employee {

		private int employeeId;
		private String firstName;
		private String lastName;
		private String email;
		private double salary;

		public Employee() {
			super();
		}

		public Employee(String firstName, String lastName, String email, double salary) {
			super();
			this.employeeId=new Random().nextInt();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.salary = salary;

		}
		

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getDetails() {
			return "ID: " + employeeId + " First Name: " + firstName + " Last Name: " + lastName + " Email: " + email;
		}

}


