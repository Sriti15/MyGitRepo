package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	int counter = 0;  //
	int retrylimit = 3;// how many times I want to execute failure test cases
	
	
	public boolean retry(ITestResult result){ // override from parent class
		if(counter < retrylimit){
			counter++;//increase 
			return true;
		}
		return false;
		}
	}


