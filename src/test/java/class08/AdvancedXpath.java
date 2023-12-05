package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class AdvancedXpath extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/advanceXpath.php";
        String browser="chrome";
        openBrowser(url,browser);
//get middle textbox
        WebElement nearestSibling=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        nearestSibling.sendKeys("Percyjackson");

        //get middle text box in second row
        WebElement precedingSibling= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        precedingSibling.sendKeys("PercyJackson");

        //get the middle textBox in third row
        WebElement child=driver.findElement(By.xpath("/div[@id='familyTree']/child::input[2]"));
        child.sendKeys("Percy Jackson");
    }
}
