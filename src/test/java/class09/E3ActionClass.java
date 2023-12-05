package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

import javax.swing.*;

public class E3ActionClass extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/simple_context_menu.php";
        String browser = "chrome";
        openBrowser(url, browser);
//find hover button
        WebElement hover = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        Actions action = new Actions(driver);
        action.moveToElement(hover).perform();
//draggable
        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//drop location

        WebElement dropLocation=driver.findElement(By.xpath("//div[@id='droppable']"));
        //action.dragAndDrop(draggable,dropLocation).perform();
        //different way
        action.clickAndHold(draggable).moveToElement(dropLocation).release().build().perform();//need to call build when chaining methods. So do it in place of perform


    }
}
