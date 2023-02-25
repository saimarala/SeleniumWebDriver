package calendarControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		// Option 2- with click and click
		driver.findElement(By.id("datepicker")).click();
		
		//click on next month
		driver.findElement(By.xpath("//span[text()='Next']")).click();		
		
		// select a date from next month
		driver.findElement(By.xpath("//a[text()='28']")).click();
		
		

	}

}
