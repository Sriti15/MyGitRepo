package com.Tests;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	//@Test(invocationTimeOut=2000, expected exception(number formated exception.Class)// should take 2 seconds
	
	//public void infintLoopTest(){
	//int i =1;
	//while (i ==1){
	//	System.out.println(i);	
//}
	
//}
@Test(expectedExceptions=NumberFormatException.class)
// i am telling 3r party TestNG that i am expecting number formated 
//that is why i use "expectedExceptions=NumberFormatException.class" keyword.
public void Test1(){
	String x =" 100A";
	Integer.parseInt(x);
	
}

}