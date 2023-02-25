package jan14_DesiredCap_OptionsClass;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxyInSelenium {

	public static void main(String[] args) {
	
		
		ChromeOptions opt=new ChromeOptions();
		
		Proxy proxy=new Proxy();
		
		//proxy.setHttpProxy("host:port");
		
		proxy.setHttpProxy("123.45.78.78:7878");
		
		opt.setProxy(proxy);
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.google.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("URL is "+driver.getCurrentUrl());
		
		//driver.quit();
		
	}

}
