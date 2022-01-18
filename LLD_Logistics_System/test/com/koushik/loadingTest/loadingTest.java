package com.koushik.loadingTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.koushik.loading.loading;

class loadingTest 
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
	void LoaderTest() 
	{
		loading newloader = new loading();
		newloader.buffering();
		final String expectedOutput ="........\n";       
		assertEquals(expectedOutput, outContent.toString());
	}
}
