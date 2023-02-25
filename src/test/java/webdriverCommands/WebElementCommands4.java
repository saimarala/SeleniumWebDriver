package webdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands4 {

	/*
	 *  This program will help you to find exception which comes
	 *  when you deal with disable elements
	 * 
	 */
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
	
		driver.findElement(By.name("lname")).sendKeys("mukesh")
;		
	}

}
