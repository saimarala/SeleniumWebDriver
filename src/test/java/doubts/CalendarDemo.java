package doubts;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarDemo {

	public static void main(String[] args) {
		
			
		
	        WebDriverManager.chromedriver().setup();
	        
	        WebDriver driver = new ChromeDriver();

	        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

	      
	        System.out.println("****4th method: Get all Dates in a List> Run a Loop until you get a future & specific month & date*****");

	        driver.findElement(By.id("datepicker")).click();

	        String month = driver.findElement(By.xpath("//span[@class =\"ui-datepicker-month\"]")).getText();
	       
	        // one line for checking 
	        while(!month.equalsIgnoreCase("June"))
	        {
	        	driver.findElement(By.xpath("//span[text()='Next']")).click();
	        }
	        
	       
	        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
	        
	        


	}

}
