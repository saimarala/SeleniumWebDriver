package jan8_jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo5 {

	/*
	 *  Element is disabled - click
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		WebElement username=driver.findElement(By.id("login-username"));
		
		WebElement checkbox=driver.findElement(By.id("persistent"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value=arguments[2]", username,"mukesh@gmail.com","aparjita");
		
		js.executeScript("arguments[0].click()",checkbox);
		
		
		
	}

}
