package step_defination.Android;

import io.cucumber.java.en.Given;
import pages.Page;

public class GetStartedTest extends Page {

    @Given("click getStarted")
    public void clickGetStarted() {
        getGetStartedPage().getStartedBtn().click();
    }
}
