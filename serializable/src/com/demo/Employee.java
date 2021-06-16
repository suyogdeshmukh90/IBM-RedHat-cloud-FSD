package com.demo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Serializable {
	
	private String id;
	private String name;
	private String email;
//	public Employee(String id, String name, String email) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.email = email;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
//	}
//	
	
}
