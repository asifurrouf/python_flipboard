package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;
import pages.utilities.TestData;

public class LoginByMailTest extends Page {
    @Given("click on Email Button")
    public void clickEmailButton() {
        getLoginPage().clickLoginMailBtn().click();
    }

    @Then("Select a mail")
    public void selectAMail() {
        getLoginPage().clickGmailAccount().click();
    }

    @Then("Fill password on Password Field")
    public void fillPasswordOnPasswordField() {
        getLoginPage().fillPasswordField().sendKeys(TestData.GmailPass);
    }

    @Then("click on LogIn Button Red")
    public void clickOnLogInButtonRed() {
        getLoginPage().clickLoginBtn().click();
    }
}
