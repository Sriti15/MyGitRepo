package WordPressLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DDT {
	
	WebDriver driver;
	@Test(dataProvider= "wordpressData")//this test case depending on wordpress data
	
	public void LoginWordPress(String email, String username,String password) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://wordpress.com/start/user");
		
driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
driver.findElement(By.id("password")).sendKeys(password);
driver.findElement(By.xpath("//*[@id='primary']/div/div[2]/div/div/div/div[1]/div/div[1]/form/div[2]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='wpcom']/div/div[2]/div[1]")).click();
	Alert alert=driver.switchTo().alert();
	driver.switchTo().alert();
	alert.dismiss();
	//System.out.println(alert.getText());

	
	
	Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User is not able to login- invalid credentials");
	System.out.println("Page Title Verified- user is able to login successfully");

	
	}
	
/*@AfterMethod()
public void TearDown(){

driver.quit();
*
*/


@DataProvider(name = "wordpressData")
	public Object[][] passData()
{
	Object[][]data = new Object[3][3];
	
	data [0][0] = "Test123@gmail.com";
	data [0][1] = "demo 1";
	data [0][2]	= "python3456";
	
	data [1][0] = "l.aktar@yahoo.com";// second row first column 
	data [1][1] = "sriti40";// second row
	data [1][2] = "Aktar1234";
	 
	 
	data [2][0] = 	"testAutomation23@live.com";
	data [2][1] = 	"kelly633";
	data [2][2]	=	"time3478";
	
	
	 return data;
	
}
                  }
