package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumTest2 {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		String title=driver.getTitle();
		
		System.out.println("Title is "+title);
		
		String url=driver.getCurrentUrl();
		
		System.out.println("URL is "+url);
		
		driver.get("http://www.yahoo.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("URL is "+driver.getCurrentUrl());
		
		driver.get("http://www.facebook.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("URL is "+driver.getCurrentUrl());
		
		driver.get("http://www.twitter.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("URL is "+driver.getCurrentUrl());
		
		// close all associated window
		driver.quit();
		
		// closes active tab or window
		//driver.close();

	}

}
