package com.koushik.user;

public class User
{
	private String userId;
    private String name;
    private String address;
    private String emailId;
    
    public User(String userId, String name, String emailId, String address)
    {
    	this.userId = userId;
    	this.name = name;
    	this.address = address;
    	this.emailId = emailId;
    }
    
    public String getuserId()
    {
    	return userId;
    }
    
    public void setuserId(String userId)
    {
    	this.userId = userId;
    }
    
    public String getname()
    {
    	return name;
    }
    
    public void setname(String name)
    {
    	this.name = name;
    }
    
    public String getaddress()
    {
    	return address;
    }
    
    public void setaddress(String address)
    {
    	this.address = address;
    }
    
    public String getemailId()
    {
    	return emailId;
    }
    
    public void setemailId(String emailId)
    {
    	this.emailId = emailId;
    }
}
