package com.SdetHybrid1.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SdetHybrid1.PageObjects.LoginPage;

import java.io.IOException;

public class TC_LoginTest_1 extends BaseClass
{
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		driver.get(baseURL);
		Logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver); //create an object for LoginPage class, the LoginPage constructor will b einvoked))
		lp.setUsername(username);
		Logger.info("Entered UserName");
		lp.setPassword(password);
		Logger.info("Entered Password");
		lp.clickSubmit();
		Logger.info("LogIn is successful");
		Thread.sleep(20000);
	
		
		if(driver.getTitle().equals("Login: Mercury Tours"))
		
		{
			Assert.assertTrue(true);
			Logger.info("LoginIn test is passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			Logger.info("LoginIn test is failed");
		}
		
		
	}

}
