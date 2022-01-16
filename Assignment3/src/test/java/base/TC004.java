package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AppleStorePage;
import pages.HomePage;
import pages.PlayStorePage;

public class TC004 {
    @Test
    public void test_AppStorePage(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://apps.apple.com/us/app/flipboard-latest-stories/id358801284#?platform=iphone");
        AppleStorePage appleStorePage = new AppleStorePage(driver);
        appleStorePage.clickApple();
        driver.quit();
    }
    @Test
    public void test_PlayStorePage(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://play.google.com/store/apps/details?gl=US&hl=en_US&id=flipboard.app&referrer=adjust_reftag%3DcoQXl1hEo8aPp%26utm_source%3DDesktop%2BBanner%2BAndroid");
        PlayStorePage playStorePage = new PlayStorePage(driver);
        playStorePage.clickGoogle();

    }
}
