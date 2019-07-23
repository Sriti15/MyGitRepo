package com.ap.ui.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.ui.base.TestBase;
import com.ap.ui.pages.ContactsPageOR;
import com.ap.ui.pages.HomePageOR;

public class ContactTest extends TestBase{

	ContactsPageOR contactspage;
	HomePageOR homepage;
	
	public  ContactTest(){
		super();//used in subclass from super class 
	}
	@BeforeMethod
	public void setUpdriver(){
		initialization();
		contactspage = new ContactsPageOR();
		homepage = new HomePageOR();
	}
	@Test
	public void testContact(){
		homepage.clickOnContactLink();
		
		contactspage = contactspage.fillContactForm("Customer service", "Random@test.com","Testing","This is test purpose");
		contactspage.submitMessage();
		String successMsg = contactspage.getMessage();
		Assert.assertEquals(successMsg, "will check the meesaage on the site later");
		
	}
	@AfterMethod
	public void teaarDown(){
		driver.quit();
	}
}

