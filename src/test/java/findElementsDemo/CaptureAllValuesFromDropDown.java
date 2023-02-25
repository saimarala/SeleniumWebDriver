package findElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class CaptureAllValuesFromDropDown {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		Select month=new Select(driver.findElement(By.id("month")));
		
		List<WebElement> allDDOptions= month.getOptions();
		
		int totalElements=allDDOptions.size();
		
		System.out.println("Total elements in dropdown "+totalElements);
		
		for(int i=0;i<totalElements;i++)
		{
			WebElement element=allDDOptions.get(i);	
			
			String value=element.getText();
			
			System.out.println("Value is "+value);
			
			if(value.contains("Apr"))
			{
				System.out.println("Validation Passed");
				break;
			}
			
		}
		
		driver.quit();
		

	}

}
