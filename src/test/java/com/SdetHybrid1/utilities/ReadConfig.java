package com.SdetHybrid1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro; //pro is an object of properties class
	
	public ReadConfig() //constructor to load the complete file
	{
		File src=new File("./Configuration/config.properties");   //src is referring the properties file
		
		try {
			FileInputStream fis = new FileInputStream(src); //opening the file in input mode
			pro = new Properties(); //initiating pro object
			pro.load(fis); //will load the file
			}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
	}
	public String getApplicationURL() //creating a method to read variable and value from config file and assign to a variable
	{
		String url=pro.getProperty("baseURL");
		return url;
		
	}
	public String getUsername()
	{
		String UserName=pro.getProperty("username");
		return UserName;
		
	}
	public String getPassword()
	{
		String PassWord=pro.getProperty("password");
		return PassWord;
		
	}
	public String getFirefoxpath()
	{
		String FirefoxPath=pro.getProperty("firefoxpath");
		return FirefoxPath;
		
	}
	public String getChromePath()
	{
		String Chromepath=pro.getProperty("chromepath");
		return Chromepath;
		
	}
	public String getIEPath()
	{
		String IePath=pro.getProperty("iepath");
		return IePath;
		
	}

}
