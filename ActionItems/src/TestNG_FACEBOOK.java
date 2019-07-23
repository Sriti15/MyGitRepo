import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestNG_FACEBOOK {
	


@Test(priority = 1)
 //since I did not have main method i used Testng
// add libaray annotation 
private void openbrowser() {
	 System. setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver(); // calling the driver
	 
	driver.get("www.facebook.com");
	driver.findElement(By.xpath("//input[@type='text' and @id=' u_0_c']")).sendKeys("Gowen");
	 driver.findElement(By.xpath("//input[@type='text' and @id='u_0_e']")).sendKeys("Getter");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jessey123@live.com");
	driver.findElement(By.xpath("//input[@type='password' and @id='pass']")).sendKeys("MloveMe");
		

	
	Select dropdownMonth = new Select(driver.findElement(By.xpath("//input[@type'month']")));
	dropdownMonth.selectByIndex(8);
	
	Select dropdownDay = new Select(driver.findElement(By.xpath("//input[@type'day']")));
	dropdownDay.selectByIndex(07);
	
	Select dropdownYear = new Select(driver.findElement(By.xpath("//input[@id'year']")));
	dropdownYear.selectByVisibleText("1967");
	
	
	driver.findElement(By.xpath("//input[@id'u_0_9']")).click();
	driver.findElement(By.xpath("//input[@id'u_0_u']")).click();
	driver.close();
}
	
	@Test (priority= 2)
	
	public void login(){
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(); // calling the driver
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type'email']")).sendKeys("jessey123@live.com");
		driver.findElement(By.xpath("//input[@type'pass']")).sendKeys("MloveMe");
		driver.close();
	}
	

}
