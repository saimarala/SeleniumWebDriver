package jan15_seleniumgrid;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {

	@Test
	public void test1()
	{
		// actual - from application
		// expected- from test
		Assert.assertEquals(12, 12,"Count mismatch");
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(13, 13.0,"Count mismatch");
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("Selenium is for web automation","Selenium is for web automation");
	}
	
	@Test
	public void test4()
	{
		String msg="Customer id is 125897";
		
		Assert.assertEquals(msg.contains("Customer"), true);
			
	}
	
	@Test
	public void test5()
	{
		String msg="Customer id is 125897";
		
		Assert.assertTrue(msg.contains("Customer"));
		
	}
	
}
