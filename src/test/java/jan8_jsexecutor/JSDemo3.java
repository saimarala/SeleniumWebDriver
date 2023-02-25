package jan8_jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo3 {

	/*
	 *  Element is disabled - click
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
		js.executeScript("document.getElementById('pass').value='Java'");
		
		//driver.findElement(By.id("pass")).sendKeys("Java");
		
		
		
		
	}

}
