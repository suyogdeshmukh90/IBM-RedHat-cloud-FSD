package org.demo.spring_hibernate_javabased.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class EmployeeRequestModel {
	private String firstName;
	private String lastName;
	private String email;
}
