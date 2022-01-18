package com.koushik.main;

import java.io.IOException;
import com.koushik.Item.Item;
import com.koushik.Logistics.LogisticsSystem;
import com.koushik.delivery.deliveryService;
import com.koushik.order.OrderService;
import com.koushik.payment.PaymentDetails;
import com.koushik.payment.PaymentService;
import com.koushik.user.User;
import com.koushik.user.UserService;

public class Main extends Messages 
{
	public static void main(String[] args) throws IOException 
	{
		while (true) 
		{
			System.out.println('\n' + MSG_Welcome);

			// Taking user details from user
			User newUserDetails = new UserService().takeUserDetails();

			// Showing the list of items 
			Item itemsOrdered = new OrderService().showItems();

			// Making the transaction with the amount of the item user has bought
			PaymentDetails transactionDetails = new PaymentService().paymentProcess(itemsOrdered);
			
			// Inventory processes the item from inventory and forwards it to delivery service
			new LogisticsSystem().InventoryHouse(transactionDetails, itemsOrdered);

			// items are delivered to user address after taking it from inventory
			new deliveryService().delivery(itemsOrdered, newUserDetails);
		}
	}
}
