package doubts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ineuron-courses.vercel.app/signup");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mukesh Otwani");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mukesh1@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass@1234");
		
		driver.findElement(By.xpath("//label[normalize-space()='Testing']")).click();
		
		driver.findElement(By.xpath("//div[@class='genders-div']//div[1]//input[1]")).click();

		new Select(driver.findElement(By.id("state"))).selectByVisibleText("Goa");
		
		
	}

}
