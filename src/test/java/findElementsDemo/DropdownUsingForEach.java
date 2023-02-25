package findElementsDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class DropdownUsingForEach {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		Select month=new Select(driver.findElement(By.id("month")));
		
		List<WebElement> allDDOptions= month.getOptions();
		
		List<String> ddValues=new ArrayList<String>();
		
		for(WebElement ele:allDDOptions)
		{
			String text=ele.getText();
			
			ddValues.add(text);
		}
		
		System.out.println(ddValues);
	
		driver.quit();
		

	}

}
