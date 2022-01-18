package com.koushik.LogisticsSystemTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.koushik.Item.Item;
import com.koushik.Logistics.LogisticsSystem;
import com.koushik.loading.loading;
import com.koushik.payment.PaymentDetails;

class LogisticsSytemTest 
{
	private InputStream sysInBackup;
	private PrintStream sysOutBackup;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	 
	@BeforeEach
	void setUp() throws Exception 
	{
		 sysInBackup = System.in; // backup System.in to restore it later
		 sysOutBackup = System.out; // backup System.out to restore it later
		 System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		System.setIn(sysInBackup);
	    System.setOut(sysOutBackup);
	}

	@Test
	void LogisticsServiceTest() 
	{
		PaymentDetails newPayment = new PaymentDetails(100, "3939 8392 3939 2010", "1");
		Item newItem = new Item("1");
		new LogisticsSystem().InventoryHouse(newPayment, newItem);;
		final String expectedOutput ="\n"
									+ "Validating your card details\r\n"
									+ "........\n"
									+ "\n"
									+ "Deducting 100.0$ from your Debit card\r\n"
									+ "........\n"
									+ "\n"
									+ "Deducted 100.0$ from your Debit card with transaction Id: "+newPayment.gettransactionId()+"\r\n"
									+ "........\n"
									+ "\n"
									+ "Adding your order: Earphones\r\n"
									+ "........\n"
									+ "\n"
									+ "Processing your order: Earphones\r\n"
									+ "........\n";       
		assertEquals(expectedOutput, outContent.toString());
	}
}
