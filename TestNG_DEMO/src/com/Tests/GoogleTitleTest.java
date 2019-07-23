package com.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.google.com");
	}
	
	@Test()
	public void googleTest() {
	String Title=driver.getTitle();
	System.out.println(Title);
	Assert.assertEquals("title", "Google");
	//if the test pass it will pass however if it fails the test fail.
	}

	@Test()
	public void googleLogoTest() 	{
	Boolean b =	driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	Assert.assertTrue(b);
	Assert.assertEquals("b", "true");
	}
	

		
	

	
	@AfterMethod
	public void CloseBrowser(){
		driver.close();
	}
	
	
}




	
	
	
	
	
	
	
	
	


