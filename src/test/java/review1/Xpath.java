package review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/Xpath.php");
//
//        maximize the window
        driver.manage().window().maximize();
//Find option 2 in select using your choice of xpath

        WebElement option2=driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='two']"));
        option2.sendKeys("This has been filled");
    }
}
