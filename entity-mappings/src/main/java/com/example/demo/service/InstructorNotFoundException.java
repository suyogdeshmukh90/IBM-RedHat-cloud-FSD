package com.example.demo.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class InstructorNotFoundException extends Exception {


	private static final long serialVersionUID = -5239144625838475348L;
	private String message;
	
}
