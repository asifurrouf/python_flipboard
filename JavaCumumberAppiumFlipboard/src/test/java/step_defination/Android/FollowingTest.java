package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;

public class FollowingTest extends Page {

    @Given("Scroll to Down")
    public void scrollToDown() {
        ScrollDown();
    }

    @Then("Click on Follow")
    public void clickOnFollow() {
        getPostPage().clickFollowBtn().click();
    }

    @Then("ScrollDown")
    public void scrolldown() {
        ScrollDown();
    }
}
