package jan7_waits_screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class CaptureScreenshotInSelenium3 {

	public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		Utility.captureScreenshot(driver);
		
		driver.quit();
		
	}

}
