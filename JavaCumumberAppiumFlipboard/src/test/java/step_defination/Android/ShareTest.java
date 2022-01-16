package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class ShareTest extends Page {


    @Then("click on share")
    public void clickOnShare() {
        getPostPage().clickShareBtn2().click();
    }

    @Then("share on FaceBook")
    public void shareOnFaceBook() {
        getPostPage().clickShareOnFaceBookBtn().click();
    }
}
