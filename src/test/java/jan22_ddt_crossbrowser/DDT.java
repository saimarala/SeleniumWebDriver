package jan22_ddt_crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.Utility;

public class DDT {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		Reporter.log("Setting up browser", true);
		
		driver=Utility.startBrowser("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Reporter.log("Application is up and running", true);

	}
	
	@AfterMethod
	public void closeSession()
	{
		Reporter.log("Terminating session", true);
		driver.quit();
		Reporter.log("Session Terminated", true);
	}
	
	
	
	@Test(dataProvider = "loginData")
	public void test1(String uname,String pass)
	{	
		driver.findElement(By.name("username")).sendKeys(uname);
		
		driver.findElement(By.name("password")).sendKeys(pass);
		
		driver.findElement(By.xpath("//button[contains(@class,'login-button')]")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		 
	}
	
	@DataProvider(name = "loginData")
	public Object[][] getData()
	{
		Object [][]arr=new Object[5][2];
		
		arr[0][0]="admin11";
		arr[0][1]="admin1231";
		
		arr[1][0]="selenium";
		arr[1][1]="java";
		
		arr[2][0]="testng";
		arr[2][1]="maven";
		
		arr[3][0]="jenkins";
		arr[3][1]="github";
		
		arr[4][0]="admin";
		arr[4][1]="admin123";
		
		return arr;
	}
	
	

}
