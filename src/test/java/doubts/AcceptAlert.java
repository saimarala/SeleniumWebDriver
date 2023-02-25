package doubts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcceptAlert {

	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://ineuron-courses.vercel.app/practise");
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        WebElement ele = driver.findElement(By.xpath("//button[normalize-space()='Click to show']"));
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click()", ele);
	        
	        
	        Alert alt = driver.switchTo().alert();
	        
	        String text = alt.getText();
	        
	        System.out.println(text);
	        
	        alt.accept();

	}

}
