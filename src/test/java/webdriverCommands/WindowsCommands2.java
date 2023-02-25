package webdriverCommands;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsCommands2 {

	/*
	 * 	 Option - manage cookies, timeouts, windows
	 *   Window - Manage window
	 */
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.twitter.com");
		
		//driver.manage().window().minimize();
		
		driver.manage().window().setSize(new Dimension(0, 0));
		
	}

}
