package org.demo.spring_hibernate_javabased.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="employee2")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="employee_id")
	private String employeeId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String  lastName;
	@Column(name="email")
	private String email;
	

}
