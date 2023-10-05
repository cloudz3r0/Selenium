package review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw1 {/*
HW1:
Navigate to http://35.175.58.98/basic-checkbox-demo.php.
Check the if Checkbox1 is enabled
If Checkbox1 is disabled:
Click on the "enable checkboxes" button.
Verify that Checkbox1 is now enabled.
Click on Checkbox1.
Confirm that Checkbox1 is selected.
*/

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //go to facebook.com
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        //maximize window
        driver.manage().window().maximize();
        //check if checkbox1 is enabled
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));

        for (WebElement checkBox : checkboxes) {
            String option = checkBox.getAttribute("value");
            if (option.equals("Checkbox-1")) {
                boolean enabled = checkBox.isEnabled();
                System.out.println(enabled);
                //if checkbox1 is disabled

                if (!enabled) {
                    //Click on the "enable checkboxes" button
                    WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
                    enableBtn.click();
                }
                //verify that checkbox1 is now enabled
                boolean enabled2 = checkBox.isEnabled();
                if (enabled2) {
                    //click on checkbox 1
                    checkBox.click();
                    //confirm that checkbox 1 is selected
                    boolean isSelectedStatus = checkBox.isSelected();
                    System.out.println(isSelectedStatus);
                }
            }
        }
    }
}
