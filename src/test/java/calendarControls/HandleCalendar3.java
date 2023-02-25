package calendarControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		// Option 3- with click and get all dates in List > Run a loop and select a value from it
		driver.findElement(By.id("datepicker")).click();
		
		List<WebElement> allElements=driver.findElements(By.xpath("//table[contains(@class,'calendar')]//a"));
		

		for(WebElement ele:allElements)
		{
			String dateText=ele.getText();
			
			System.out.println("Dates are "+dateText);
			
				if(dateText.contains("29"))
				{
					System.out.println("Found");
					ele.click();
					break;
				}
			
		}
			
		System.out.println(driver.findElement(By.id("datepicker")).getAttribute("value"));
		

	}

}
