package jan29_ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Orangehrm extends BaseClass{

    WebDriver driver;
 //   WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
    @Test
    public void validLogin()


    {

     //   driver=new ChromeDriver();
      //  driver.get("https://opensource-demo.orangehrmlive.com/");
        orangehrmloginpage orm=new orangehrmloginpage(driver);

        //home.clickOnLoginButton();

        //LoginPage login=new LoginPage(driver);

        orangehrmHomepage login=orm.loginApp("Admin","admin123");
        //h6[text()='Dashboard']
     //   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='Dashboard']"))).isDisplayed();
        login.admin();






    }
}
