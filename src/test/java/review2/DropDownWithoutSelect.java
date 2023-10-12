package review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithoutSelect {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //go to alert url
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        //maximize the window.
        driver.manage().window().maximize();
        //locate the dropdown menu then click it to show options
        WebElement dd = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        dd.click();
//Get all the options
       List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
//select peru
        for(WebElement option:options){
            String text=option.getText();//get all texts in the options. if not we'd just get the webelements and not the texts.
            if(text.equals("Peru")){
                option.click();
break;
            }
        }
    }
}