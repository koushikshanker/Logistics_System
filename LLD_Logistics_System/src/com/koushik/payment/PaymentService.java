package com.koushik.payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.koushik.Item.Item;
import com.koushik.main.Messages;

public class PaymentService extends Messages
{	
	// payment process enables user to choose the payment mode he prefers
	public PaymentDetails paymentProcess(Item items) throws IOException
	  {
		  final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println('\n'+"Which payment mode do you want to use?"+'\n'+"1. Debit card"+'\n'+"2. Credit card");
		  final String paymentMode = reader.readLine();
		  System.out.println('\n'+"Enter your card details");
		  final String cardNo = reader.readLine();
		  PaymentDetails transactionDetails = new PaymentDetails(items.getprice(),cardNo,paymentMode);
			
		  return transactionDetails;
	  }
}
