package webdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands3 {

	/*
	 *  
	 * 
	 */
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
	
		WebElement username=driver.findElement(By.id("email1"));
		
		System.out.println("Display Status "+username.isDisplayed());
		
		System.out.println("Enable Status "+username.isEnabled());
		
		System.out.println("PlaceHolder Values "+username.getAttribute("placeholder"));
		
		System.out.println("CSS Value "+username.getCssValue("font-size"));
		
		username.sendKeys("ineuron@ineuron.ai");
		
		System.out.println("Value fetched from username "+username.getAttribute("value"));
		
	}

}
