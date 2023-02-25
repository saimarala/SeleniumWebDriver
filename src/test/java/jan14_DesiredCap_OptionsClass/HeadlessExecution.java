package jan14_DesiredCap_OptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessExecution {

	public static void main(String[] args) {
		
		/*
		 *  Selenium 3.6 
		 *  	DesiredCapality - 
		 *  			Headless Mode / Background/ Non GUI Mode
		 *  			Incognito
		 *  			Change directory
		 *  			Proxy
		 *  			SSL
		 *  			Browser extension
		 *  				Arguments
		 *  
		 *  Selenium 3.7
		 *  		ChromeOption
		 *  		FirefoxOption,
		 *  		EdgeOptions
		 *  
		 *  Selenium Grid
		 *  			DesiredCapality
		 * 
		 */
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://learn-automation.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("URL is "+driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
