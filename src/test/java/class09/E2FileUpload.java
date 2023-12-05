package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class E2FileUpload extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/upload-image.php";
                String browser="chrome";
        openBrowser(url,browser);

        WebElement chooseFile=driver.findElement(By.xpath("//input[@id='image-file']"));
        chooseFile.sendKeys("C:\\Users\\Ren7e\\Pictures\\Selenium\\SeleniumCheat.jpg");
    }
}
