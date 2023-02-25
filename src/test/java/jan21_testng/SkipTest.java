package jan21_testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipTest 
{

	/*
	 * 	Dependency
	 * 
	 */
	
	@Test
	public void login()
	{
		Assert.assertTrue(false);
		Reporter.log("Login to application", true);
	}
	
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		Reporter.log("Logout from application", true);
	}
	

}
