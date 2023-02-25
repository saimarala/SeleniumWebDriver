package switchToCommandsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo6 {


	/*
	 * 	  
	 * 	  	First click on all social media link this will open 4 media link + 1 parent
	 * 
	 * 		Write a logic that will switch to window/tab which title contains twitter
	 * 
	 * 
	 */
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		String parent=driver.getWindowHandle();
		
		System.out.println("Title of main page "+driver.getCurrentUrl());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://ineuron-courses.vercel.app/signup");
		
		System.out.println(driver.getWindowHandles());
		
		System.out.println("Title of child page after auto switch "+driver.getCurrentUrl());
		
		driver.close();

		driver.switchTo().window(parent);
		
		System.out.println("Title of main page after  switch back to parent page "+driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
