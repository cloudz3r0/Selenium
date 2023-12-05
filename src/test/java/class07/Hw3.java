package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class Hw3 extends CommonMethods {
    public static void main(String[] args) {
// print the rows that have status  "in progress". no contains method
        String url = "http://35.175.58.98/table-search-filter-demo.php";
        String browser = "chrome";
        openBrowser(url, browser);

        List<WebElement> status = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr/td[4]"));
        int i = 0;
        for (WebElement statu : status) {

            String statusText = statu.getText();
            if (statusText.equals("in progress")) {
                System.out.println("the row that contains in progress status is" + i);
                WebElement row = driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr[" + (i + 1) + "]"));
                System.out.println(row.getText());
            }
            i = i + 1;

        }


    }
}

