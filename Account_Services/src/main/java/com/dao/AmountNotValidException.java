package com.dao;

public class AmountNotValidException extends Exception {
	private String message;
	public AmountNotValidException(String message)
	{
		super();
		this.message=message;
		
	}
	public String getMessage()
	{
		return message;
	}
}
