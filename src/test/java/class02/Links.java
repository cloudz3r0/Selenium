package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Links {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
         // get all the links and print them on the console.
        //press ctrl+F at the button to search for tag
        //links are in anchor tags. Search with //a
       List<WebElement>links =driver.findElements(By.tagName("a"));
       for(WebElement link:links){
          String nameOfLink= link.getText();
           System.out.println(nameOfLink);
          String linkVal= link.getAttribute("href");
           System.out.println(linkVal);

       }
    }
}