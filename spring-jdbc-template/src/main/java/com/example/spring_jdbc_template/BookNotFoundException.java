package com.example.spring_jdbc_template;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Getter
public class BookNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3132261406904588593L;
	private String message;
}
