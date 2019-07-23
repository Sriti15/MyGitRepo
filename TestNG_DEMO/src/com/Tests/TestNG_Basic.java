package com.Tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basic {
/* the sequence of this test
set system property for chrome
launch chrome browser
login method
enter url
Google Title Test
logout from App
close browser
deleteallcookies*/	

	
	
	
	
	
//Pre-Conditions annotations --starting with @Before
		
@BeforeSuite
public void setup(){
	 System.out.println("@BeforeSuite -- set system property for chrome");

}
	
	
@BeforeTest
 public void launchbrowser(){

 System.out.println("@BeforeTest -- launch chrome browser");
}
 
 @BeforeClass
 public void login(){
	 System.out.println(" @BeforeClass -- login method");
}

@BeforeMethod
	public void enterurl(){
	
	 System.out.println("@BeforeMethod -- enter url");

}

// Test cases -- starting  with @Test
@Test
	public void googleTitleTest(){
	 System.out.println("@Test -- Google Title Test");
}
@Test
		public void searchTest(){
		 System.out.println("@Test -- search test");
}


@Test
		public void googlTitleTest(){
		 System.out.println(" @Test -- Google Title Test");
}
// Post-Conditions -- starting with @AfterClass
@AfterMethod 
public void logout(){
System.out.println("@AfterMethod -- logout from App");

}

@AfterTest
public void DeleteAllCookies(){
	System.out.println(" @AfterTest -- deleteallcookies");

}

@AfterClass

public void closeBrowser(){
	System.out.println("@AfterClass -- close browser");
}

@AfterSuite
public void generateTestReport(){
System.out.println(" @AfterSuite --Generate Test Report");

}

}