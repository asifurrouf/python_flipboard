package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;
import pages.utilities.TestData;

public class PostCommentTest extends Page {

    @Then("Tap on Post Comment")
    public void tapOnPostComment() {
        getPostPage().clickCommentPostBtn().click();


    }

    @Then("click on Post Comment Field")
    public void clickOnPostCommentField() {
        getPostPage().clickCommentBtn().click();
    }

    @Then("Fill Comment on Post Comment Field")
    public void fillCommentOnPostCommentField() {
        getPostPage().FillCommentField().sendKeys(TestData.Comment);
    }
}
