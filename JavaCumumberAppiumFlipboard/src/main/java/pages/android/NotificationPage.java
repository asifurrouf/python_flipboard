package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class NotificationPage {
    public String findFriendBtn ="flipboard.app:id/find_friends_button";

    public NotificationPage(Page page) {

    }

    public WebElement clickFindFriendBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(findFriendBtn));
    }
}
