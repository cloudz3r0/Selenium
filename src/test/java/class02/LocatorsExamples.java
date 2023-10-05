package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();

     //enter username
      WebElement username= driver.findElement(By.id("txtUsername"));
      username.sendKeys("ADrian");
     //for observation
      Thread.sleep(2000);
      //clear the text box and resend the username.
        username.clear();
        username.sendKeys("Admin");
        //send password
        WebElement password=driver.findElement(By.name("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        //click login button
       WebElement loginBtn= driver.findElement(By.className("button"));
       loginBtn.click();

       // get the text welcome admin and print on console
       WebElement welcomeMsg= driver.findElement(By.linkText("Welcome Admin"));
       String msg=welcomeMsg.getText();
        System.out.println("The message is "+msg);



    }
}
