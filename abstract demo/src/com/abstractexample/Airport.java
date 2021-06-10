package com.abstractexample;

public class Airport {
	private void givePermissionToDock(Sailer s)
	{
		s.dock();
	}

	public static void main(String[] args) {
		Airport air=new Airport();
		Car car = new Car();
		System.out.println(car.distanceCovered(201, 870));
		System.out.println(car.fuelEfficiency(32));
		air.givePermissionToDock(car);
		
		SeaPlane sea=new SeaPlane();
		sea.takeOf();
		sea.fly();
		sea.land();
		
		System.out.println(sea.distanceCovered(550, 530));
		System.out.println(sea.fuelEfficiency(9));
	}

}
