package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter 
@ToString
public class Employee {
	@Id
	@Column(name="employee_id")
	private int id;
	@Column(name="first_name")
	private String fname;
	@Column(name="last_name")
	private String lname;
	
	private String email;

}
