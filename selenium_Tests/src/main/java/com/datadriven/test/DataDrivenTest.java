package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Read_XSL;

public class DataDrivenTest {

	public static void main(String[] args) {
		//get test data from excel file
	
	Read_XSL reader = new Read_XSL ("C:\\Users\\PSQA\\workspace\\selenium_Tests\\src\\main\\java\\com\\testdata\\half ebay test data.xlsx");

String firstname = reader.getCellData("Registra","firstname",2);
 System.out.println(firstname );
 
 String lastname = reader.getCellData("Registra","lastname",2);
 System.out.println(lastname);
 
 String emailaddress = reader.getCellData("Registra","emailaddress",2);
 System.out.println(emailaddress);
 
 String password = reader.getCellData("Registra","password",2);
 System.out.println(password);
 
 //WebDriver code
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.quit();


driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1");
driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("firstname");
driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("lastname");
driver.findElement(By.xpath("//*[@id='email']")).sendKeys("emailaddress");
driver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys("password");
	}

}
