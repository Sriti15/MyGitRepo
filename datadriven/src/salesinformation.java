
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



@Test
public class salesinformation {
	public void salesinfor() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ProSmart\\Desktop\\chromedriver.exe");

		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.quit();
		ArrayList<String> userid = myinformation(0);
		ArrayList<String> password = myinformation(1);
		for (int i =0;i<userid.size(); i++){
			driver.findElement(By.id("username")).sendKeys("mannn");
			driver.findElement(By.id("password")).sendKeys("12345");
			driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			
		}
		
		
		
	}
	
	public ArrayList<String> myinformation(int columnvalue) throws IOException{
		FileInputStream myfile = new FileInputStream("C:\\Users\\ProSmart\\Desktop\\salesdata.xls");
		HSSFWorkbook book = new HSSFWorkbook(myfile);
		
		HSSFSheet mySheet = book.getSheetAt(0);
		
		Iterator<Row> row1 = mySheet.iterator();
		row1.next();
		
		ArrayList<String> listitem = new ArrayList<String>();
		
		while (row1.hasNext()){
			
			listitem.add(row1.next().getCell(columnvalue).getStringCellValue());
			
		}

		System.out.println("my user id and password d is " +listitem);//    
		
		return listitem;
	
	}
	
	
}
