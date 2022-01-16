package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class PostShowLessTest extends Page {


    @Then("Click on Show Less Like This")
    public void clickOnShowLessLikeThis() {
        getPostPage().clickShowLessPostBtn().click();
    }
}
