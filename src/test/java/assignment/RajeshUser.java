package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RajeshUser {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'admin')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);

		// To capture  the disappearing options
		//setTimeout(()=>{debugger;},5000); in the console tab

		//---> Clicking on the user role 

		WebElement userRole = driver.findElement(By.xpath("//label[text()='User Role']//parent::div//following-sibling::div//i"));

		userRole.click();
		
		WebElement selectEnabledFromDropDown =driver.findElement(By.xpath("//div[@role='listbox']//div//span[text()='Admin']"));
		selectEnabledFromDropDown.click();

		Thread.sleep(2000);


		//-----> Adding user -->Peter Mac Anderson

		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Peter Mac Anderson");
		Thread.sleep(2000);
		List<WebElement> namesWithR = driver.findElements(By.xpath("//div[@role='option']"));

		for(WebElement e : namesWithR) {			
			Thread.sleep(3000);
			if(e.getText().contains("Peter Mac Anderson")){
				e.click();
				break;
			}
		}
		
		WebElement selectStatus =driver.findElement(By.xpath("//label[text()='Status']//parent::div//following-sibling::div//i"));
		selectStatus.click();
		Thread.sleep(2000);
		WebElement statusOfEmployee = driver.findElement(By.xpath("//div[@role='listbox']//Span[text()='Enabled']"));
		statusOfEmployee.click();

		Thread.sleep(2000);

		//----------> Entering username

		WebElement enterUserName = driver.findElement(By.xpath("//label[text()='Username']//parent::div//following-sibling::div//input"));
		enterUserName.sendKeys("RajeshMishra123");

		//--------> Enter Password

		WebElement enterPassword = driver.findElement(By.xpath("//label[text()='Password']//parent::div//following-sibling::div//input"));
		enterPassword.sendKeys("P@ssw0rd123456");
		
		WebElement enterConfirmPassword = driver.findElement(By.xpath("//label[text()='Confirm Password']//parent::div//following-sibling::div//input"));
		enterConfirmPassword.sendKeys("P@ssw0rd123456");
		
		Thread.sleep(5000);
		
		WebElement saveButton= driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView(true);", saveButton);
		 */
		saveButton.click();
		System.out.println("Clicked on save");

	}

}
