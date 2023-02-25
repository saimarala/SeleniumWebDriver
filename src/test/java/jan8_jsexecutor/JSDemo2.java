package jan8_jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo2 {

	/*
	 *  Element is disabled - click
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// type using JavaScript - disabled 
		js.executeScript("document.getElementById('login-username').value='selenium@gmail.com'");
		
		// click with JS - force click
		js.executeScript("document.getElementById('persistent').click()");
		
		
	}

}
