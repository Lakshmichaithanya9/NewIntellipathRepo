package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WikiPage {

    WebDriver driver;
    public WikiPage(WebDriver driver)
    {
        this.driver =driver;
    }

    public List<String> getColumnOneValues()
    {
        int columnOneSize =driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant ::tr/child::th")).size();
        List<String> columnOneValues = new ArrayList<>();
        for(int i=0;i<columnOneSize;i++)
        {
            String value =driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant ::tr/child::th")).get(i).getText();
            columnOneValues.add(value);
        }
        return columnOneValues;
    }

    public List<String> getColumnTwoValues()
    {
        int columnTwoSize =driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant ::tr/child::td")).size();
        List<String> columnTwoValues = new ArrayList<>();
        for(int i=2;i<columnTwoSize;i++)
        {
            String value =driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant ::tr/child::td")).get(i).getText();
            columnTwoValues.add(value);
        }
        return columnTwoValues;
    }
  public void getShareHoldersAndHoldingsValue()
  {

  }
}
