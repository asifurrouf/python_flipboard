package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;
import pages.utilities.TestData;

public class FlipTest extends Page {

    @Then("Tap on Flip")
    public void tapOnFlip() {
        getPostPage().clickFlipBtn2().click();
    }

    @Then("Create Magazine")
    public void createMagazine() {
         getPostPage().clickCreateMagazineBtn2().click();
    }

    @Then("fill Name Your Magazine Field")
    public void fillNameYourMagazineField() {
        getPostPage().fillNameYourMagazineField().sendKeys(TestData.TITLE);
    }

    @Then("fill Desc Your Magazine Field")
    public void fillDescYourMagazineField() {
        getPostPage().fillDescYourMagazineField().sendKeys(TestData.DESC);
    }

    @Then("click Private Button")
    public void clickPrivateButton() {
        getPostPage().clickPrivateBtn().click();
    }
}
