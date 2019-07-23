package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {// TestBase is my class

	public static WebDriver driver;
	public static Properties prop;// Initialing properties variable 
	
	
	public TestBase(){// constructor of my class "TestBase"
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
	 prop.load(ip);	
			}catch (FileNotFoundException e){
				e.printStackTrace();
				
			}catch (IOException e){
				e.printStackTrace();
			}

	}
	
	public static void initialization(){
	String browserName =prop.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome")){
		System.getProperty("webdriver.chrome.driver","C:\\Users\\PSQA\\Desktop\\chromedriver.3");
		driver = new ChromeDriver();
		
	}else if (browserName.equalsIgnoreCase("FF")){
		System.getProperty("webdriver.gecko.driver","C:\\Users\\PSQA\\Desktop\\geckodriver.3");
		driver = new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.TestUtil_WAIT, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));// launching my url getting it from config.properties.
	}
}