package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class PostSaveImageTest extends Page {


    @Then("Tap on More Button")
    public void tapOnMoreButton() {
        getPostPage().clickMorePostBtn().click();
    }

    @Then("Tap on Post Save image")
    public void tapOnPostSaveImage() {
        getPostPage().clickMorePostSaveImageBtn().click();
    }
}
