package jan7_waits_screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshotInSelenium {

	public static void main(String[] args) {
		
		/*
		 *  TakesScreenshot
		 *  	getScreenshotAs
		 *  		File > raw (.png) - First
		 *  		Byte - Byte[] - Report
		 * 			Base64 - Encoded String of screenshot (Extent Report)
		 * 
		 */
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		//File screenshotFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("./MyScreenshot.png");
		
		try 
		{
			FileHandler.copy(src, destination);
		} 
		catch (IOException e) 
		{
			System.out.println("Something went wrong "+e.getMessage());
		}
		
		driver.quit();
		
	}

}
