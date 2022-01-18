package com.koushik.deliveryTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.koushik.Item.Item;
import com.koushik.delivery.deliveryService;
import com.koushik.user.User;

class deliveryServiceTest 
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
	void DeliveryTest() 
	{
		Item newItem = new Item("2");
		User newUser = new User("1","sravan","sravan@gmail.com","HNO 3-3-26");
		new deliveryService().delivery(newItem, newUser);
		final String expectedOutput =
				 "\nDelivering your item Laptop through bike\n"
				            + "........\n"
				            + "\nDelivered your item Laptop at address:HNO 3-3-26\n"
				            + "........\n";
		assertEquals(expectedOutput, outContent.toString());
	}
}
