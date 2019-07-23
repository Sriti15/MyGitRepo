package com.ap.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.ui.base.TestBase;

public class SearchPageOR extends TestBase {

	@FindBy(id="add_to_cart")
	WebElement addCartButton;
	
	@FindBy(css="[title='Proceed to checkout']")
	WebElement searchHeading;
	
	
	 public SearchPageOR (){
		 PageFactory.initElements(driver, this);
	 }
	 
	 public ProductDetailsPage selectProduct(String productName){
		 
		 String Locator = "[class='Product-name'][title='"+ productName+ "']";
		 driver.findElement(By.cssSelector(Locator)).click();
		 return new ProductDetailsPage();
	 }
	public String getHeader() {

	 return searchHeading.getText();
	 
}

}
