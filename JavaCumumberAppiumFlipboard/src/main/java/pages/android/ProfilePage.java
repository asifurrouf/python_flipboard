package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;


public class ProfilePage {

    public String historyBtn ="flipboard.app:id/profile_page_header_history";
    public String shareBtn ="flipboard.app:id/profile_page_header_share_profile";
    public String findFriend ="flipboard.app:id/profile_page_header_find_friends";
    public String settingsBtn ="flipboard.app:id/profile_page_header_settings";
    public String floatActionBtn ="flipboard.app:id/magazine_grid_floating_action_button";

    public ProfilePage(Page page) {

    }
    public WebElement clickHistoryBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(historyBtn));
    }
    public WebElement clickShareBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(shareBtn));
    }
    public WebElement clickFindFriend(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(findFriend));
    }
    public WebElement clickSettingsBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(settingsBtn));
    }
    public WebElement clickFloatActionBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(floatActionBtn));
    }
}
