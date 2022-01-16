package pages.android;
import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;


public class LoginPage{
    public String loginMailBtn= "flipboard.app:id/account_login_email_button";
    public String loginGoogleBtn= "flipboard.app:id/account_login_google_button";
    public String loginFacebookBtn= "flipboard.app:id/account_login_facebook_button";
    public String loginTwitterBtn= "flipboard.app:id/account_login_twitter_button";
    public String gmailAccount= "//*[@text='tm.qups@gmail.com']";
    public String passwordField= "flipboard.app:id/account_login_password";
    public String loginBtn= "flipboard.app:id/account_login_email_next_button";
    public String loginAllowBtn= "//*[@text='Allow']";
    public String fbContinueBtn= "//*[@text='Continue']";
    public String tweeterCancelBtn= "cancel";
    public String loginSkipBtn= "//*[@text='Skip for Now']";

    public LoginPage(Page page ) {
    }

    public WebElement clickLoginMailBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(loginMailBtn));
    }

    public WebElement clickLoginGoogleBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(loginGoogleBtn));
    }

    public WebElement clickLoginFacebookBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(loginFacebookBtn));
    }

    public WebElement clickLoginTwitterBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(loginTwitterBtn));
    }

    public WebElement clickGmailAccount(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(gmailAccount));
    }

    public WebElement fillPasswordField(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(passwordField));
               // .sendKeys(TestData.GmailPass);
    }

    public WebElement clickLoginBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(loginBtn));
    }

    public WebElement clickLoginAllowBtn() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(loginAllowBtn));
    }

    public WebElement clickFbContinueBtn() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(fbContinueBtn));
    }

    public WebElement clickTweeterCancelBtn() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(tweeterCancelBtn));
    }

    public WebElement clickLoginSkipBtn() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(loginSkipBtn));
    }
}
