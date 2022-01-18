package com.koushik.delivery;

import com.koushik.Location.Location;

public class Vehicle 
{
	private int id;
	private String vehicleNo;
	private double capacity;
	private Location currentPosition;
	private VehicleStatus currentStatus;
	
	// Vehicle represents the vehicle which will be used to ship/deliver an order.
	// We support two types of vehicles bike and truck
	public Vehicle(int id, String vehicleNo, double capacity)
	{
		this.id = id;
		this.vehicleNo = vehicleNo;
		this.capacity = capacity;
	}
	
	public int getid()
	{
		return id;
	}
	
	public void setid(int id)
	{
		this.id = id;
	}
	
	public String getvehicleNo()
	{
		return vehicleNo;
	}
	
	public void setvehicleNo(String vehicleNo)
	{
		this.vehicleNo = vehicleNo;
	}

	public double getcapacity()
	{
		return capacity;
	}
	
	public void setcapcity(double capacity)
	{
		this.capacity = capacity;
	}
	
	public Location getcurrentPosition()
	{
		return currentPosition;
	}
	
	public void setcurrentPosition(Location currentPosition)
	{
		this.currentPosition = currentPosition;
	}
	
	public VehicleStatus getcurrentStatus()
	{
		return currentStatus;
	}
	
	public void setcurrentStatus(VehicleStatus currentStatus)
	{
		this.currentStatus = currentStatus;
	}
}
