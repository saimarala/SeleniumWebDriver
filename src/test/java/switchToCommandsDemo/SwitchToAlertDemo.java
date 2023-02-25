package switchToCommandsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlertDemo {

	/*
	 * 	 Alert -Info
	 * 		alert("I know JS now ")
		
	 * 	 Confirm
	 * 			confirm - accept, dismiss	
	 * 	
	 * 	 prompt
	 * 			- enter names/details		
	 */

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/practise");
	
		driver.findElement(By.xpath("//button[normalize-space()='Click to show']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		String text=alt.getText();
			
		System.out.println(text);
		
		driver.findElement(By.xpath("//button[text()='Log in ']")).click();
		
		alt.accept();

	}

}
