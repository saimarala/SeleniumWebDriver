package switchToCommandsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo5 {


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
