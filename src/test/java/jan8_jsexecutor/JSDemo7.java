package jan8_jsexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class JSDemo7 {
	
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Utility.highlightElement(driver, By.name("username")).sendKeys("Admin");
		
		Utility.highlightElement(driver, By.name("password")).sendKeys("admin123");
		
		Utility.highlightElement(driver, By.xpath("//button[normalize-space()='Login']")).click();
			
	}

}
