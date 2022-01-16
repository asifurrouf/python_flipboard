package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;

public class SelectTopicTest extends Page {

    @Given("click on news")
    public void selectTopic() {
        getTopicPage().clickNewsTopicBtn().click();
    }

    @Then("click on Technology")
    public void clickOnTechnology() {
        getTopicPage().clickTechnologyTopicBtn().click();
    }

    @Then("click on Sports")
    public void clickOnSports() {
        getTopicPage().clickSportsTopicBtn().click();
    }

    @Then("click on Continue")
    public void clickOnContinue() {
        getTopicPage().clickContinueBtn().click();
    }
    @Then("click on Login Button")
    public void clickOnLonIn() {
        getTopicPage().clickLoginBtn().click();
    }
}
