package com.example.demo.entity;

public class User {
	private String id;
	private String name;
	private String userName;
	private String password;
	
	@Override
	public String toString()
	{
		return "User[id=" + id + ", name=" + name + ", userName=" + userName + ", password=" + password + ",]";
		
	}
	public User(String id, String name,String userName,String password)
	{
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getUserName()
	{
		return userName;
	
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
		
	}
	public String getpassword()
	{
		return password;
	}
	public void setpassword(String password)
	{
		this.password = password;
	}

}
