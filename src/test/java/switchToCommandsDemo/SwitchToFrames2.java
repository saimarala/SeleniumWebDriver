package switchToCommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrames2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/practise");
		
		// switch to frame using name or id
		driver.switchTo().frame("mukesh");
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		// switch back to parent context or main window
		driver.switchTo().defaultContent();
		
		//driver.switchTo().parentFrame();
	
		
	}

}
