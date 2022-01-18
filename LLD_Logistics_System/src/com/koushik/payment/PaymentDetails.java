package com.koushik.payment;

import com.koushik.loading.loading;

public class PaymentDetails 
{
    private String transactionId;
    private double amount;
    private String cardNumber;
    private String paymentStatus;
    private String paymentMode;
    
    final loading loader = new loading();
    
    public PaymentDetails(double amount, String cardNumber, String paymentMode)
    {
    	this.amount = amount;
    	this.cardNumber = cardNumber;
    	this.paymentMode = mode(paymentMode);
    	this.paymentStatus = validateCardNo(cardNumber);
    	this.transactionId = generateTransId(paymentStatus);
    }
    
    private String generateTransId(String paymentStatus)
    {
    	if(paymentStatus.matches("PAID"))
    	{
    		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    						+ "0123456789"
                    						+ "abcdefghijklmnopqrstuvxyz";
    		int sizeOfTransactionId = 10;
			StringBuilder sb = new StringBuilder(sizeOfTransactionId);
				
			for (int i = 0; i < sizeOfTransactionId; i++)
			{
				int index = (int)(AlphaNumericString.length()* Math.random());
				sb.append(AlphaNumericString.charAt(index));
			}
			
			System.out.println('\n'+"Deducted "+amount+"$ from your "+paymentMode+" "+ "with transaction Id: "+sb.toString());
			loader.buffering();
			
			return sb.toString();
    	}		
    	return "";
    }
    
    private String validateCardNo(String cardNumber)
    {
    	if(!cardNumber.isEmpty())
    	{
    		System.out.println('\n'+"Validating your card details");
			loader.buffering();
    		System.out.println('\n'+"Deducting "+amount+"$ from your "+paymentMode);
			loader.buffering();
			
			return "PAID";
    	}
    	return "UNPAID";	
    }
    
    private String mode(String paymentMode)
    {
    	if(paymentMode.matches("1"))
    		return "Debit card";
    	else
    		return "Credit card";
    }
    
    public String gettransactionId()
    {
    	return transactionId;
    }
    
    public void settransactionId(String transactionId)
    {
    	this.transactionId = transactionId;
    }
    
    public double getamount()
    {
    	return amount;
    }
    
    public void setamount(double amount)
    {
    	this.amount = amount;
    }
    
    public String getcardNumber()
    {
    	return cardNumber;
    }
    
    public void setcardNumber(String cardNumber)
    {
    	this.cardNumber = cardNumber;
    }
    
    public String getpaymentMode()
    {
    	return paymentMode;
    }
    
    public void setpaymentMode(String paymentMode)
    {
    	this.paymentMode = paymentMode;
    }
    
    public String getpaymentStatus()
    {
    	return paymentStatus;
    }
    
    public void setpaymentStatus(String paymentStatus)
    {
    	this.paymentStatus = paymentStatus;
    }
}
