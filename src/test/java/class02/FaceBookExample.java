package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookExample
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //go to facebook
        driver.get("https://www.facebook.com");
       //maximize window
        driver.manage().window().maximize();
        //find the email address
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("email@gmail.com");
//find the password. was in name=pass.
        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("Ahdhgs");

        //find login button. was name="login"
        WebElement login=driver.findElement(By.name("login"));
        login.click();

    }
}
