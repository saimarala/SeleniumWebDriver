package switchToCommandsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo2 {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
	
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		
		Set<String> allHandles=driver.getWindowHandles();
		
		List<String> allHandlesInList=new ArrayList<String>(allHandles);
		
		//driver.switchTo().window("Mukesh");
		driver.switchTo().window(allHandlesInList.get(1));

		
	}

}
