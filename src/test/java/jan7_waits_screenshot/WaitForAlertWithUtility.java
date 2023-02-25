package jan7_waits_screenshot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class WaitForAlertWithUtility {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
	
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Alert alt=Utility.waitForAlert(driver);
		
		String str=alt.getText();
		
		System.out.println("Text is "+str);
		
		alt.accept();
		
		driver.quit();
		
	}

}
