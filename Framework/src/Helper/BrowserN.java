package Helper;
// list of browsers that i want to run
// need system set.property

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserN {

	static WebDriver driver;
	public static WebDriver launchBrowser(String browserName, String url){
		
		if (browserName.equalsIgnoreCase("chrome")) {//equalsIgnoreCase means ignore upper and lower case
			driver = new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
			
		}else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
	
	driver.manage().window().maximize();// maximize the window
	driver.get("url");
	
	return driver;
	}
}
