package switchToCommandsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		String parentHandle=driver.getWindowHandle();
	
		System.out.println(parentHandle);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		
		Set<String> allHandles=driver.getWindowHandles();
		
		System.out.println("All Handles including parent handle "+allHandles);
		
		List<String> allHandlesInList=new ArrayList<String>(allHandles);
		
		System.out.println("Parent handle is "+allHandlesInList.get(0));
		
		System.out.println("Child handle is "+allHandlesInList.get(1));
		
		driver.switchTo().window(allHandlesInList.get(1));
		
		System.out.println("Title of new tab "+driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.switchTo().window(allHandlesInList.get(0));
		
		Thread.sleep(5000);
		
		driver.switchTo().window(allHandlesInList.get(1));
	
		Thread.sleep(5000);
		
		driver.switchTo().window(allHandlesInList.get(0));
		
		Thread.sleep(5000);
		
		
		
		
	}

}
