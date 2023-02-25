package seleniumwebdriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyFirstSeleniumTest3 {
	
	public static void main(String[] args) throws MalformedURLException {
		
		ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver1=new ChromeDriver();
		
		driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		SearchContext driver2=new ChromeDriver();
		
		Object driver3=new ChromeDriver();
		
		WebDriver driver4=new RemoteWebDriver(new URL(""),new DesiredCapabilities());
		
	}

}
