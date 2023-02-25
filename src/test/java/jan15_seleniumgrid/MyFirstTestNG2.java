package jan15_seleniumgrid;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MyFirstTestNG2 {
	
	@Test(priority = 1)
	public void login() 
	{
		System.out.println("Login to app");
	}
	
	@Test(priority = 2)
	public void createAccount()
	{
		System.out.println("Account Created");
	}
	
	@Test
	public void makePayment()
	{
		System.out.println("Payment Done");
	}
	
	@Test
	public void logoutFromApp()
	{
		System.out.println("Logout from app");
	}

}
