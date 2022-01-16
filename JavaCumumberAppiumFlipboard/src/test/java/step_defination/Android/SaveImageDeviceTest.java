package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class SaveImageDeviceTest extends Page {

    @Then("click on Save image to device")
    public void clickOnSaveImageToDevice() {
        getPostPage().clickSaveImageToDeviceBtn().click();
    }
}
