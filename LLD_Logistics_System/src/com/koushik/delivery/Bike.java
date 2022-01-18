package com.koushik.delivery;

public class Bike extends Vehicle
{
	private final static int capacityofBike = 100;
	
	// Bike with a id, VehicleNo and capacity of the bike denotes the amount of load it can carry
	public Bike(int id, String VehicleNo)
	{
		super(id,VehicleNo,capacityofBike);
	}
}
