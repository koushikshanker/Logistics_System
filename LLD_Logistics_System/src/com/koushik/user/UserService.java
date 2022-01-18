package com.koushik.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.koushik.main.Messages;

// Taking details from user for delivery and further communications
public class UserService extends Messages
{
	 public User takeUserDetails() throws IOException
	  { 
		 	final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 	
			System.out.println('\n'+MSG_USER_ID);
			final String userId = reader.readLine();
			
			System.out.println('\n'+MSG_NAME);
			final String name = reader.readLine();
		
			System.out.println('\n'+MSG_EMAIL);
			final String email = reader.readLine();
			
			System.out.println('\n'+MSG_ADDRESS);
			final String address = reader.readLine();
			
			return new User(userId, name, email, address);
	  }
}
