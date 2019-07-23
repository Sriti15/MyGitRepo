package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//input[@id='userid']")
	WebElement username;

	
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='sgnBt']")
	WebElement SingInBtn;
	
	
	public LoginPage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	//actions//
	
	
	public HomePage verifyLoginIn(String usernm, String psswrd) throws Exception
	{
		username.sendKeys(usernm);
		password.sendKeys(psswrd);
		SingInBtn.click();
		
		return new HomePage();
		
	}

}
