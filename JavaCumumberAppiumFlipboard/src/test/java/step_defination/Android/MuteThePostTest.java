package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class MuteThePostTest extends Page {

    @Then("Tap on Mute the post")
    public void tapOnMuteThePost() {
        getPostPage().clickMutePostBtn().click();
    }
}
