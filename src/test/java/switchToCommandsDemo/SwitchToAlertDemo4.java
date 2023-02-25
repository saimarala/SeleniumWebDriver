package switchToCommandsDemo;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlertDemo4 {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/practise");
		
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//button[normalize-space()='Click to see after 5s']")).click();
		
		for(int i=0;i<10;i++)
		{
			
			try
			{

				Alert alt=driver.switchTo().alert();
				
				String myAlert=alt.getText();
				
				System.out.println("Text is "+myAlert);
				
				if(myAlert.contains("code"))
				{
					System.out.println("Pass");
				}
				else
				{
					System.out.println("Fail - Text does not match");
				}
			
				alt.accept();
				break;
			}
			catch(NoAlertPresentException e)
			{
				System.out.println("Waiting for alert to appear");
				
				Thread.sleep(1000);
				
			}
			
			
			
		}
		
		
		

	}

}
