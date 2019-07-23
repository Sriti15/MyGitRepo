package com.ap.ui.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.ap.ui.util.Testutil;
import com.ap.ui.util.WebEventListener;


//setting up property values the class i will be work with 
public class TestBase {

	public static WebDriver driver;
	public static Properties propt;
	public static EventFiringWebDriver en_driver;
	public static WebEventListener eventListener;


public TestBase(){// listen to lubna.. audio // constructor , using a try catch method to work and access config file
	try {
		
		propt = new Properties();
		
FileInputStream ipa = new FileInputStream(System.getProperty("user.dir")+"/Automation.Test1/src/main/java/com/ap/ui/config");
	 propt.load(ipa); // copy and paste form config. file location

}   catch(FileNotFoundException e){
	 e.printStackTrace();
	 
}  catch(IOException e){
	e.printStackTrace();
	
}
} // always save the work
	public static void initialization(){ // creating  a method invoking which browser I want to use i can give a name.
	
		String browserName = propt.getProperty("browser");// creating a object 
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.getProperty("webDriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\chromedriver.");
			driver = new ChromeDriver();
		}
			else if (browserName.equalsIgnoreCase("FF")){// FF - FireFox
			System.setProperty("webdriver.gecko.driver", "path of the FireFox driver");
			driver = new FirefoxDriver();
				
			}
			else if (browserName.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.gecko.driver", "Path of the IE driver");
				driver = new InternetExplorerDriver();
				
			}
		
		//calling the object , by creating the object and calling multiple driver
		
		
		//creating an object for action that 's occurring and sharing with driver
		en_driver = new EventFiringWebDriver(driver);
		// creating object of eventListener to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		// CAPTURE ANY ACTION HAPPENNING BASED ON THE METHOD WE CREATE WebEventListener CLASS
		en_driver.register(eventListener);
		//since we driver object is for browser and en_driveris for event thats taking place.
		//we declaring that they are equal to each when they are exchanging the info  
		//
		driver = en_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Testutil.Implicit_wait, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.Page_Load, TimeUnit.SECONDS);
		
		
		driver.get(propt.getProperty("url"));
		
			}
	


	
}
      

  

