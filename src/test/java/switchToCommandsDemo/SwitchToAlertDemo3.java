package switchToCommandsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlertDemo3 {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/practise");
	
		driver.findElement(By.xpath("//button[normalize-space()='Click to see after 5s']")).click();
		
		/*
		 * 	Write a logic to wait until alert is present max time 10 sec if alert
		 *  is present in 5 second then break the loop switchToAlert > capture text > print > accept
		 * 
		 */
		
		Alert alt=driver.switchTo().alert();
		
		String text=alt.getText();
			
		System.out.println(text);
		
		// accept the alert
		alt.accept();
		
		
		// to discuss the alert/cancel the alert
		alt.dismiss();
		
		
		// to enter text in Alert
		alt.sendKeys("");

	}

}
