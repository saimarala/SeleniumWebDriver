package jan7_waits_screenshot;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlertUsingWebDriverWait3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
	
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// default polling is 500 ms 
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.ignoring(StaleElementReferenceException.class);
		
		wait.ignoring(WebDriverException.class);
		
		// wait for alert and switch 
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		
		// wait till title contains 
		wait.until(ExpectedConditions.titleContains("Confirmed"));
		
		wait.until(ExpectedConditions.urlContains("trans"));
		
		// present
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		
		// present > visible 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		// present > visible > enable
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("ur xpath")));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("")));
		
		
		
		
	}

}
