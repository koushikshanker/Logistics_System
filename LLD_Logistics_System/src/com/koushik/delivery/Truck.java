package com.koushik.delivery;

public class Truck extends Vehicle
{
	private final static int capacityofTruck = 100;
	
	// Truck with a id, VehicleNo and capacity of the car denotes the amount of load it can carry
	public Truck(int id, String VehicleNo)
	{
		super(id,VehicleNo,capacityofTruck);
	}
}
