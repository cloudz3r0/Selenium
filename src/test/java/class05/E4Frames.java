package class05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4Frames {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //go to alert url
        driver.get("http://35.175.58.98/handle-iframe.php");
        //maximize the window.
        driver.manage().window().maximize();
    }
}
