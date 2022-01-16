package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TC002 {
    @Test
    public void test_sign_up_mail(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickSignUp();
        homePage.typeEmail("tm.qups@gmail.com");
        homePage.typeName("TM QUPS");
        homePage.typePassword("01758505391");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        homePage.clickContinue();
        driver.quit();
   }
   @Test
   public void test_sign_up_fb(){
       System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://flipboard.com/");
       HomePage homePage = new HomePage(driver);
       homePage.clickSignUp();
       homePage.facebookLogin("tm.qups@gmail.com","greencar");
       driver.quit();
   }
}
