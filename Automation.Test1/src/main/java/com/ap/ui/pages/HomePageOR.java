package com.ap.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.ui.base.TestBase;

public class HomePageOR extends TestBase {

	
	

	    
	@FindBy(css="[class='login']")
	static
	WebElement signInButton;
	
	@FindBy(id = "contact-link")
	WebElement ContactLink;
	
	@FindBy(id = "search_query_top")
	WebElement searchInputbox;
	
	@FindBy(css="[name='submit_search']")
	WebElement submitSearch;
	
	@FindBy(css="[class='logout']")
	WebElement logOutButton;
	
	public HomePageOR() {
		PageFactory.initElements(driver, this);
	}
	
	public SearchPageOR searchProduct(String productName){
		searchInputbox.sendKeys(productName);
		submitSearch.click();
		return new SearchPageOR();
	}


	public void clickonSignIn(){
		signInButton.click();
		
	}
		
	public void clickOnContactLink(){
		ContactLink.click();
	}

	public void logOut() {
		logOutButton.click();
	}
		
		





	  }
	    
	

