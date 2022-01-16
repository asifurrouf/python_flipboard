package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class GetStartedPage extends PageBase{
    private By getStartedBtn= By.id("flipboard.app:id/first_launch_cover_continue");

    public GetStartedPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    public void clickGetStartedBtn(){
        driver.findElement(getStartedBtn).click();
    }

}
