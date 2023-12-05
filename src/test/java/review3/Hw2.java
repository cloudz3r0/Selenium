package review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

public class Hw2 extends CommonMethods {
    public static void main(String[] args) {

    String url="http://35.175.58.98/synchronization-waits.php";
    String browser="chrome";
    openBrowser(url,browser);
    //find the button and click on it
        WebElement button2= driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        button2.click();
        //the implicit wait is already implemented in common methods
        //find the radio button
        WebElement radioBtn=driver.findElement(By.xpath("//input[@value='Male']"));
        radioBtn.click();





}
    }
