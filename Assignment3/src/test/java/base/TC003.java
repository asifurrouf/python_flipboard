package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class TC003 {
    @Test
    public void test_log_in_fb(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        homePage.log_IN_FB("tm.qups@gmail.com","greencar");
        driver.quit();
    }
    @Test
    public void test_log_in_google(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        homePage.log_IN_GOOGLE("tm.qups@gmail.com");
        driver.quit();
    }
    @Test
    public void test_log_in_link(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        homePage.log_IN_Link("tm.qups@gmail.com");
        driver.quit();
    }
    @Test
    public void test_log_in_mail(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        homePage.log_IN_mail( "tmqups","01758505391");
        driver.quit();
    }
}
