package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearnMoreAlertPage {
     WebDriver driver;
     public LearnMoreAlertPage(WebDriver driver)
     {
         this.driver =driver;
     }
   public void ClickOnConfirmBox()
   {
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
   }

   public String getAlertMessage()
   {
       String alertmsg = driver.switchTo().alert().getText();
       return alertmsg;
   }
   public void cickOnCancelButton()
   {
    driver.switchTo().alert().dismiss();
   }
   public void clickOnOKButton()
   {
       driver.switchTo().alert().accept();
   }
    public String getCancelTextMessageUI()
    {
    String message = driver.findElement(By.id("demo")).getText();
    return message;
    }
}
