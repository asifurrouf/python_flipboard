package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;

public class PostShareTest extends Page {

    @Given("Swipe to Right")
    public void swipeToRight() {
        ScrollRight();

    }

    @Then("click on Post more")
    public void clickOnPostMore() {
        getPostPage().clickPostMoreBtn().click();
    }

    @Then("Tap on Post")
    public void tapOnPost() {
        Tap();

    }

    @Then("Tap on Share")
    public void tapOnShare() {
        getPostPage().clickSharePostBtn().click();
    }

    @Given("Go to Daily Edition")
    public void goToDailyEdition() {
        getPostPage().clickDailyEdition().click();
    }
}
