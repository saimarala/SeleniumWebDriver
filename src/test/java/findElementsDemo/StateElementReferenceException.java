package findElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StateElementReferenceException {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		WebElement element= driver.findElement(By.name("username"));
		
		element.sendKeys("Subhash");
		
		driver.navigate().refresh();
	
		element.sendKeys("Mukesh");
	

	}

}
