

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class UniqloTest {
	
	WebDriver driver;


@ BeforeMethod
 
public void open(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\chromedriver.exe");	
	
driver = new ChromeDriver();
driver.get("https://www.uniqlo.com");

}

@Test(priority=2)
public void LogoTest() throws InterruptedException{
String Test=driver.getTitle();
System.out.println(Test);
Thread.sleep(3000); 


}

@Test(priority=1)
public void searchTest() throws InterruptedException{
driver.findElement(By.id("q")).sendKeys("Shirt");
Thread.sleep(3000);
}



@AfterMethod
public void CloseBrowser(){
	driver.close();
}





}