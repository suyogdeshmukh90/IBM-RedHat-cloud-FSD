package org.demo.spring_hibernate_javabased.ui;

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

public class EmployeeResponseModel {
	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;
}
