package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

import java.awt.*;

public class TopicPage{
    private By newsTopicBtn= By.xpath("//*[@text='# NEWS']");
    private By technologyTopicBtn= By.xpath("//*[@text='# TECHNOLOGY']");
    private By sportsTopicBtn= By.xpath("//*[@text='# SPORTS']");
    private By continueBtn= By.id("flipboard.app:id/topic_picker_continue_button");
    private By loginBtn= By.id("flipboard.app:id/topic_picker_login_button");

    public TopicPage(Page page) {

    }

    public WebElement clickNewsTopicBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(newsTopicBtn);

    }

    public WebElement clickTechnologyTopicBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(technologyTopicBtn);
    }


    public WebElement clickSportsTopicBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(sportsTopicBtn);

    }

    public WebElement clickContinueBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(continueBtn);
    }

    public WebElement clickLoginBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(loginBtn);

    }




}
