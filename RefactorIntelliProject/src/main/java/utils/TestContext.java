package utils;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContext {
     public WebDriverManager webDriverManager;
     public PageObjectManager pageObjectManager;

     public TestContext() throws IOException {
          webDriverManager =new WebDriverManager();
          pageObjectManager =new PageObjectManager(webDriverManager.getDriverDetails());
     }
}
