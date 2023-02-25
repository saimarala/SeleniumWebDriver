package elementsInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserCreation2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demo.guru99.com/test/radio.html");
		
		// false
		boolean status1 =driver.findElement(By.xpath("//input[@name='webform' and @value='checkbox1']")).isSelected();
		System.out.println("Status "+status1);
		
		//true
		boolean status2 =driver.findElement(By.xpath("//input[@id='vfb-6-1']")).isSelected();
		System.out.println("Status "+status2);

		
	}

}
