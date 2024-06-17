package utils;

import PageObjects.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public  BabyWishListPage babyWishListPage;
    public HomePage homePage;
    public LearnMoreAlertPage learnMoreAlertPage;
    public LearnMoreExplicitWait learnMoreExplicitWait;
    public WikiPage wikiPage;
    public WebDriver driver;

    public PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }
    public BabyWishListPage getBabyWishListPage()
    {
        babyWishListPage = new BabyWishListPage(driver);
        return babyWishListPage;

    }
    public HomePage getHomePage()
    {
        homePage = new HomePage(driver);
        return homePage;
    }
    public LearnMoreAlertPage getLearnMorePage()
    {
        learnMoreAlertPage = new LearnMoreAlertPage(driver);
        return learnMoreAlertPage;
    }
    public LearnMoreExplicitWait getLearnMoreExplicitWait()
    {
        learnMoreExplicitWait = new LearnMoreExplicitWait(driver);
        return learnMoreExplicitWait;
    }

    public WikiPage getWikiPage() {
        wikiPage =new WikiPage(driver);
        return wikiPage;
    }
}
