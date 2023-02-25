package doubts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoIssue {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Sync issues
	/*	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		int logo=driver.findElements(By.xpath("//img[contains(@src,'ohrm_logo')]")).size();
		
		if(logo>0)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
		*/
		
		List<WebElement> alllink=driver.findElements(By.xpath("//a[@href]"));
		for(WebElement ele:alllink)
		{
			System.out.println("Href values are"+ele.getAttribute("href"));
			System.out.println("Href values are"+ele.getText());

		}
	}

}
