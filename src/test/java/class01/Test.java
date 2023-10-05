package class01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {
    public static void main(String[] args) throws InterruptedException {
     //declare instance(object) of chrome driver
        WebDriver driver=new ChromeDriver();
     //  the get method takes you to whatever application you want to get to.
        driver.get("https://www.google.com");

//getting the title
        System.out.println(driver.getTitle());


        //maximize window
        driver.manage().window().maximize();

        //get url of website
        String currentUrl=driver.getCurrentUrl();
        System.out.println("the current url is "+currentUrl);

        //added a wait of 2 seconds.
        Thread.sleep(2000);
        driver.quit();
    }
}
