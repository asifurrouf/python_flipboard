package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class SettingsTest extends Page {

    @Then("click on Settings")
    public void clickOnSettings() {
        getProfilePage().clickSettingsBtn().click();
    }
}
