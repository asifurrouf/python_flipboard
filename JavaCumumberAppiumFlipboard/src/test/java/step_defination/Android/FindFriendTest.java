package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;
import pages.utilities.TestData;

public class FindFriendTest extends Page {

    @Given("click on Notification Button")
    public void clickOnNotificationButton() {
        getPostPage().clickNotificationBtn().click();
    }
}
