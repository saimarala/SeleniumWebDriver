package calendarControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		// Option 3- with click and get all dates in List > Run a loop and select a value from it
		driver.findElement(By.id("datepicker")).click();
		
		/*
		 * 	Write a logic to select date 28 from Aug 2023
		 * 
		 */
		
		String month=driver.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
		
		String year=driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText();
		
		System.out.println(month);
		System.out.println(year);

	}

}
