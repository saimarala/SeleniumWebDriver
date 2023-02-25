package jan29_ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class orangehrmloginpage {
    WebDriver driver;
    public orangehrmloginpage(WebDriver driver){
        this.driver=driver;
    }
    By uname = By.name("username");
    By password = By.name("password");
    By signIn = By.xpath("//button[@type='submit']");

    public  orangehrmHomepage loginApp(String user,String pass){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(uname)).sendKeys(user);
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(pass);
        wait.until(ExpectedConditions.visibilityOfElementLocated(signIn)).click();
        return new orangehrmHomepage(driver);
    }
}
