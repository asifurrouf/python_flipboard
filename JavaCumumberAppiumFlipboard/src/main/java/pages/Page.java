package pages;

import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.ConfigUtil;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import pages.android.*;

import java.time.Duration;
import java.util.Properties;

public class Page {

    public static Properties myProp = ConfigUtil.getConfig("config");

    GetStartedPage getStartedPage = new GetStartedPage(this);
    protected  GetStartedPage getGetStartedPage(){return getStartedPage;}

    LoginPage loginPage = new LoginPage(this);
    protected  LoginPage getLoginPage(){return loginPage;}

    NotificationPage notificationPage = new NotificationPage(this);
    protected  NotificationPage getNotificationPage(){return notificationPage;}

    ProfilePage profilePage = new ProfilePage(this);
    protected  ProfilePage getProfilePage(){return profilePage;}

    TopicPage topicPage = new TopicPage(this);
    protected  TopicPage getTopicPage(){return topicPage;}

    PostPage postPage = new PostPage(this);
    protected  PostPage getPostPage(){return postPage;}

    public void ScrollDown(){
        Dimension dimension =  AndroidDriverSetup.getAndroidDriver().manage().window().getSize();

        Double scrollHeightStart = dimension.getHeight()*0.7;
        int scrollStart = scrollHeightStart.intValue();

        Double scrollHeightEnd = dimension.getHeight()*0.1;
        int scrollEnd = scrollHeightEnd.intValue();

        new TouchAction((PerformsTouchActions) AndroidDriverSetup.getAndroidDriver())
                .press(PointOption.point(0,scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0,scrollEnd))
                .release().perform();
    }
    public void Tap(){
        Dimension dimension =  AndroidDriverSetup.getAndroidDriver().manage().window().getSize();

        Double scrollHeightStart = dimension.getHeight()*0.5;
        int scrollStart = scrollHeightStart.intValue();

        Double scrollHeightEnd = dimension.getHeight()*0.2;
        int scrollEnd = scrollHeightEnd.intValue();

        new TouchAction((PerformsTouchActions) AndroidDriverSetup.getAndroidDriver())
                .press(PointOption.point(0,scrollStart))
                .release().perform();
    }
    public void ScrollRight(){
        Dimension dimension =  AndroidDriverSetup.getAndroidDriver().manage().window().getSize();

        Double scrollHeightStart = dimension.getHeight()*0.5;
        int scrollStart = scrollHeightStart.intValue();

        int scrollWStart = dimension.getWidth();


        new TouchAction((PerformsTouchActions) AndroidDriverSetup.getAndroidDriver())
                .press(PointOption.point(900,scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0,scrollStart))
                .release().perform();
    }


}
