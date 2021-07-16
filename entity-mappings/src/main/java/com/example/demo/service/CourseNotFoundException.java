package com.example.demo.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CourseNotFoundException extends Exception {

	private static final long serialVersionUID = -8152505090596357639L;
	private String message;
}
