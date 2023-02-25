package jan15_seleniumgrid;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumWithTestNG {
	WebDriver driver;

	@Test(priority = 1)
	public void startBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/");
	}

	@Test(priority = 2)
	public void verifyURL() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("ineuron-courses"), "URL did not match");
	}

	@Test(priority = 3)
	public void verifyTitle() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Courses"), "Title mistmatched");
		//
		//
		//
	
	}

	// 3 test method

	// verify footer count is 4

	// Verify user is able to login write assert for welcome

	// Verify user is able to logout write assert for the same

	@Test(priority = 4)
	public void closeBrowser() 
	{
		driver.quit();
	}

}
