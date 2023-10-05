package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2MultipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //go to dropdown link
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        //maximize window
        driver.manage().window().maximize();
//        locate the drop down
        WebElement dd=driver.findElement(By.xpath("//select[@id='multi-select']"));
        //select multiple values in the drop down
        Select sel=new Select(dd);
        //select texas by text
        sel.selectByVisibleText("Texas");
        //select florida with value.
        sel.selectByValue("Florida");
        Thread.sleep(2000);
        //deselect all values
        sel.deselectByVisibleText("Texas");
       //check whether the dropdown is multiselect or not.
        System.out.println(sel.isMultiple());



    }
}
