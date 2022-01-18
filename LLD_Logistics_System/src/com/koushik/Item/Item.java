package com.koushik.Item;

import java.util.HashMap;

public class Item 
{
	private String name;
	private String orderId;
	private double price;
	
	// Item represents an item which will be shipped. An order will contain a list of items.
	public Item(String orderId)
	{
		HashMap<String, Integer> orderIdandPrices = new HashMap<>();
        orderIdandPrices.put("1", 20);
        orderIdandPrices.put("2", 40);
        orderIdandPrices.put("3", 50);
        
        HashMap<String, String> orderIdandNames = new HashMap<>();
        orderIdandNames.put("1", "Earphones");
        orderIdandNames.put("2", "Laptop");
        orderIdandNames.put("3", "Mobile Phone");
        
        this.setOrderId(orderId);
		this.name = orderIdandNames.get(orderId);;
		this.price = orderIdandPrices.get(orderId);
	}
	
	public String getname()
	{
		return name;
	}
	
	public void setname(String name)
	{
		this.name = name;
	}
	
	public double getprice()
	{
		return price;
	}
	
	public void setprice(double price)
	{
		this.price = price;
	}

	public String getOrderId() 
	{
		return orderId;
	}

	public void setOrderId(String orderId) 
	{
		this.orderId = orderId;
	}
}
