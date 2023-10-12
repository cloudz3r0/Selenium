package review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        driver.switchTo().frame("textfieldIframe");
//find the frame that has innerframecheckbox and switch to it.
        WebElement frameCheckBox=driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(frameCheckBox);
        WebElement clickCheckBox=driver.findElement(By.xpath("//input[@class='cb1-element']"));
        clickCheckBox.click();
        //switch out of that frame
        driver.switchTo().defaultContent();
        //locate the webelement select
        WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
        //call select class
        Select sel=new Select(animals);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();
        //select the frame and send keys
        driver.switchTo().frame("textFieldIframe");//we looked for this by inspecting the frame then looking for the name in the html.
        //sending the keys
        driver.findElement(By.name("Topic")).sendKeys("abcdef");



    }
}
