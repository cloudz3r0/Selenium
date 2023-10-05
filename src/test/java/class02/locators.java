package class02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args) {
        //create object
        WebDriver driver=new ChromeDriver();
//navigate to website
driver.get("http://35.175.58.98/input-form-locator.php");

//maximize window
driver.manage().window().maximize();

//locate webelement firstname
WebElement firstname=driver.findElement(By.id("first_name"));

//use send keys to send data to webelement
        firstname.sendKeys("moazzam");


        //locate the webelement last name
        WebElement lastName=driver.findElement(By.name("last_name"));
       //send keys to send data.
        lastName.sendKeys("sadig");
        //locate web element email
       WebElement email=driver.findElement(By.className("form-control-01"));
       //once again send input
        email.sendKeys("email@gmail.com");

        //locate button then click it
        //tagName just means the tag. Dont look for TagName="Something"
        //remember all elements have a singular word name.
        WebElement sumbitBtn=driver.findElement(By.tagName("button"));
        sumbitBtn.click();
        //locate the WebElement Link
        WebElement linkBtn=driver.findElement(By.linkText("Link"));
        linkBtn.click();
        //locate it with partial linktext
        WebElement clickHere=driver.findElement(By.partialLinkText("Here."));//the linktext was Click Here.
        clickHere.click();
    }
}
