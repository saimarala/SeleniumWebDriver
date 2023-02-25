package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnjaliCalendar {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver= new ChromeDriver();
	    
	    /*
		 * 	Write a logic to select date 28 from Aug 2023
		 * 
		 */
	    driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	    
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker")).click();
		
		 Thread.sleep(2000);
		 
		String MonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		//String month =MonthYear.split(" ")[0].trim();
		//String year =MonthYear.split(" ")[1].trim();
		
	    String Month=driver.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
	    
	    String Year=driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText();
	    
	    
	    while(! (Month.equals("Auguest") && Year.equals("2023") ))
	    {
	    	 driver.findElement(By.xpath("//a[@title='Next']")).click();
	    	 
	 	     String month=driver.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
	 	    
	 	     String year=driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText();
	    	 //MonthYear =driver.findElement(By.className("ui-datepicker-title")).getText();
	    	// System.out.println(MonthYear);
	    	// month =MonthYear.split(" ")[0].trim();
	 		 //year =MonthYear.split(" ")[1].trim();
	 		
	 	    driver.findElement(By.xpath("//a[text()='28']")).click();
	 	    break;
	 	     
	    }
	    
		
		driver.close();

	}




}
