package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class HomeShareTest extends Page {


    @Then("click on Share Button")
    public void clickOnShareButton() {
        getProfilePage().clickShareBtn().click();
    }
}
