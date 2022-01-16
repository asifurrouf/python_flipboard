package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class OtherTest extends Page {

    @Then("click on Red Button")
    public void clickOnRedButton() {
        getProfilePage().clickFloatActionBtn().click();
    }
}
