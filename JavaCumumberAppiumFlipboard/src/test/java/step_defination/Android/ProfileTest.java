package step_defination.Android;

import io.cucumber.java.en.Given;
import pages.Page;

public class ProfileTest extends Page {

    @Given("click on Profile Button")
    public void clickOnProfileButton() {
        getPostPage().clickProfileIcon().click();
    }
}
