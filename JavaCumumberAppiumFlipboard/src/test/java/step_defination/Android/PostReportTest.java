package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class PostReportTest extends Page {

    @Then("Click on Report")
    public void clickOnReport() {
        getPostPage().clickReportPostBtn().click();
    }
}
