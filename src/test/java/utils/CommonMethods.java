package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;
   public static void openBrowser(String url,String browser){

       switch (browser){
           case "chrome":
               driver=new ChromeDriver();
               break;
           case "firefox":
               driver=new FirefoxDriver();
               break;
       }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public static void closeBroswer(){
       driver.quit();
    }
}
