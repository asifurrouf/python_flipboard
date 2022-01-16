package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


public class ProfilePage extends PageBase{

    private By historyBtn =By.id("flipboard.app:id/profile_page_header_history");
    private By shareBtn =By.id("flipboard.app:id/profile_page_header_share_profile");
    private By findFriend =By.id("flipboard.app:id/profile_page_header_find_friends");
    private By settingsBtn =By.id("flipboard.app:id/profile_page_header_settings");
    private By floatActionBtn =By.id("flipboard.app:id/magazine_grid_floating_action_button");

    public ProfilePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    public void clickHistoryBtn(){
        driver.findElement(historyBtn).click();
    }
    public void clickShareBtn(){
        driver.findElement(shareBtn).click();
    }
    public void clickFindFriend(){
        driver.findElement(findFriend).click();
    }
    public void clickSettingsBtn(){
        driver.findElement(settingsBtn).click();
    }
    public void clickFloatActionBtn(){
        driver.findElement(floatActionBtn).click();
    }
}
