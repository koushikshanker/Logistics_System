package com.koushik.delivery;

import com.koushik.Item.Item;
import com.koushik.loading.loading;
import com.koushik.user.User;

public class deliveryService 
{
	 final loading loader = new loading();
	 
	 // After the payment is done by the user, the inventory forwards the items and details of the user for delivery
	 public void delivery(Item itemsOrdered, User newUserDetails)
	 {
		 System.out.print('\n'+"Delivering your item "+itemsOrdered.getname()+" through bike"+'\n');
		 loader.buffering();
		 System.out.print('\n'+"Delivered your item "+itemsOrdered.getname()+" at address:"+newUserDetails.getaddress()+'\n');
		 loader.buffering();
	 }	 
}
