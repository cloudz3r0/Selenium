package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        //write down the topic
        //switch to iframe
        driver.switchTo().frame(0);
        WebElement topic=driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("hello");

        //click on checkbox inside innerframe.
        driver.switchTo().frame("checkboxIframe");
        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();


        //switch to default aka switch back to page and not frames. We didnt do this above since innerframe was
        //inside the frame we switched to.
        driver.switchTo().defaultContent();

        //switch using webelement
        //locate the frame u want to switch to with WebElement method
        WebElement frame=driver.findElement(By.xpath("//iframe[@name='dropdown-frame']"));

        //switch to frame with frame method
        driver.switchTo().frame(frame);//using locate by frame.
        //locate the webelement select
        WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(animals);
        sel.selectByVisibleText("Baby Cat");

    }
}
