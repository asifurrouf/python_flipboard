package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlayStorePage {
    private WebDriver driver;

    By GOOGLE_LOGO = By.xpath("//a[@aria-label=\"Google Play Logo\"]");

    public PlayStorePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickGoogle(){
        driver.findElement(GOOGLE_LOGO).click();
    }
}
