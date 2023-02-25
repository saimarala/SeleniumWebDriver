package elementsInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserCreation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Vikram");
		
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Sarabhai");
		
		//WebElement monthDropdown=driver.findElement(By.cssSelector("select[title='Month']"));
	
		Select month=new Select(driver.findElement(By.cssSelector("select[title='Month']")));
		
		//Select 4 value
		month.selectByIndex(3);
		
		System.out.println(month.getFirstSelectedOption().getText());
		
		Thread.sleep(2000);
		
		// Select Oct
		month.selectByValue("10");
		
		System.out.println(month.getFirstSelectedOption().getText());
		
		Thread.sleep(2000);
		
		// Select Aug
		month.selectByVisibleText("Aug");
		

		System.out.println(month.getFirstSelectedOption().getText());

	}

}
