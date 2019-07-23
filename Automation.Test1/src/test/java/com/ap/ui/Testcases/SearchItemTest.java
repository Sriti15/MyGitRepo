package com.ap.ui.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.ui.base.TestBase;
import com.ap.ui.pages.HomePageOR;
import com.ap.ui.pages.LoginPageOR;
import com.ap.ui.pages.SearchPageOR;

public class SearchItemTest extends TestBase{
	
	LoginPageOR LoginPageOR;
	HomePageOR  HomePageOR;
	SearchPageOR SearchPageOR;
	
	public SearchItemTest(){
		super();
	}
	
			@BeforeMethod 
		public void setUpdriver(){
				initialization();
				LoginPageOR = new LoginPageOR();
				HomePageOR = new  HomePageOR();				
			
		}
		@Test (priority = 3)
		public void testSearchItem(){
			String product = "Evening";
			HomePageOR.clickonSignIn();
			HomePageOR = LoginPageOR.login(propt.getProperty("username"), propt.getProperty("password"));
			
			SearchPageOR= 	HomePageOR.searchProduct("Evening");
			String header = SearchPageOR.getHeader();
			Assert.assertTrue(header.toLowerCase().contains(product.toLowerCase()));
			HomePageOR.logOut();
		}
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
	}


