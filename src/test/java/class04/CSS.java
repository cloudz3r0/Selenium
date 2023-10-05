package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/cssSelector.php");
//
//        maximize the window
        driver.manage().window().maximize();

        //fil in the profile id
        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("moazzamSadiq");
        //fill in profile name
        WebElement profileName=driver.findElement(By.cssSelector("input#profileBox"));
        profileName.sendKeys("hello");

        //feedback from jenny
        WebElement feedBack=driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedBack.sendKeys("website isnt working");

        //feedback from raj
        WebElement feedBackRaj=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedBackRaj.sendKeys("website is working");

        //skip email use contains for course topic
        WebElement courseTopics=driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopics.sendKeys("selenium");

        //using starts with
        WebElement introtoAdv=driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introtoAdv.sendKeys("welcome");

        //ends with
        WebElement conclusion=driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("all is good");
    }
}
