package jan15_seleniumgrid;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MyFirstTestNG {
	
	@Test(description = "My First Test")
	public void test1() 
	{
		System.out.println("Test 1 Executed");
	}
	
	@Test(description = "My Second Test")
	public void test2()
	{
		System.out.println("Test 2 Executed");
	}
	
	@Test(description = "My Third Test")
	public void test3()
	{
		System.out.println("Test 3 Executed");
	}

}
