package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class ViewOnWebTest extends Page {

    @Then("click on View on web")
    public void clickOnViewOnWeb() {
        getPostPage().clickViewOnWebBtn().click();
    }
}
