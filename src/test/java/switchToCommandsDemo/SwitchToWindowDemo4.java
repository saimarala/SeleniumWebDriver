package switchToCommandsDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo4 {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		String parent_handle=driver.getWindowHandle();
	
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
	
		Set<String> allWindowHandle=driver.getWindowHandles();
		
		Iterator<String> itr= allWindowHandle.iterator();
		
		while(itr.hasNext())
		{
			String child=itr.next();
			
				if(!parent_handle.equals(child))
				{
					driver.switchTo().window(child);
					
					String title=driver.getTitle();
					
					System.out.println("Title of application is "+title);
					
					driver.quit();
					
				}
			
		}
		
		driver.switchTo().window(parent_handle);	
		
		System.out.println("Main application title "+driver.getTitle());
		
		driver.quit();

	}

}
