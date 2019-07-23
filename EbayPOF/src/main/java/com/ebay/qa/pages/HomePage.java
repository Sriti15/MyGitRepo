package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class HomePage extends TestBase{

	
	
	
	@FindBy(id="gh-logo")
	WebElement ebaylogo;
	
	
	@FindBy(xpath="/html[1]/body[1]/header[1]/div[1]/ul[1]/li[1]/span[1]/a[1]")
	WebElement SignInLink;

	
	
	
	
	public HomePage() throws Exception {
		super();
	
		PageFactory.initElements(driver, this); //this pointing to the current driver, this mean in this class//
	
	}
	
	
	
	//actions//
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
		
	}
	
	
	public boolean verifyHomepageLogo(){
		return ebaylogo.isDisplayed(); 
		
	}
	
	
	public LoginPage clickonSignInLink() throws Exception{
		SignInLink.click();
		return new LoginPage();
	}



	
	
	
	
	
	
	
	
	







}

