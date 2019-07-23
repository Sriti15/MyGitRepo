package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.HomePage;
import com.crm.qa.base.LoginPage;
import com.crm.qa.base.TestBase;



public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){// creating constructor of login page 
		super();// super key word  to initialize my properties.
	// here i am using TestNG Annotation For my Test Cases
}
	@BeforeMethod
	public void  setUp(){
		initialization(); // calling it from test base
	 loginPage = new LoginPage();
	
	}
	
	@Test (priority= 1)
	public void  loginPageTitle(){ // this is piece of code is locate it in login page .
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"#1 Free CRM FOR Any Bussiness: Oline Customer Relationship Software");
	}
	
	@Test(priority=2)
	public void crmLogoTest(){
	boolean flag = loginPage.validateCRMImage();
	Assert.assertTrue(flag);
	
	}
	
	@Test (priority=3)
	public void loginTest(){
	homePage =	loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	
	}
	
	
	
	
	
	
	// i'm closing down my browser
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
