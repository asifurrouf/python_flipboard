package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class PostReadViewTest extends Page {

    @Then("Tap on Post Reader View")
    public void tapOnPostReaderView() {
        getPostPage().clickReadPostBtn().click();
    }
}
