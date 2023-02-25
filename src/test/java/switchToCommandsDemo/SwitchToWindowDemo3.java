package switchToCommandsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToWindowDemo3 {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
	
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
	
		driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
		
		new Actions(driver).clickAndHold(driver.findElement(By.xpath("")))
		.pause(2000)
		.moveToElement(driver.findElement(By.xpath("")))
		.pause(2000)
		.release()
		.build()
		.perform();
		

	}

}
