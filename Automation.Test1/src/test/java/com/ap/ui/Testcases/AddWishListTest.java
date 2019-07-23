package com.ap.ui.Testcases;

import com.ap.ui.base.TestBase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.ui.pages.HomePageOR;
import com.ap.ui.pages.LoginPageOR;
import com.ap.ui.pages.ProductDetailsPage;
import com.ap.ui.pages.SearchPageOR;

	public class AddWishListTest extends TestBase{

		LoginPageOR loginPage;
		HomePageOR homePage;
		SearchPageOR searchPage;
		ProductDetailsPage productDetailsPage;
		
		
		public AddWishListTest() {
			super();
			}

		@BeforeMethod
		public void setUpdriver(){
			initialization();
			loginPage = new LoginPageOR();
			homePage = new HomePageOR();
			
		}
		
	
		
		@Test (priority=3)
		public void testAddProductToWishList(){
			String product = "Printed Chiffon Dress";
			homePage.clickonSignIn();
			homePage = loginPage.login(propt.getProperty("username"), propt.getProperty("password"));
			
			searchPage = homePage.searchProduct(product);
			String header = searchPage.getHeader();
			System.out.println(header);
			Assert.assertTrue(header.toLowerCase().contains(product.toLowerCase()));
		
			productDetailsPage.clickAddWishListButton();
			productDetailsPage.verifyAddWishListMsg();
			homePage.logOut();
	}
		@AfterMethod
		public void tearDown(){
		driver.quit();
	}
	
		
		
}
		
	
