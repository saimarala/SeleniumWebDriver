package jan7_waits_screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import helper.Utility;

public class CaptureScreenshotInSelenium4 {

	public static void main(String[] args) throws IOException {
			
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		File src=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("./Element.png"));
		
		Utility.captureScreenshot(driver);
		
		Utility.waitForSeconds(2);
		
		Utility.captureScreenshot(driver);
		
		Utility.waitForSeconds(2);
		
		Utility.captureScreenshot(driver);
		
		Utility.waitForSeconds(5);
		
		Utility.captureScreenshot(driver);
		
		driver.quit();
		
	}

}
