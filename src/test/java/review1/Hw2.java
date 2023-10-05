package review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    /*
    goto https://demoqa.com/text-box
and use xpath to fill the form
and xumit it
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName=driver.findElement(By.xpath("//input[@placeHolder='Full Name']"));
        fullName.sendKeys("Adrian Franco");
        Thread.sleep(2000);

        WebElement email=driver.findElement(By.xpath("//input[@placeHolder='name@example.com']"));
        email.sendKeys("Ren7ero@gmail.com");
        Thread.sleep(2000);

        WebElement currentAddress=driver.findElement(By.xpath("//textarea [@placeholder='Current Address']"));
        currentAddress.sendKeys("6857 Maryland Road");
        Thread.sleep(1000);

        WebElement permaAddress=driver.findElement(By.xpath("//textarea [@id='permanentAddress']"));
        permaAddress.sendKeys("6766 Virginia Lane");
        Thread.sleep(999);

        WebElement submitBtn=driver.findElement(By.xpath("//button[text()='Submit']"));
        submitBtn.click();

    }
}
