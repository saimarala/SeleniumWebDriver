package webdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands5 {

	/*
	 *  This program will help you to find exception which comes
	 *  when you deal with disable elements
	 * 
	 */
	
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
		
		driver.findElement(By.id("password1")).sendKeys("ineuron");
		
		driver.findElement(By.className("submit-btn")).click();
		
		//driver.quit();
		
	}

}
