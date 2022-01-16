package Pages;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
AppiumDriver driver;
public static  final long WAIT = 20;

    public PageBase(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
        driver = appiumDriver;
    }
    public void waitForVisibility(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver,WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void clear(MobileElement element){
        waitForVisibility(element);
        element.clear();
    }
    public void click(MobileElement element){
        waitForVisibility(element);
        element.click();
    }
    public void sendText(MobileElement element, String text){
        waitForVisibility(element);
        element.sendKeys(text);
    }
    public String getAttribute(MobileElement element, String text){
        waitForVisibility(element);
        return element.getAttribute(text);
    }
    public void ScrollDown(){
        Dimension dimension =  driver.manage().window().getSize();

        Double scrollHeightStart = dimension.getHeight()*0.5;
        int scrollStart = scrollHeightStart.intValue();

        Double scrollHeightEnd = dimension.getHeight()*0.2;
        int scrollEnd = scrollHeightEnd.intValue();

        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0,scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0,scrollEnd))
                .release().perform();
    }
    public void Tap(){
        Dimension dimension =  driver.manage().window().getSize();

        Double scrollHeightStart = dimension.getHeight()*0.5;
        int scrollStart = scrollHeightStart.intValue();

        Double scrollHeightEnd = dimension.getHeight()*0.2;
        int scrollEnd = scrollHeightEnd.intValue();

        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0,scrollStart))
                .release().perform();
    }
    public void ScrollRight(){
        Dimension dimension =  driver.manage().window().getSize();

        Double scrollHeightStart = dimension.getHeight()*0.5;
        int scrollStart = scrollHeightStart.intValue();

        int scrollWStart = dimension.getWidth();


        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(900,scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0,scrollStart))
                .release().perform();
    }
}
