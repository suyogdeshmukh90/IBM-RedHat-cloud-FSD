package com.abstractexample;

public class Car extends Vehicle implements Sailer{
	private double start;
	private double end;
	private double efficiency;
	private double distance;
	
	@Override
	public double distanceCovered(double start, double end) {
		this.start=start;
		this.end=end;
		if(this.start>=this.end)
		{
			System.out.println("Invalid details. Please Enter corrent values");
			return 0;
		}
		else {
		distance=this.end-this.start;
		
		return distance;
		}
	}

	@Override
	public double fuelEfficiency(double fuelConsumed) {
		
		if(fuelConsumed<10) {
		System.out.println("Please Enter valid value.");
		return 0;
		}
		else {
		efficiency=distance/fuelConsumed;
		return efficiency;
		}
	}
	
	public void dock()
	{
		System.out.println("Give Permision to land on airport");
	}

}
