package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;

public class HistoryTest extends Page {

    @Then("click on History Button")
    public void clickOnHistoryButton() {
        getProfilePage().clickHistoryBtn().click();
    }
}
