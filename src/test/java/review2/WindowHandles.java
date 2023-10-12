package review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
       /*
       HW2:
goto gmail.com
click on help
click on privacy
click on terms
switch the focus on terms page and get the title and print on screeen

then switch the focus back to the gmail page
and print the title of the main page on screen
        */

        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&ifkv=AYZoVhfd6SLmQerf_rbPbXn5zRCnbbohSmErPPEsQq3zSIhxyUL7zOwi31kPWiGFlpCDXtixm16B&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S487264224%3A1696468142132337&theme=glif");
        driver.manage().window().maximize();
        //click on help
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        //click on privacy
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        //click on terms button
        WebElement terms=driver.findElement(By.xpath("//a[text()='Terms']"));
        terms.click();
        //get main page handle
        String mainPageHandle=driver.getWindowHandle();
        //get all handles
        Set<String>allHandles=driver.getWindowHandles();
        for(String handle:allHandles){
            driver.switchTo().window(handle);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Google Terms of Service - Privacy & Terms - Google")){
                break;
            }
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}
