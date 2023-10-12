package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

import java.time.Duration;

public class FaceBook extends CommonMethods {
    public static void main(String[] args) {
       String url="https://www.facebook.com";
      String browser="chrome";
openBrowser(url,browser);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //find the Create new account button
        WebElement createNewAcc= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAcc.click();


        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Adrian");
    }
}
