package review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class Tables extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/table-search-filter-demo.php";
        String browser = "chrome";
        openBrowser(url, browser);

//        get the column status
        List<WebElement> statuses = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));

        for(int i=0 ;i<statuses.size();i++){

            String currentStatus = statuses.get(i).getText();

            if(currentStatus.equals("in progress")){

                System.out.println("the row number which has in progress is "+i);
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" +( i+1) + "]"));
                System.out.println(row.getText());
            }
        }
    }
}
