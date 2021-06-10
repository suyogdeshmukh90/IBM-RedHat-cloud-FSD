package com.abstractexample;

public abstract class Vehicle {
	public abstract double distanceCovered(double start, double end);
	public abstract double fuelEfficiency(double fuelConsumed);
	
	public String getDetails()
	{
		return "Hii!!!";
	}
	private String msg;
	public String getMessage() {
		return msg;
	}
	public void setMessage(String msg) {
		this.msg = msg;
	}
	

}
