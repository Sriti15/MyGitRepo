package com.ap.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ap.ui.base.TestBase;

public class ContactsPageOR extends TestBase {
	
	@FindBy(id="id=contact")
	WebElement HeadingDropdown;
	
	@FindBy(id="email")
	WebElement emailInput;
	
	@FindBy(id="id_order")
	WebElement OrderReference;
	
	@FindBy(id="message")
	WebElement messageTextBox;
	
	@FindBy(id="submitMessage")
	WebElement submitMessageButton;
	
	@FindBy(id="[class='alert alert-sucess']")
	WebElement successMsg;
	
	public ContactsPageOR(){// this is a constructor
		PageFactory.initElements(driver, this);
		
	}
		
		public ContactsPageOR fillContactForm(String heading, String email, String reference, String message){
			// has multiple drop down buttons, need to call the object of the element 
			Select select = new Select(HeadingDropdown);
					select.selectByVisibleText(heading);
			emailInput.sendKeys(email);
			OrderReference.sendKeys(reference);
			messageTextBox.sendKeys(message);
			return this;
		}
		
		public void submitMessage(){
			submitMessageButton.click();
		}
		
		public String getMessage(){
			return successMsg.getText();
		}
	}
	




