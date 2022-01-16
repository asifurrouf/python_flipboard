package step_defination.Android;

import core.utils.AndroidCore.AndroidDriverSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;

public class LikeTest extends Page {


    @Then("Like on post")
    public void likeOnPost() {
        getPostPage().clickLikeBtn2().click();
    }

    @Given("click on more")
    public void clickOnMore() {
        getPostPage().clickMoreBtn2().click();
    }
}
