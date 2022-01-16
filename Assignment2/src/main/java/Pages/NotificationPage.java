package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class NotificationPage extends PageBase{
    private By findFriendBtn =By.id("flipboard.app:id/find_friends_button");

    public NotificationPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickFindFriendBtn(){
        driver.findElement(findFriendBtn).click();
    }
}
