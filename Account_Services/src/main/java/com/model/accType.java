package com.model;

public enum accType {
SAVING("Saving Account"),
CREDIT_CARD("Credit Card"),
LOAN("Loan"),
CURRENT("Current");
	
	private String type;

	private accType(String type) {
		this.type = type;
	}

	public String getaccType() {
		return type;
	}
	
}
