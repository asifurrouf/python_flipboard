package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CyberMondayPage {
    private WebDriver driver;

   By CYBER_MONDAY = By.xpath("//span [@class=\"breadcrumbs__label css-uhxo7j e1lqgzim1 internal-link\"]");

    public CyberMondayPage(WebDriver driver){
        this.driver = driver;
    }

}
