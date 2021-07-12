package com.example.demo.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ItemNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = -1532455188607914342L;
	private String message;
	

}
