package com.koushik.Logistics;
import java.util.ArrayList;
import java.util.List;

import com.koushik.Item.Item;
import com.koushik.Location.Location;
import com.koushik.delivery.Vehicle;
import com.koushik.loading.loading;
import com.koushik.order.Order;
import com.koushik.payment.PaymentDetails;
import com.koushik.user.User;

// which stores all the information of users, orders and vehicles. It has the methods like takeAnOrder(), processOrder() etc.
public class LogisticsSystem 
{
	private List<Order> orders;
    private List<Vehicle> vehicles;
    private List<User> users;
    final loading loader = new loading();
    
    public LogisticsSystem()
    {
        this.orders = new ArrayList<Order>();
        this.vehicles = new ArrayList<Vehicle>();
        this.users = new ArrayList<User>();
    }
    
    public void InventoryHouse(PaymentDetails transactionDetails, Item itemsOrdered)
	{
    	if(transactionDetails.getpaymentStatus()=="PAID")
    	{
	    	 takeAnOrder(itemsOrdered);
			 loader.buffering();
			 processOrder(itemsOrdered);
			 loader.buffering();
    	}
    	else
    	{
    		System.out.println("Due payment");
    	}
	}
    
    public void takeAnOrder(Item itemsOrdered)
    {
        System.out.println('\n'+"Adding your order: "+itemsOrdered.getname());
        //orders.add(order);
    }
 
    public void processOrder(Item itemsOrdered)
    {
        System.out.println('\n'+"Processing your order: "+itemsOrdered.getname());
    }
 
    public Location trackOrder(int orderId)
    {
        System.out.println('\n'+"Tracking an order of the system");
        Location location = null;
        // location = findLocationOfGivenOrder();
        return location;
    }
 
    public void cacelOrder(Order order)
    {
        System.out.println('\n'+"Going to cancell an order of the system");
    }
 
    public void registerNewUser(User user)
    {
        System.out.println("Registering a new user to the system");
        users.add(user);
    }
 
    public List<Order> getOrders()
    {
        return orders;
    }
 
    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }
 
    public List<Vehicle> getVehicles()
    {
        return vehicles;
    }
 
    public void setVehicles(List<Vehicle> vehicles)
    {
        this.vehicles = vehicles;
    }
 
    public List<User> getUsers()
    {
        return users;
    }
 
    public void setUsers(List<User> users)
    {
        this.users = users;
    }
}
