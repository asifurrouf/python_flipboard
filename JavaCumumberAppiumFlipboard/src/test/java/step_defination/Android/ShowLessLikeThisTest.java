package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;

public class ShowLessLikeThisTest extends Page {

    @Then("Tap on Show Less Like This")
    public void tapOnShowLessLikeThis() {
        getPostPage().clickShowLessBtn().click();
    }
}
