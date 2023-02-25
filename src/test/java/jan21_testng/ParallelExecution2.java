package jan21_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution2 
{
	@Test
	public void test1()
	{
		System.out.println("ID is "+Thread.currentThread().getId());
		
		System.out.println("Name is "+Thread.currentThread().getName());
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://yahoo.com");
		driver.quit();
	}
	
	@Test
	public void test2()
	{
		System.out.println("ID is "+Thread.currentThread().getId());
		
		System.out.println("Name is "+Thread.currentThread().getName());
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.quit();
	}
	
	@Test
	public void test3()
	{
		System.out.println("ID is "+Thread.currentThread().getId());
		
		System.out.println("Name is "+Thread.currentThread().getName());	
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.quit();
	}

}
