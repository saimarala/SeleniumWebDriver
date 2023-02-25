package jan15_seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumWIthBrowserStack2 {

	public static void main(String[] args) throws MalformedURLException 
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("os", "Windows");
		cap.setCapability("osVersion", "8");
		cap.setCapability("browserName", "Firefox");
		cap.setCapability("browserVersion", "107");
		
		URL seleniumGrid=new URL("http://mukeshotwani_p5NVfe:5ZAx21YD45weRsZSecRy@hub.browserstack.com/wd/hub");
		
		WebDriver driver=new RemoteWebDriver(seleniumGrid, cap);
		
		driver.get("https://learn-automation.com/");
		
		System.out.println("Title is "+driver.getTitle());
		
		driver.quit();
		
		

	}

}
