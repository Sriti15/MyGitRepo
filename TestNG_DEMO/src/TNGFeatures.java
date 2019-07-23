

import org.testng.annotations.Test;

public class TNGFeatures {

		
		@Test
		public void loginTest() throws InterruptedException{
			System.out.println("login test");
			Thread.sleep(3000);
		}
		
		@Test(dependsOnMethods="login test")// sometime test cases is depend on others test cases, 
		//"dependsOnMethods" should be used when 
		public void HomePage() throws InterruptedException{
			System.out.println("home page");
			Thread.sleep(3000);
			
		}
		
	
		
		}
		
		

	
	
