import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_Asif_FB 
{
	public WebDriver runner;
	
	@BeforeMethod //Will run before EACH test method
	public void StartBrowser(){
		
	
	}
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\chromedriver.");
		
		runner = new ChromeDriver();
	}
	
	@Test (priority = 1)
	public void signup1 () throws InterruptedException
	{
		runner.get("https://www.facebook.com/");
		
		runner.findElement(By.id("u_0_c")).sendKeys("Captain");
		runner.findElement(By.id("u_0_e")).sendKeys("America");
		runner.findElement(By.id("u_0_h")).sendKeys("avenger@cap.com");	
		runner.findElement(By.id("u_0_k")).sendKeys("avenger@cap.com");	
		runner.findElement(By.id("u_0_o")).sendKeys("avenger@cap.com");	
		
		Select dropdown = new Select(runner.findElement(By.id("month")));
		dropdown.selectByIndex(1);
		
		Select dropdown1 = new Select(runner.findElement(By.id("day")));
		dropdown1.selectByIndex(1);
		
		Select dropdown2 = new Select(runner.findElement(By.id("year")));
		dropdown2.selectByVisibleText("2000");
		
		runner.findElement(By.id("u_0_a")).click();
		
		runner.findElement(By.id("u_0_u")).click();
		
		Thread.sleep(5000);
	}
	
	@Test (priority = 2)
	public void signup2() throws InterruptedException
	{
		runner.get("https://www.facebook.com/");
		
		runner.findElement(By.id("u_0_c")).sendKeys("Black");
		runner.findElement(By.id("u_0_e")).sendKeys("Panther");
		runner.findElement(By.id("u_0_h")).sendKeys("Wakanda@forever.com");	
		runner.findElement(By.id("u_0_k")).sendKeys("Wakanda@forever.com");	
		runner.findElement(By.id("u_0_o")).sendKeys("Ineverfreeze");	
		
		Select dropdown = new Select(runner.findElement(By.id("month")));
		dropdown.selectByIndex(12);
		
		Select dropdown1 = new Select(runner.findElement(By.id("day")));
		dropdown1.selectByIndex(12);
		
		Select dropdown2 = new Select(runner.findElement(By.id("year")));
		dropdown2.selectByVisibleText("2012");
		
		runner.findElement(By.id("u_0_a")).click();
		
		runner.findElement(By.id("u_0_u")).click();
		
		Thread.sleep(9000);
	}

	@AfterMethod //Executes this action after EACH test method
	public void CloseBrowser()
	{
		runner.close();
	}
}












