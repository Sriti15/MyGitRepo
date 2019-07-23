package com.ap.ui.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ap.ui.base.TestBase;

public class Testutil extends TestBase {
public static long Page_Load = 10;
public static long Implicit_wait= 10;

public static String XL_SHEET_PATH ="path of the xl sheet";

static Workbook book;// excel file
static Sheet sheet;// sheet from the excel file

static JavascriptExecutor js;// Naming the object, 
public static  Object[][] getTestData(String sheetName){// 
	FileInputStream file = null;
	 try{ // catching errors 
			  file = new FileInputStream(XL_SHEET_PATH);
	 } catch (FileNotFoundException e){
		 e.printStackTrace();
}
 try { 
	  book = WorkbookFactory.create(file);
	  
 }catch (InvalidFormatException e ){
  e.printStackTrace();
 }catch (IOException e){
	 e.printStackTrace();
}
 sheet  = book.getSheet(sheetName);
 Object[][] data = new Object[ sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
  
 
 for  (int i = 0; i< sheet.getLastRowNum(); i++){
	 for (int j = 0; j <sheet.getRow(0).getLastCellNum(); j++){
		 data[i][j]= sheet.getRow(i+1).getCell(j).toString();
			 
	// information i want in my excel sheet.		 
		 }
	 }
 return data;
 }
public static void takeScreenshotAT() throws IOException{// Capturing  everything in console log, 
	File srcFile  = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentDirect =  System.getProperty("user.dir");// create a object, user dir means the machine or the project.
	FileUtils.copyFile(srcFile, new File(currentDirect + "/screenshot/" +
	System.currentTimeMillis()+ ".png"));
	
// basically taking a screenshot, importing the file and naming the object on file 
	// going back to dir creating a folder pasting the file that i receive . along with the when the screenshot was taking.
		
	
}

public static void  runTimeInfo(String messageType, String message) throws Exception{// create a method 
	js = (JavascriptExecutor) driver;
	
	js.executeScript("if )iwindow.JQuery){"
			+ "var jquery = document.createElement('script'); jquery.type = ' text/javascript';"
			+ "jquery.src = 'https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js';"
			+ "document.getElementByTagName('head')[0].appendChild(jquery);" + "}");
	
	Thread.sleep(2000);
	
	js.executeScript("$.getScript('https://the-internet.herokuapp.com/js/vendor/jquery.growl.js')");

	
	js.executeScript("$('head').append('<link rel=\"stylesheet\" "
			+ "href=\"https://the-internet.herokuapp.com/css/jquery.growl.css\" " + "type=\"text/css\" />');");
	Thread.sleep(6000);
	
	js.executeScript("$growl({title: 'GET', message; '/' });");// Retrieving information from API; '$growl' is fetching error 
	
	// Separate the error message 
	if(messageType.equals("error")){
		js.executeScript("$growl.error({ title: 'ERROR' message: '"+ message+"'});");
		
	}else if (messageType.equals("info")){
		js.executeScript("$growl.error({ title: 'Notice', message: 'your notice message will appear here'}, arg1);");
		
	}else if (messageType.equals("warning")){
		js.executeScript("$growl.error({ title: 'Warning', message: 'your warning message will appear here'}, arg1);");

	}
}
// basically for load and waits
 
//check the audio 5/4/19
}