package findElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class GetElementCount {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> allInputTag=driver.findElements(By.xpath("//input[@type='text']"));
		
		// this will return number of input tag with text

		System.out.println(allInputTag.size());
		
		int totalDD=driver.findElements(By.tagName("select")).size();
		
		int totalDDWithXPath=driver.findElements(By.xpath("//select")).size();
		
		int totalCheckBoxes=driver.findElements(By.xpath("//input[@type='radio']")).size();
	
		int totalPasswordFields=driver.findElements(By.xpath("//input[@type='password']")).size();
		
		System.out.println(totalDD);
		System.out.println(totalDDWithXPath);
		System.out.println(totalCheckBoxes);
		System.out.println(totalPasswordFields);
		

		for(WebElement ele:allInputTag)
		{
			String name=ele.getAttribute("name");
			
			System.out.println(name);
		}
		
		

	}

}
