package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class ReportTest extends Page {

    @Then("click on Report")
    public void clickOnReport() {
        getPostPage().clickReportBtn().click();
    }
}
