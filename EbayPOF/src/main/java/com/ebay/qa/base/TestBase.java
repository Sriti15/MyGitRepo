package com.ebay.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ebay.qa.util.TestUtil;

public class TestBase {

	
	public static WebDriver driver;
	public static Properties prop;


  public TestBase() throws Exception{
	  
	  prop = new Properties();
	  FileInputStream fis = new FileInputStream("C:\\testAutomation\\EbayPOF\\src\\main\\java\\com\\ebay\\qa\\config\\config.properties");
	  prop.load(fis);
  }
  
  
  public void initialization(){
	  String browserName =  prop.getProperty("browser");
	  if(browserName.equalsIgnoreCase("chrome")){
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ProSmart\\Desktop\\test\\chromedriver.exe");
		  driver = new ChromeDriver();
	  
	  }
	  else if(browserName.equalsIgnoreCase("firefox")){
		  System.setProperty("webdriver.gecko.driver", "firefox path");
		  driver = new FirefoxDriver(); 
	 
  
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
	  driver.get(prop.getProperty("url"));


	  }
}
}



