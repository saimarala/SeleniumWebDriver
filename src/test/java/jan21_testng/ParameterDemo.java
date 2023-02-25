package jan21_testng;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class ParameterDemo 
{
	
	@Parameters("Browser")
	@Test
	public void test1(@Optional("Chrome") String browser) 
	{
		System.out.println("Thread id is "+Thread.currentThread().getId());
		
		Reporter.log("Browsername is "+browser, true);
	}
	
	

}
