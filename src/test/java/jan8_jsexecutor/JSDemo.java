package jan8_jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		//driver.findElement(By.xpath("//input[@id='persistent']")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]")).click();
		
		/*
		 *  Click 
		 *  	click - Actions
		 *      click - JavaScript
		 *      click - WebElement 
		 * 	
		 * 
		 */
		
	}

}
