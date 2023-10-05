package review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3 {
    public static void main(String[] args) throws InterruptedException {
        /*HW2:
        Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
        Check if the "Female" radio button is displayed.
        Click on the "Show Button".
                Check again if the "Female" radio button is displayed or not.
        Print the results of the checks to the console.*/
        WebDriver driver = new ChromeDriver();
        //open website
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        //maximize screen
        driver.manage().window().maximize();

        WebElement femaleBtn = driver.findElement(By.xpath("//input[@value='gender-female']"));
        //Check if the "Female" radio button is displayed.
        boolean isDisplayed = femaleBtn.isDisplayed();
        System.out.println("The female button is displayed "+isDisplayed);
Thread.sleep(2000);
        //Click on the "Show Button".
        WebElement showBtn = driver.findElement(By.xpath("//button [@id='toggleRadioButtons']"));
        showBtn.click();
        //   Check again if the "Female" radio button is displayed or not.
        WebElement femaleBtn2=driver.findElement(By.xpath("//input[@value='gender-female']"));
        System.out.println("The female button is displayed "+femaleBtn2.isDisplayed());
    }

}
