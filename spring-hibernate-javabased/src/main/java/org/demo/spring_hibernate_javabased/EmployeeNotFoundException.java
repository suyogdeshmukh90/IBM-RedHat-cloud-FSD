package org.demo.spring_hibernate_javabased;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EmployeeNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -766258714750539213L;
	private String message;
}
