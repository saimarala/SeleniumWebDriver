package seleniumTimeouts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPageImplicitWait {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		// always use before get method then only it take affects.
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//always use before get method
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[normalize-space()='Click me to start timer']")).click();
		
		WebElement ele=driver.findElement(By.xpath("//p[text()='WebDriver']"));
		
		System.out.println(ele.isDisplayed());
		
		driver.quit();
		
		

	}

}
