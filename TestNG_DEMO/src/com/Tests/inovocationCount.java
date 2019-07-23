package com.Tests;

import org.testng.annotations.Test;

public class inovocationCount {

	
	@Test(invocationCount=10) // how many time do i want the same test cases to run like 10 times , 20 times 
	public void sum(){
	int a = 10;
	int b = 20;
	int c = a+b;
	
	System.out.println("sum is==="+ c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
