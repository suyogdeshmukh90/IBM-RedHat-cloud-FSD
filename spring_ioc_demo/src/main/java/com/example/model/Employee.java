package com.example.model;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString

public class Employee {
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	

}
