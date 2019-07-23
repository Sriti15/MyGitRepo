package selenium_Tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WindowPopTest {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PSQA\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uniqlo.com");
		Thread.sleep(2000);
	
		
				
	
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentwindowId = it.next();
		System.out.println("parent window id:"+parentwindowId );
		
		String childwindowId = it.next();
		System.out.println("child window id:"+childwindowId);
		
		
		
		driver.switchTo().window("childwindowId");
		System.out.println("child window pop up title:"+driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window("parentwindowId");
		System.out.println("parent window pop up title:"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		

		
	}
                         
             





}