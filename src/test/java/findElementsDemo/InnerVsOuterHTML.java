package findElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerVsOuterHTML {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		WebElement element= driver.findElement(By.xpath("//button[@type='submit']"));

		System.out.println("Element inner html "+element.getAttribute("innerHTML"));
		
		System.out.println("Element outer html "+element.getAttribute("outerHTML"));
		
		
	

	}

}
