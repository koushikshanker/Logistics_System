package com.koushik.loading;

public class loading 
{
	// buffering method represents loader in between the services
	// prints ........
	public void buffering()
    {
		for(int i=0;i<7;i++)
		{
			System.out.print(".");
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				
			}
		}
		System.out.print("."+'\n');
    }
}
