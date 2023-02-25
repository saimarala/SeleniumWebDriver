package switchToCommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateUserForINeuron {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/signup");
		
		Thread.sleep(3000);
		
		boolean statusBefore=driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).isEnabled();
		
		System.out.println("Status before entering values "+statusBefore);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mukesh Otwani");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("MukeshOtwaniselenium5@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mukesh1489");
		
		driver.findElement(By.xpath("//label[normalize-space()='Testing']")).click();
		
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		
		new Select(driver.findElement(By.xpath("//select[@id='state']"))).selectByVisibleText("Goa");
		
		boolean statusAfter=driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).isEnabled();
		
		System.out.println("Status before entering values "+statusAfter);
		
		try 
		{
			driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
			
		} catch (Exception e) {
			
			System.out.println("WebElement Click Failed - Retry with JS Click ");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			WebElement ele=driver.findElement(By.xpath("//button[normalize-space()='Sign up']"));
			
			js.executeScript("arguments[0].click()",ele);
			
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email1")).sendKeys("MukeshOtwaniselenium5@gmail.com");
		
		driver.findElement(By.name("password1")).sendKeys("Mukesh1489");
		
		driver.findElement(By.className("submit-btn")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		
	}

}
