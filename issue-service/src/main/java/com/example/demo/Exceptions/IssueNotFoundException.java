package com.example.demo.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class IssueNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 3392249460788918661L;
	private String message;
}
