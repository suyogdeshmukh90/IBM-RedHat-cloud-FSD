package com.abstractexample;

public class Bike extends Vehicle {
	private double start;
	private double end;
	private double efficiency;
	private double distance;
	
	@Override
	public double distanceCovered(double start, double end) {
		this.start=start;
		this.end=end;
		distance=this.end-this.start;
		
		return distance;
	}

	@Override
	public double fuelEfficiency(double fuelConsumed) {
		
		efficiency=distance/fuelConsumed;
		
		
		return efficiency;
	}
	
	

}
