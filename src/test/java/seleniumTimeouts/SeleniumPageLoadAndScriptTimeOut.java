package seleniumTimeouts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPageLoadAndScriptTimeOut {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		// always use before get method then only it take affects.
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//always use before get method
		//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		
		driver.get("https://google.com");
		
		// 300 seconds / 5 min
		System.out.println(driver.manage().timeouts().getPageLoadTimeout().getSeconds());
		
		// 0 seconds
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout().getSeconds());
		
		// 30 seconds
		System.out.println(driver.manage().timeouts().getScriptTimeout().getSeconds());
		
		
		
		

	}

}
