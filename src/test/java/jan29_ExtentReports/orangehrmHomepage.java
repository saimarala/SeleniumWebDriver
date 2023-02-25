package jan29_ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class orangehrmHomepage {
    WebDriver driver;
    public orangehrmHomepage(WebDriver driver){
        this.driver=driver;
    }

    By dashboard = By.xpath("//h6[text()='Dashboard']");
    By admin = By.xpath("//span[text()='Admin']");

    @FindBys({
            @FindBy(xpath = "//span[text()='Admin']"),
            @FindBy(xpath = "//h6[text()='Dashboard']")})
    List<WebElement> ele;

    @FindAll({
            @FindBy(xpath = "//span[text()='Admin']"),
            @FindBy(xpath = "//h6[text()='Dashboard']")})
    List<WebElement> ele1;
   public void admin(){

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }

}
