package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class TC006 {
    @Test
    public void test_share_facebook(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        homePage.do_share_on_fb("tm.qups@gmail.com","greencar");
        driver.quit();
    }
    @Test
    public void test_share_tw(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        homePage.do_share_on_tw("tm.qups@gmail.com","greencar");
        driver.quit();
    }
    @Test
    public void test_share_link(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        homePage.do_share_on_link("tm.qups@gmail.com","greencar");
        driver.quit();
    }
    @Test
    public void test_search_magazine(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        homePage.do_search_magazine("tm.qups@gmail.com","greencar");
        driver.quit();
    }
    @Test
    public void test_create_magazine(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        homePage.do_create_magazine("tm.qups@gmail.com","greencar");
        driver.quit();
    }
    @Test
    public void test_add_comment(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        homePage.do_add_comment("tm.qups@gmail.com","greencar");
        driver.quit();
    }
    

}
