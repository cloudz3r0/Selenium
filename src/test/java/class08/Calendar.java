package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;

public class Calendar extends CommonMethods {
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

        WebElement leaveTab=driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
        leaveTab.click();

        WebElement calendar=driver.findElement(By.xpath("//input[@id='calFromDate']"));
        calendar.click();

        //select the month tab
        WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        //use select class
        Select sel=new Select(month);
        sel.selectByVisibleText("Aug");

        //select the year
        WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel1=new Select(year);
        sel1.selectByVisibleText("1935");

        //get all the dates
       List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));//go through each day in the calendar.
        for(WebElement date:dates){
            String text = date.getText();

            if(text.equals("4")){
                date.click();
                break;
            }
        }



    }
}
