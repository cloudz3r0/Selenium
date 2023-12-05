package class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.CommonMethods;

import java.io.File;
import java.io.IOException;

public class E7ScreenShot extends CommonMethods {
    public static void main(String[] args) throws InterruptedException, IOException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowser(url, browser);

        //declare the instance
        TakesScreenshot ts=(TakesScreenshot)driver;
        //take the screen shot
       File ss=ts.getScreenshotAs(OutputType.FILE);
       //then save on computer

        FileUtils.copyFile(ss,new File("C:\\Users\\Ren7e\\Desktop\\SeliniumSyntax\\screenshot\\abc.png"));//creates a screenshot folder\\name of folder

    }
}
