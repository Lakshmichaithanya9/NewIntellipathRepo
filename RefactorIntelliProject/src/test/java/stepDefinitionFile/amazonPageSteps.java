package stepDefinitionFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.TestContext;

public class amazonPageSteps {

    TestContext context;

    public amazonPageSteps(TestContext context)
    {
        this.context=context;
    }


    @Given("user clicks on the baby wishList from accounts and lists")
    public void baby_wishList()
    {
        context.pageObjectManager.getHomePage().clickOnBabyWishList();
    }

    @Then("user verify the navigation")
    public void userVerifyTheNavigation() {
      String ActualTitle = context.pageObjectManager.getBabyWishListPage().getPageTitle();
      Assert.assertEquals("abc",ActualTitle);
    }
}
