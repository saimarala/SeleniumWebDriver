package doubts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DevbatraCode {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("Mukesh otwani");
		
		Thread.sleep(2000);
		
		List<WebElement> autoDD = driver.findElements(By.xpath("(//div[@role='presentation'])[2]"));
		
		//System.out.println(autoDD.size());
		Thread.sleep(2000);
		for(WebElement ele:autoDD) 
		{
			String txt = ele.getText();
			System.out.println(txt);
			if(txt.contains("youtube")) {
				ele.click();
				break;
			}
		}
		driver.close();

	}

}
