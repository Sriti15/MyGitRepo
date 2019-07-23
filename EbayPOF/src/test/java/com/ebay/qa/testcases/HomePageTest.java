package com.ebay.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.LoginPage;

import junit.framework.Assert;

public class HomePageTest  extends TestBase{
 public static HomePage homePage;
 public static LoginPage loginPage;
 
	public HomePageTest() throws Exception {
		super();
	
	}
	
	
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		homePage = new HomePage();
	}
	
	
	@Test(priority=1)
	public void ValidateHomePageTitleTest(){
			
	String HomePageTitle = homePage.verifyHomePageTitle();	
	Assert.assertEquals(HomePageTitle, "ebay", "homepage title is incorrect");
	
	}
	
	
	@Test(priority=2)
	public void ValidateSignInLinkTest() throws Exception{
		loginPage = homePage.clickonSignInLink();
		loginPage.verifyLoginIn(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
