package com.SdetHybrid1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) //creating constructor
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//@FindBy(name="userName")
	@FindBy(name="uid")
	WebElement txtusername;
	
	@FindBy(name="password") 
	WebElement txtpassword;
	
	//@FindBy(name="submit") 
	@FindBy(name="btnLogin") 
	WebElement btnsubmit;
	
	@FindBy(linkText="SIGN-OFF")
	WebElement lnkLogout;
	
	
	public void setUsername (String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void setPassword (String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clickSubmit ()
	{
		btnsubmit.click();
	}
	
	public void clickLogout ()
	{
		lnkLogout.click();
	}

}
