package seleniumwebdriver;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstSeleniumTest4 {
	
	public static void main(String[] args) throws MalformedURLException {
		
		/*
		 *  Chrome - ChromeDriver- Google - 107,107 108,108
		 *  Firefox- GeckoDriver - Mozila - 106,106 107,107
		 *  
		 *  Chrome - webdriver.chrome.driver
		 *  Firefox -webdriver.gecko.driver
		 *  Edge  - webdriver.edge.driver
		 */
		
		// Below steps are only required if using 4.5.0 or below
		
		//Option 1 - Manually maintain drivers
		//System.setProperty("webdriver.chrome.driver", "/Users/mukeshotwani/Downloads/chromedriver107");
		
		// Option 2- Use WDM - WebDriverManager
		// Checks browser version, check do we have driver, download ,cache,build path 
		WebDriverManager.chromedriver().setup();
		
		
		//WebDriverManager.firefoxdriver().setup();
		
		//WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.quit();
		
		new WebDriverWait(driver, Duration.ofSeconds(60))
		.until(ExpectedConditions.urlContains("naga"));
		
	
		
	}

}
