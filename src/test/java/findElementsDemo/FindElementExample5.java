package findElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class FindElementExample5 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.foundit.in/");
		
	
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		for(WebElement ele:allLinks)
		{
			System.out.println("Link text is "+ele.getText());
			
		}
		
		System.out.println("*******************************************");
	
		for(WebElement ele:allLinks)
		{
			System.out.println("Link text is "+ele.getAttribute("innerHTML"));
			
		}
		
		System.out.println("*******************************************");
		
		
		for(WebElement ele:allLinks)
		{
			System.out.println("Link text is "+ele.getAttribute("outerHTML"));
			
		}
		
		System.out.println("*******************************************");
		
		
		for(WebElement ele:allLinks)
		{
			System.out.println("href value is "+ele.getAttribute("href"));
			
		}
		
		
		
		}
		
	}


