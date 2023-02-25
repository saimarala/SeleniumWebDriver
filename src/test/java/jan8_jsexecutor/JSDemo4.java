package jan8_jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo4 {

	/*
	 *  Element is disabled - click
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
		WebElement pass=driver.findElement(By.id("pass"));
		
		// single argument
		//js.executeScript("arguments[0].value='Selenium'",pass);
		
		// multiple arguments
		js.executeScript("arguments[0].value=arguments[1]",pass,"TestNG");
		
		
		
		
	}

}
