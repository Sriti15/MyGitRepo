package com.ap.ui.Testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutProductTest {

	@FindBy(css= "[name = 'Submit']")
	WebElement AddCart;
	
	@FindBy (css = "[title = 'Proceed to checkout']")
    WebElement proceedCheckout;
	
	@FindBy(id = "wishlist_button")
	WebElement addWishListButton;
	
	@FindBy (css="[class='fancybox-error']")
	WebElement addWishListMsg;
	

	@FindBy (css="[ class='fancybox-item fancybox-close']")
	WebElement addWishListMsgCloseButton;
}
