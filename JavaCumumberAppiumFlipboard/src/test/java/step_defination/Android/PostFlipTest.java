package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class PostFlipTest extends Page {

    @Then("Tap on Post Flip")
    public void tapOnPostFlip() {
        getPostPage().clickFlipPostBtn().click();
    }

}
