package webdriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands2 {

	/*
	 * 	 Diff Between navigate().to() vs get()
	 * 
	 */
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.get("http://www.twitter.com");
		
		
	}

}
