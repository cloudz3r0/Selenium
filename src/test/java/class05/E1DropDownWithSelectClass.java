package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class E1DropDownWithSelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //go to dropdown link
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        //maximize window
        driver.manage().window().maximize();
//        locate the drop down
        WebElement dropDown=driver.findElement(By.xpath("//Select[@id='select-demo']"));
        //create object of select class and pass in the dropdown element
        Select sel=new Select(dropDown);
        //use any method out of byIndex(),visibleText, byValue
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
        sel.selectByIndex(1);

        /*if we want to get all options.
        List<WebElement> options=sel.getOptions();
         for(WebElement option:options){
             System.out.println(option.getText());
             //Click all options.
             option.click();*/
         }


    }

