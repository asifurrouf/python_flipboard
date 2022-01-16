package step_defination.Android;

import io.cucumber.java.en.Given;
import pages.Page;

public class LogInByGoogleTest extends Page {

    @Given("click on Google Button")
    public void clickOnGoogleButton() {
        getLoginPage().clickLoginGoogleBtn().click();
    }
}
