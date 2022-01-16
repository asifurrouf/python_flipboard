package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class ClickLinkTest extends Page {

    @Then("click on copy Link")
    public void clickOnCopyLink() {
        getPostPage().clickCopyLinkBtn().click();
    }
}
