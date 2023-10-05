package review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBokExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //go to facebook.com
        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        //find the Create new account button
     WebElement createNewAcc= driver.findElement(By.xpath("//a[text()='Create new account']"));
       createNewAcc.click();
       Thread.sleep(2000);//need a thread.sleep since the create account makes a new window on the tab
        //we're on
        //check if the button is enabled
     boolean enabled=createNewAcc.isEnabled();
        System.out.println("Button is enabled"+enabled);
     WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
     firstName.sendKeys("Adrian");
        System.out.println(driver.getTitle());

    }
}
