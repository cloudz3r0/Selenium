package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class DynamicTableWithPagination extends CommonMethods {
    public static void main(String[] args) {


        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowser(url, browser);
        //find username
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        //find password
        userName.sendKeys("Admin");
        WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passWord.sendKeys("Hum@nhrm123");
        //find login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        //find the pim section
        WebElement PIM = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        PIM.click();
        //tables
        //select the check box for the employee that has an id of 357842


        boolean notFound = true;//to keep the wile loop running.
        while (notFound) {//continue to do while loop until its set to false.
            List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));//find list after each page is clicked
            //when we hit next we lose the current list since all the values have changed.
            //iterate
            for (int i = 0; i < idColumn.size(); i++) {
                String id = idColumn.get(i).getText();
                //compare if that is my desired id
                if (id.equals("61061921")) {
                    //click on the checkbox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    notFound = false;
                    break;
                }

            }
            //click on the next page
            if (notFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }
        }

    }

}

