package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RajeshUser2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		
		WebElement usrname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		usrname.sendKeys("Admin");
		pwd.sendKeys("admin123");
		login.click();
		
		
		

	}
}
