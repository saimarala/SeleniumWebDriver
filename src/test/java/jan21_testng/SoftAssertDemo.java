package jan21_testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	@Test
	public void test1()
	{
		Reporter.log("Test1 Started", true);
		
		Assert.assertTrue(false);
	
		Reporter.log("Test1 End", true);
	}

	@Test
	public void test2()
	{
		Reporter.log("Test2 Started", true);
		
		SoftAssert softAssert=new SoftAssert();
		
		Assert.assertTrue(false);
		
		Reporter.log("Test2 End", true);
		
		softAssert.assertAll();
		
	}
	
	
	
}
