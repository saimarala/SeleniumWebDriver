package calendarControls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalendar {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Option 1- if application supports 
		driver.findElement(By.id("datepicker")).sendKeys("12/01/2022");
		
		driver.findElement(By.id("")).click();
		
		Select sel=new Select(driver.findElement(By.xpath("")));
		
		sel.selectByIndex(0);
		
		// Create instance of Javascript executor

		JavascriptExecutor je = (JavascriptExecutor) driver;

		//Identify the WebElement which will appear after scrolling down

		WebElement element = driver.findElement(By.xpath(""));

		// now execute query which actually will scroll until that element is not appeared on page.

		je.executeScript("arguments[0].scrollIntoView(true);",element);
		

	}

}
