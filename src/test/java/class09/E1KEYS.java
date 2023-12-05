package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class E1KEYS extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://35.175.58.98/keypress.php";
                String browser="chrome";
                openBrowser(url,browser);
        WebElement input=driver.findElement(By.xpath("//input[@class='form-control']"));
        input.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        input.sendKeys(Keys.TAB);


    }
}
