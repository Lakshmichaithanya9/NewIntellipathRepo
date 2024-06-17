package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver)
    {

        this.driver = driver;
    }

    public void enterProductName(String productName)
    {
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }
    public void clickOnSearchIcon()
    {

        driver.findElement(By.className("nav-search-submit nav-sprite")).click();
    }
    public void clickOnBabyWishList()
    {
    WebElement accountsElement =driver.findElement(By.id("nav-link-accountList"));
    Actions a = new Actions(driver);
    a.clickAndHold(accountsElement);
    driver.findElement(By.linkText("Baby Wishlist")).click();
    }
}
