package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class AddPeopleTest extends Page {


    @Then("click on Find Friend")
    public void clickOnFindFriend() {
        getProfilePage().clickFindFriend().click();
    }
}
