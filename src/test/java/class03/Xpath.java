package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/Xpath.php");
//
//        maximize the window
        driver.manage().window().maximize();
//
//    find the text box by copying the Xpath we made on the page we're using
       WebElement textbox1= driver.findElement(By.xpath("//input[@id='title']"));
//sending keys
        textbox1.sendKeys("batch16");

        //find the next textbox and send keys
        WebElement textBox2=driver.findElement(By.xpath("//input[@name='title']"));
        textBox2.sendKeys("batch17");

        //find the next one. Security question
        WebElement question1=driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        question1.sendKeys("whats the color of the sun?");

        //get the text with contains
        WebElement magicaltext=driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(magicaltext.getText());

        //get text for "Select using Starts with"
        WebElement textBoxAPI=driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
        textBoxAPI.sendKeys("abracadabra");

        //get email 1
        WebElement email1=driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("hello1@gmail.com");

        //get email 2
        WebElement email2=driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("hello2@gmail.com");

        //get email 3
        WebElement email3=driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("hello3@gmail.com");

        //get the below fields
        WebElement field1=driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("cat");

        //get field 2
        WebElement field2=driver.findElement(By.xpath("//input[@name='customField' and @data-detail='two']"));
        field2.sendKeys("catterpillar");
    }
}


