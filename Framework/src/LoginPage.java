

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LoginPage {
WebDriver driver;

 public  LoginPage(WebDriver rdriver) {
	// no need public void : I am  creating a constructor(does not have return type) always a blueprint of a class 
	//or initialized the driver
	 
	this.driver = rdriver;
}

  @FindBy(id="email")//
  @CacheLookup
  WebElement username;

  
  @FindBy(how=How.ID, using="pass")//
  @CacheLookup
  WebElement password;
  
  
  @FindBy(how=How.XPATH, using=".//*[@id='u_0_2']")
  @CacheLookup
  WebElement Submit_bt;

  
  
  public void login_fb(String userid, String passw){
  
	  
	  username.sendKeys(userid);
	  password.sendKeys(passw);
      Submit_bt.click();
     
}
}