package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;
import pages.utilities.TestData;

public class SearchTest extends Page {

    @Given("click on Search Button")
    public void clickOnSearchButton() {
        getPostPage().clickSearchBtn().click();
    }

    @Then("click on Search Field")
    public void clickOnSearchField() {
        getPostPage().clickSearchField().click();
    }

    @Then("Fill text on Search Field")
    public void fillTextOnSearchField() {
        getPostPage().FillSearchField().sendKeys(TestData.Search);
    }
}
