package org.demo.spring_hibernate_integration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BookNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9118668803974480398L;
	private String message;
}
