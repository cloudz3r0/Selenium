package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //go to google. Opens the browser with .get
        driver.get("https://www.google.com");
        //max the window
        driver.manage().window().maximize();
        //slow down to observe process
        Thread.sleep(2000);
        //go to facebook.com
        driver.navigate().to("https://facebook.com");//used after browser is open.
        //slow down to observe
        Thread.sleep(2000);
        driver.navigate().back();
        //slow down to observe
        Thread.sleep(2000);
        //go forward
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();//close closes the whole browser.
        // can also use driver.quit(); quit closes the current tab
    }
}
