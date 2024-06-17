package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnMoreExplicitWait {

    WebDriver driver;
    public LearnMoreExplicitWait(WebDriver driver)
    {
        this.driver = driver;
    }
 public void clickOnChangeText()
 {
     driver.findElement(By.cssSelector("#quote")).click();
 }
  public String getChangeTextValue()
  {
      String changeText;
      try{
          changeText = driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).getText();
      }
      catch(NoSuchElementException ex) {
          WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
          driverWait.pollingEvery(Duration.ofSeconds(5));
          driverWait.ignoring(NoSuchElementException.class);
          driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Hello, Learn More Aspirants']")));
          changeText = driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).getText();
      }
      return changeText;
  }
}
