package Pages;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import utilities.TestData;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class LoginPage extends PageBase{
    private By loginMailBtn= By.id("flipboard.app:id/account_login_email_button");
    private By loginGoogleBtn= By.id("flipboard.app:id/account_login_google_button");
    private By loginFacebookBtn= By.id("flipboard.app:id/account_login_facebook_button");
    private By loginTwitterBtn= By.id("flipboard.app:id/account_login_twitter_button");
    private By gmailAccount= By.xpath("//*[@text='tm.qups@gmail.com']");
    private By passwordField= By.id("flipboard.app:id/account_login_password");
    private By loginBtn= By.id("flipboard.app:id/account_login_email_next_button");
    private By loginAllowBtn= By.xpath("//*[@text='Allow']");
    private By fbContinueBtn= By.xpath("//*[@text='Continue']");
    private By tweeterCancelBtn= By.id("cancel");
    private By loginSkipBtn= By.xpath("//*[@text='Skip for Now']");

    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickLoginMailBtn(){
        driver.findElement(loginMailBtn).click();
    }

    public void clickLoginGoogleBtn(){
        driver.findElement(loginGoogleBtn).click();
    }

    public void clickLoginFacebookBtn(){
        driver.findElement(loginFacebookBtn).click();
    }

    public void clickLoginTwitterBtn(){
        driver.findElement(loginTwitterBtn).click();
    }

    public void clickGmailAccount(){
        driver.findElement(gmailAccount).click();
    }

    public void fillPasswordField(){
        driver.findElement(passwordField).sendKeys(TestData.GmailPass);
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public void clickLoginAllowBtn() {
        driver.findElement(loginAllowBtn).click();
    }

    public void clickFbContinueBtn() {
        driver.findElement(fbContinueBtn).click();
    }

    public void clickTweeterCancelBtn() {
        driver.findElement(tweeterCancelBtn).click();
    }

    public void clickLoginSkipBtn() {
        driver.findElement(loginSkipBtn).click();
    }
}
