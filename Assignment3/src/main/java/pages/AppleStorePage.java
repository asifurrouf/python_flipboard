package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppleStorePage {
    private WebDriver driver;
   By APPLE_LOGO = By.id("ac-gn-firstfocus");


    public AppleStorePage(WebDriver driver){
        this.driver = driver;
    }
public void clickApple(){
        driver.findElement(APPLE_LOGO).click();
}

}
