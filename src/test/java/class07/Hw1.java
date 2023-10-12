package class07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import review2.Alerts;
import utils.CommonMethods;

public class Hw1 extends CommonMethods {
    /*
    hw1:
http://35.175.58.98/synchronization-explicit-wait.php
click to open alert and handle it
click to change text and get the chnaged text
click to get hidden button click on it
click to get the checkbox selected and print if it is selected or not
     */
    public static void main(String[] args) throws InterruptedException {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowser(url,browser);
        WebElement alert1=driver.findElement(By.xpath("//button[@id='show_alert']"));
        //switch focus to the alert
       /* alert1.click();

        Alert alert=driver.switchTo().alert();
      alert.accept();
      */


        //click to change text and get the changed text
WebElement text=driver.findElement(By.xpath("//button[@id='changetext_button']"));
text.click();

WebElement text1=driver.findElement(By.xpath("//h2[@id='headingtext']"));
Thread.sleep(9999);
        System.out.println(text1.getText());






    }
}
