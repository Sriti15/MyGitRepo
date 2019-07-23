package mytest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyTest {
	
@Test(retryAnalyzer= Analyzer.RetryAnalyzer.class)

public void Test1()
{

Assert.assertEquals(false , true);

}

@Test

 public void Test2()
 {
 
 Assert.assertEquals(false, true);

}



}