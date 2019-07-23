import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Helper.BrowserN;

public class VerifyingLogin {
	
	public void testLoginUser()
	
	
	{//for launching specific url
		WebDriver driver=BrowserN.launchBrowser("chrome", "https://www.facebook.com/");
	// creating page object using page factory
		LoginPage Login_Page = PageFactory.initElements(driver, LoginPage.class);
	//capturing  all the elements the method that i have 
	// call the 3rd method
		Login_Page.login_fb("hamilton12@yahoo.com","test4567");
	// to get the data type from LoginPage (that was created first); go to the facebook page to put th
}
				}