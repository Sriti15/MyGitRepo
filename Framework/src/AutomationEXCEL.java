
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row; /// make sure POI is download it every time I create a new project
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
//make sure Selenium standalone jar file is download it every time I create a new project
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class AutomationEXCEL {


	public void automationSignUp() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ArrayList<String>Username = datainput(0);
		ArrayList<String>Password = datainput(1);
		
		
		for (int i = 0; i <Username.size(); i++){
			driver.findElement(By.id("email")).sendKeys(Username.get(i));
			driver.findElement(By.id("passwd")).sendKeys(Password.get(i));
			driver.findElement(By.id("SubmitLogin")).click();
			Thread.sleep(4001);
			
			driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
		 }
		}
		
				
		
		
	
public ArrayList<String>datainput(int colNo) throws IOException{
	FileInputStream exofile = new FileInputStream("C:\\Users\\PSQA\\Documents\\Automationdata.xlsx");
	XSSFWorkbook wbof = new XSSFWorkbook(exofile);
	XSSFSheet wsof =  wbof.getSheet("Sheet1");
	
			Iterator<Row> rowit = wsof.iterator(); //
			
			rowit.next();
			ArrayList<String>list = new ArrayList<String>();
			while (rowit.hasNext()) {
				list.add(rowit.next().getCell(colNo).getStringCellValue());
				
			}
			System.out.println("List:   "+ list);
			return list;
			
			
			

}
	
}
