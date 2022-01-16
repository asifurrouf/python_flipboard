package step_defination.Android;

import io.cucumber.java.en.Given;
import pages.Page;

public class LoginByTwitterTest extends Page {

    @Given("click on Twitter Button")
    public void clickOnTwitterButton() {
        getLoginPage().clickLoginTwitterBtn().click();
    }
}
