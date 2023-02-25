package jan14_DesiredCap_OptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLIsseue {

	public static void main(String[] args) {
	
		/*
		 * 	How to handle SSL certificate
		 * 	How to handle secure application
		 *  How to handle insecure certificate
		 * 	How to handle https application
		 * 	How to handle invalid certificate
		 */
		
		//FirefoxOptions ff=new FirefoxOptions();
		//ff.setHeadless(true);
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.cacert.org/");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("URL is "+driver.getCurrentUrl());
		
		//driver.quit();
		
	}

}
