package stepDefinitionFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.TestContext;

public class learnMorePageSteps {
     TestContext context;

    public learnMorePageSteps(TestContext context)
    {
        this.context =context;
    }

    @Given("user click on the confirmation box button")
    public void userClickOnConfirmBox()
    {
    context.pageObjectManager.getLearnMorePage().ClickOnConfirmBox();
    }
    @Then("user validate the alert message")
    public void userValidateAlertMessage()
    {
    String actualMessage=context.pageObjectManager.getLearnMorePage().getAlertMessage();
    String expectedMessage = "Press a Button !";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @And("user validate the UI message")
    public void userValidateTheUIMessage() {
        context.pageObjectManager.getLearnMorePage().cickOnCancelButton();
        String actualMessage =context.pageObjectManager.getLearnMorePage().getCancelTextMessageUI();
        String expectedMessage ="You Pressed Cancel";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    @Given("user clicks on change text button")
    public void ClicksOnChangeTextButton() {
        context.pageObjectManager.getLearnMoreExplicitWait().clickOnChangeText();
    }

    @Then("validate the change text value")
    public void validateChangeText() {
       String actualText = context.pageObjectManager.getLearnMoreExplicitWait().getChangeTextValue();
       String expectedText = "Hello, Learn More Aspirants";
       System.out.println(actualText);
       Assert.assertEquals(actualText,expectedText);
    }
}
