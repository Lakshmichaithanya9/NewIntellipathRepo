package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BabyWishListPage {

    WebDriver driver;

    public BabyWishListPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getPageTitle()
    {
      String title =driver.getTitle();
      return title;
    }

}
