package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class GetStartedPage {
    public String getStartedBtn= "flipboard.app:id/first_launch_cover_continue";


    public GetStartedPage(Page page){

    }

    public WebElement getStartedBtn() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(getStartedBtn));
    }
}
