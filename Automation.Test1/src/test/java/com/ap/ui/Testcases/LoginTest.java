package com.ap.ui.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.ui.base.TestBase;
import com.ap.ui.pages.HomePageOR;
import com.ap.ui.pages.LoginPageOR;

public class LoginTest extends TestBase{
	
	LoginPageOR loginPage;
	HomePageOR HomePage;
	
	public LoginTest(){// constructor
		super();
	}
	
@BeforeMethod
public void setUpdriver(){
	initialization();
	loginPage = new LoginPageOR();
	
}

@Test(priority=1)
public void loginPageTitleTest(){
	String title = loginPage.verifyPageTitle();
	Assert.assertEquals(title, "Later will check on the site");
		
	}

@ Test(priority=2)
public void apLogoTest(){
	boolean value = loginPage.validateAPImage();
		Assert.assertTrue(value);
		
}

@Test(priority=3)

public void loginTest(){
	HomePage = loginPage.login(propt.getProperty("username"),propt.getProperty("password")); 
}

@AfterMethod
public void closeBrowser(){
	driver.quit();
}
}



