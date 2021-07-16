package com.example.demo.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EmployeeNotFoundException extends Exception {

	
	private static final long serialVersionUID = -293926963562430556L;
	private String message;
}
