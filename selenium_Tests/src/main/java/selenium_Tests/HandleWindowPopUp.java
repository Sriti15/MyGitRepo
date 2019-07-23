package selenium_Tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Thread.sleep(2000);
		
	Set<String> handler = driver.getWindowHandles();
	
	Iterator<String> it = handler.iterator();
//iterator , need to use "for loop"
	String parentwindowId = it.next();//it will give me first value
	System.out.println("parent window id:"+ parentwindowId);
	
	String childwindowID = it.next();
	System.out.println(" child window id:" + childwindowID);
	
	driver.switchTo().window(childwindowID);
	Thread.sleep(2000);
	
	System.out.println("child window pop up title"+driver.getTitle());
	
	driver.close();
	
	driver.switchTo().window(parentwindowId);
	Thread.sleep(2000);
	
System.out.println("parent window pop up title"+driver.getTitle());



driver.close();
	
	
	}

}

// to handle window pop up , i use driver.switch().window():method.
//the steps are first i use iterator as string not numbers then get the window id for both the parent and child.
// after that i use driver.switch().window( for the child window), 
//then close current window using driver.close();
//after that i use driver.switch().window( for the parent window), then close window.

// for example of this script output:

// : parent window id:CDwindow-5DE2284141A457D7135B634E7FF80E61
/*child window id:CDwindow-5C49C25E146D747E53340CFEBE988954
child window pop up titlePopupTest Sunday July, 14 2019
parent window pop up titlePopupTest - test your pop up killer software*/
