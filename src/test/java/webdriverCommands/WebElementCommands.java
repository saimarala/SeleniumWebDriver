package webdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	/*
	 * 	 Selenium has direct locators and indirect locators
	 * 		id
	 * 		name
	 * 		className
	 * 		linkText
	 * 		partialLinkText
	 * 		tagName
	 * 		XPath
	 * 		CSSSelectors
	 * 	 
	 *   	Selenium 4 has Relative Locators
	 */
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		WebElement username=driver.findElement(By.id("email1"));
		
		username.sendKeys("ineuron@ineuron.ai");
		
		Thread.sleep(1000);
		
		username.clear();
		
		Thread.sleep(1000);
		
		username.sendKeys("mukesh@gmail.com");
		
		Thread.sleep(1000);
		
		username.clear();
		
		Thread.sleep(1000);
		
		username.sendKeys("mukesh1@gmail.com");
	}

}
