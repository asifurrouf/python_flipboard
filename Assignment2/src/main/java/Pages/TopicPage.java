package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.awt.*;

public class TopicPage extends PageBase{
    private By newsTopicBtn= By.xpath("//*[@text='# NEWS']");
    private By technologyTopicBtn= By.xpath("//*[@text='# TECHNOLOGY']");
    private By sportsTopicBtn= By.xpath("//*[@text='# SPORTS']");
    private By continueBtn= By.id("flipboard.app:id/topic_picker_continue_button");
    private By loginBtn= By.id("flipboard.app:id/topic_picker_login_button");

    public TopicPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickNewsTopicBtn(){
        driver.findElement(newsTopicBtn).click();

    }

    public void clickTechnologyTopicBtn(){
        driver.findElement(technologyTopicBtn).click();
    }


    public void clickSportsTopicBtn(){
        driver.findElement(sportsTopicBtn).click();

    }

    public void clickContinueBtn(){
        driver.findElement(continueBtn).click();
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();

    }




}
