package jan28_ddtviaexcel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumUpdate {
	
	@Test
	public void test1()
	{
		ChromeOptions opt=new ChromeOptions();
		// this is from 4.8
		opt.addArguments("--headless=new");
		
		// this for 4.7 or below
		opt.addArguments("--headless");
		opt.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(opt);
		
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		
	}

}
