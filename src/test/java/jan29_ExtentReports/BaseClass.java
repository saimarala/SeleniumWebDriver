package jan29_ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import helper.Utility;

import java.time.Duration;


public class BaseClass {
	
	WebDriver driver;
	
	@BeforeClass
	public void setupApplication()
	{
		driver=Utility.startBrowser("Chrome", "https://opensource-demo.orangehrmlive.com/");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();

	}
	
}
