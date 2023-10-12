package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class Tables extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/table-data-download-demo.php";
        String browser = "chrome";
        openBrowser(url, browser);

        //get the whole table
        WebElement allTable = driver.findElement(By.xpath("//table[@id='example']"));
        String tableContent = allTable.getText();
        //System.out.println(tableContent);

        //row level access
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        for (WebElement row : rows) {
            String text = row.getText();
            if (text.contains("Software Engineer")) {
                // System.out.println(text);
            }
            List<WebElement> columns = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
            for (WebElement column : columns) {
                String text1 = column.getText();
                //System.out.println(text1);
            }
//print the row with software engineer without using contains method.
//locate the column that contains position
            List<WebElement> positions = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
            int i = 0;
            //iterate
            for (WebElement position : positions) {
                String text2 = position.getText();
                if (text2.equals("Software Engineer")) {
                    System.out.println("The rows that contain software engineers "+i);
                    WebElement rowWithEngineer=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+(i+1)+"]"));
                    System.out.println(rowWithEngineer.getText());

                }

                i = i + 1;
            }
        }


    }
}
