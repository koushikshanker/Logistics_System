package com.koushik.itemTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.koushik.Item.Item;

class itemTest 
{
	@BeforeEach
	void setUp() throws Exception 
	{
		//
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		//
	}

	// We can write a for loop for all the three test cases but I purposefully wrote three different cases
	@Test
	void Item1NameandPrice() 
	{
		Item item = new Item("1");
		assertEquals(item.getname(),"Earphones");
		assertEquals(item.getprice(),20);
	}
	
	@Test
	void Item2NameandPrice() 
	{
		Item item = new Item("2");
		assertEquals(item.getname(),"Laptop");
		assertEquals(item.getprice(),40);
	}
	
	@Test
	void Item3NameandPrice()
	{
		Item item = new Item("3");
		assertEquals(item.getname(),"Mobile Phone");
		assertEquals(item.getprice(),50);
	}
}
