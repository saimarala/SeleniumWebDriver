package jan14_DesiredCap_OptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessExecution2 {

	public static void main(String[] args) {
	
		
		ChromeOptions opt=new ChromeOptions();
		
		//opt.addArguments("--headless");
		
		opt.addArguments("--start-maximized");
		opt.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://learn-automation.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("URL is "+driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
