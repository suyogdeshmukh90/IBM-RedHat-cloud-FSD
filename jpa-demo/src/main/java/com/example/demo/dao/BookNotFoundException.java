package com.example.demo.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BookNotFoundException extends Exception {


	private static final long serialVersionUID = -3150816611453843183L;

	private String message;
}
