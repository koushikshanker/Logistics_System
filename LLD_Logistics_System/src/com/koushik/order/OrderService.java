package com.koushik.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.koushik.Item.Item;
import com.koushik.main.Messages;

public class OrderService extends Messages
{
	// Items are shown on console for the user to buy
	public Item showItems() throws IOException
	  {
		  final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println('\n'+"Which item do you want to buy?"+'\n'+
				  						"1. Earphones, Price: 20$"+'\n'+
				  						"2. Laptop, Price: 40$"+'\n'+
				  						"3. Mobile Phone, Price: 50$");
		  final String orderId = reader.readLine();
		   
		  return new Item(orderId);
	  }
}
