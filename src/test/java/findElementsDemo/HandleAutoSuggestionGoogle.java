package findElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestionGoogle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");

		Thread.sleep(2000);

		List<WebElement> allValues = driver.findElements(By.xpath("//div[@role='option']"));

		System.out.println("Total count is " + allValues.size());

		for (WebElement ele : allValues) {
			String text = ele.getText();

			if (text.contains("cypress")) {
				ele.click();
				//break;
			}

		}

		driver.quit();

	}

}
