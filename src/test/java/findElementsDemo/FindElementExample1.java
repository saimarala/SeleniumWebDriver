package findElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	/*
	 * 		1- Whenver you need to deal with >1
	 * 	    	Autosuggestion
	 * 			Dropdown without Select
	 * 			Calendar
	 * 
	 * 		2- Optional Checks
	 * 
	 * 
	 * 		3- with TagName
	 * 			
	 * 
	 * 
	 */


public class FindElementExample1 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		Select month=new Select(driver.findElement(By.id("month")));
		
		List<WebElement> allDDOptions= month.getOptions();
		
		for(WebElement ele : allDDOptions)
		{
			String values=ele.getText();
			
			System.out.println("Values are "+values);
			
			if(values.contains("Aug"))
			{
				System.out.println("Found");
				break;
			}
			
		}
		
		driver.quit();
		

	}

}
