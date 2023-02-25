package switchToCommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickByJavaScript {

	/*
	 * 	Read - https://en.wikipedia.org/wiki/JavaScript_engine
	 * 
	 */
	
	/*
	 * 	Click can work with disable > hidden > covered elements 
	 * 	
	 * 	
	 * 
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.name("btnI")).click();
		
		/*
		 * 		document.getElementsByName("btnI")[1].click()
		 * 
		 */
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementsByName('btnI')[1].click()");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
