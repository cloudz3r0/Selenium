package review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //go to alert url
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
        //maximize the window.
        driver.manage().window().maximize();
        //locate the second click me button on the screen then click
        WebElement alert2 = driver.findElement(By.xpath("//button [@onclick='myAlertFunction()']"));
        alert2.click();
        driver.switchTo().alert().accept();

    }
}
