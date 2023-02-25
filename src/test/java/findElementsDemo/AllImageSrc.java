package findElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class AllImageSrc {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.foundit.in/");
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//img[@src]"));
		
		
		for(WebElement ele:allLinks)
		{
			//System.out.println("Link text is "+ele.getText());
			//System.out.println("InnerHTML is "+ele.getAttribute("innerHTML"));
			//System.out.println("OutHTML is "+ele.getAttribute("outerHTML"));
			System.out.println("Src value is "+ele.getAttribute("src"));
		}
		
		driver.quit();
		
		
		}
		
	}


