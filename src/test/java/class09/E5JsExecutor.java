package class09;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import utils.CommonMethods;

public class E5JsExecutor extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://35.175.58.98/simple_context_menu.php";
        String browser="chrome";
        openBrowser(url,browser);
        //scroll down
        //declare instance
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -500)");

    }
}
