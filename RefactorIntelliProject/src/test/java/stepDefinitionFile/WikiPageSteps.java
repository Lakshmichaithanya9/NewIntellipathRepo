package stepDefinitionFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.TestContext;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WikiPageSteps {

    TestContext context;

    public WikiPageSteps(TestContext context)
    {
        this.context =context;
    }

    @Given("user extracts the column one value")
    public void column1ValueExtract()
    {
        List<String> column1 = new ArrayList<>();
       column1= context.pageObjectManager.getWikiPage().getColumnOneValues();
        System.out.println(column1);
    }

    @When("user extracts the column two value")
    public void column2ValueExtract() {
        List<String> column2 = new ArrayList<>();
       column2= context.pageObjectManager.getWikiPage().getColumnTwoValues();
        System.out.println(column2);
    }

    @Then("user validates the mapping")
    public void userValidatesTheMapping() {

        Assert.assertEquals("Company type",context.pageObjectManager.getWikiPage().getColumnOneValues().get(2));
        Assert.assertEquals("Public",context.pageObjectManager.getWikiPage().getColumnTwoValues().get(2));
    }

    @Given("user validates the key and value pair relation of share holders and share holdings")
    public void validate_keyValue_pair() {

    }
}

