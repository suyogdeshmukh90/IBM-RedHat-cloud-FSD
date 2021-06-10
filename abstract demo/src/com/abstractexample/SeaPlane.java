package com.abstractexample;

public class SeaPlane extends Airplane implements Sailer {
	public void dock()
	{
		System.out.println("Permission grated to SeaPlane to land at the airport");
	}

	@Override
	public void takeOf() {
		System.out.println("Plane is Taking Off");
		
	}

	@Override
	public void fly() {
		System.out.println("Plane is Flying");
	}

	@Override
	public void land() {
		System.out.println("Plane is Landing");
	}
	@Override
	public double distanceCovered(double start, double end) {
		return super.distanceCovered(start, end);
	}

	@Override
	public double fuelEfficiency(double fuelConsumed) {
		
		return super.fuelEfficiency(fuelConsumed);
	}
	
}
