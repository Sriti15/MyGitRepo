package com.crm.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.HomePage;
import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {  //TestBase is the parent of login page that is 
		//why i am using extend to call the script
// define object repository =OR
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[ contains(test(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;
	
	// above listing is what i will be testing on login page,
	//basically what i see when i go to the application.
	
	//important question - how do you initialize elements with the help of page factory?
	 // answer- need to create a constructor of the class and set up "PageFactory.initElements(driver, this);" 
	
	
	// Initialize the page Object
	public LoginPage(){
		PageFactory.initElements(driver, this);//"this" mean point to current class object.
}
	//actions:
	public String validateLoginPageTitle(){
		return  driver.getTitle();
	}
	public boolean validateCRMImage(){
		return  crmlogo.isDisplayed();

	}
	public HomePage login(String un , String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}

