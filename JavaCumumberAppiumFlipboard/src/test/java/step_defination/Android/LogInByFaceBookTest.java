package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;

public class LogInByFaceBookTest extends Page {

    @Given("click on FaceBook Button")
    public void clickOnFaceBookButton() {
        getLoginPage().clickLoginFacebookBtn().click();
    }

    @Then("Tap on FaceBook Button")
    public void tapOnFaceBookButton() {
        getLoginPage().clickLoginFacebookBtn().click();
    }

}
