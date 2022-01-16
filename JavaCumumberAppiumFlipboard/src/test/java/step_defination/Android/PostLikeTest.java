package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class PostLikeTest extends Page {


    @Then("Tap on Post Like")
    public void tapOnPostLike() {
        getPostPage().clickLikePostBtn().click();

    }
}
