package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //go to alert url
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
        //maximize the window.
        driver.manage().window().maximize();
        //Task1
        //click on the first alert button and handle the alert.
      WebElement alert1= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        Thread.sleep(2000);
        //switch focus to alert
        Alert alert=driver.switchTo().alert();
        alert.accept();

        //task 2
        //click on the third alert,send text there and press okay
        WebElement alert3=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();

        Thread.sleep(2000);
        alert.sendKeys("Hello");
        alert.accept();

        //taslk 3
        //click on second and handle the alert
        WebElement alert2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(2000);
        alert.dismiss();


    }
}
