package com.ap.ui.ExtentReporter.Listner;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporterN implements IReporter{//new class using built  in Testing interface
	private ExtentReports extent;// constructor using  object extent , we don't want share this result with anyone else
	
public void generateReport(List<XmlSuite> xmlSuites, List<ISuite>suites, 
		String outputDirectory){// creating a method that takes three arguments,
	
	//to generate a report, arguments list requirements, 
		//String outputDirectory in line 35 means SKIP, PASS,FAIL
		//using a mechanism called List, which gets the array input
		//script will go back to xml suites, and look for "suites" which are the classes we created
		//we will create an xml file to contain all the classes within our test cases
		//PASS, FAIL, or SKIP will be string outputs
		//XML Suite: big time testing based on testing type
		//ISuite: pages we are working on; classes created to perform action

	extent = new ExtentReports(outputDirectory + File.separator
			+ "Extent.html", true);
	//line 35 means : creating an object for extent report, creating a virtual object to save all output to save all results
		//as a string, file separator is not needed, it doesn't matter how u received the result
		//separate them and consolidate the results
		//telling you how to save the file name, html is easy to open on any device and lightweight
		//outputDirectory: SKIP, PASS, FAIL
		//the reason for boolean option: if you receive results, generate report//if you don't then don't generate

	
	for(ISuite suite : suites){
		Map<String, ISuiteResult>result = suite.getResults();
		//it obtain the key value it cannot be duplicate , it will map(interface in java) it the location which is
		//the extent report
		//
	
	for(ISuiteResult r : result.values()){ // conditional operator , if is this then the other will execute. 
		ITestContext context =r.getTestContext();
		//continue another loop , what is the context sharing , the value that generate
		buildTestNo(context.getPassedTests(), LogStatus.PASS);
		buildTestNo(context.getFailedTests(), LogStatus.FAIL);
		buildTestNo(context.getSkippedTests(), LogStatus.SKIP);
		//Retrieving status using  result  context
	}
}
extent.flush();//it will take the result add to html code 
extent.close();

}

private void buildTestNo(IResultMap tests, LogStatus status){
	ExtentTest test;// creating a private constructor ,
	
	if(tests.size()>0){// greater then " 0 "
		for (ITestResult result : tests.getAllResults()){
			test = extent.startTest(result.getMethod().getMethodName());// duration of the test,  how long will it take for the test.
		
			
			test.setStartedTime(getTime(result.getStartMillis()));
			test.setEndedTime(getTime(result.getEndMillis()));
			//it combines the result , organize all the pass and fail and skipped. its more efficiently to read 
			
			for(String group : result.getMethod().getGroups())
				test.assignCategory(group);
			
			if(result.getThrowable() !=null){// null is empty string.
				test.log(status, result.getThrowable());
			}else{
				test.log(status, "Test" + status.toString().toLowerCase() + "ed");
				
		}
			extent.endTest(test);
			
	}
}
}
private Date getTime(long millis){
	Calendar calender = Calendar.getInstance();
	calender.setTimeInMillis(millis);
	return calender.getTime();
	// local machine time 
	
}
}

