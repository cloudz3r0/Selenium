package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&ifkv=AYZoVhfd6SLmQerf_rbPbXn5zRCnbbohSmErPPEsQq3zSIhxyUL7zOwi31kPWiGFlpCDXtixm16B&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S487264224%3A1696468142132337&theme=glif");
        driver.manage().window().maximize();
        //click on help
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));

        //click on privacy
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        helpBtn.click();
        privacyBtn.click();
//Task1
        //get the window handle of main page i.e gmail.com and print it out on console

        //as our webdriver is currently focused on gmail page
        //we can use driver.windowhandle to get handle of current page
        String gmailHandle = driver.getWindowHandle();
        System.out.println(gmailHandle);
        //task 2
        //switch the focus of your webdriver to the privacy window.
        Set<String>allHandles=driver.getWindowHandles();

        //loop through all the handles and find the one that is desired
        for(String handle:allHandles){
            //switch to first handle in the list
            driver.switchTo().window(handle);
            //get the title of the window on which the focus is. We want to get privacy
            String title=driver.getTitle();
            //check if the title is the one you want
            //to know what the title is so we can set the condition you inspect then type //title
            if(title.equalsIgnoreCase("Privacy Policy - Privacy &terms - Google")){
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }
}
