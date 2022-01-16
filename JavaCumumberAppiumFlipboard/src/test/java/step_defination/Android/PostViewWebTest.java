package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class PostViewWebTest extends Page {

    @Then("Tap on Post View Web")
    public void tapOnPostViewWeb() {
        getPostPage().clickMoreOptionViewWebBtn().click();
    }
}
