package webdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands2 {

	/*
	 *  WebElement - Interface - which represent element on page
	 *  
	 *  findElement vs FindElements
	 *  		
	 *  findElement - find element and throws exception when element not found
	 *  findElements - find elements and return List of WebElement when element not found still you will get
	 *  size 0
	 * 
	 */
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		// Exception with findElement and No Exception with findElements
		 driver.findElements(By.id("email"));
		
		//driver.findElements(By.id("email")).get(0).sendKeys("mukesh");
		
	}

}
