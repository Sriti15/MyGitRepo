import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


	public class Mortgage {

		@Test(priority = 1)
		
		private void openbrowser() throws InterruptedException, IOException {
			 System. setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\chromedriver.exe");

	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.mortgagecalculator.org/");
	
	driver.findElement(By.xpath("//[@id='homeva']")).sendKeys("850000");
	driver.findElement(By.xpath("//[@id='downpayment']")).sendKeys("20");
	driver.findElement(By.xpath("//[@name='param[downpayment_type]']")).click();
	driver.findElement(By.xpath("[@id='intrstsrate']")).sendKeys("3.2");
	driver.findElement(By.xpath("//[@id='loanterm']")).sendKeys("35");
	
	Select month = new Select(driver.findElement(By.xpath("[@name='param[start_month]']")));
	month.selectByIndex(10);
	
	driver.findElement(By.xpath("[@name='param[start_year]'")).sendKeys("2020");;
	driver.findElement(By.xpath("//[@id='pptytax']")).sendKeys("2200");
	driver.findElement(By.xpath("//[@id='pmi']")).sendKeys("0.2");
	driver.findElement(By.xpath("[//[id='hoi']")).sendKeys("1200");
	driver.findElement(By.xpath("[//[@name='param[hoa]']")).sendKeys("800");
	Select loan = new Select(driver.findElement(By.xpath("//[@name='param[refiorbuy]']")));
	loan.selectByValue("2");
	Select military_service = new Select(driver.findElement(By.xpath("//[@name='param[milserve]']")));
	military_service.selectByIndex(1);
	
	driver.findElement(By.xpath("//[@name='cal']")).click();
			Thread.sleep(3000);// telling the system to wait
			
		
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("C:\\Users\\PSQA\\Desktop\\mcal.png"));//png is type of file for pics
	}	
	
		@AfterTest	
		public void closeBrowser(){
			WebDriver driver = new ChromeDriver();
			driver.close();
	}
}
	
