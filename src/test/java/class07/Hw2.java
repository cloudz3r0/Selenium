package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.sql.SQLOutput;

public class Hw2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        click on click me button and get the text and print on screen
         */

        String url="http://35.175.58.98/synchronization-waits.php";
        String browser="chrome";
        openBrowser(url,browser);


        WebElement clickMeButton=driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));


        clickMeButton.click();
        Thread.sleep(3000);
        WebElement text=driver.findElement(By.xpath("//div[@class='card-body']/p"));
        System.out.println(text.getText());


    }
}
