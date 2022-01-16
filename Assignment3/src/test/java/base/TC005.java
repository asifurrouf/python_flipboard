package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.DailyEditionPage;
import pages.HomeDecor;
import pages.HomePage;

public class TC005 {
    @Test
    public void test_for_you(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        homePage.go_ForYou( "tmqups","01758505391");
    }
    @Test
    public void test_cyber_monday(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/@holidaycentral/cyber-monday-3oaim4rhz");
        HomePage homePage = new HomePage(driver);
    }
    @Test
    public void test_daily_edition(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/@news/the-daily-edition-3adc9613z");
        //DailyEditionPage dailyEditionPage = new DailyEditionPage(driver);
        
    }
    @Test
    public void test_home_decor(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/topic/homedecor");
        //HomeDecor homeDecor = new HomeDecor(driver);
        driver.quit();
    }
    @Test
    public void test_entertainment(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/topic/entertainment");
        //HomeDecor homeDecor = new HomeDecor(driver);
        driver.quit();
    }
    @Test
    public void test_edit_favorites(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipboard.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        homePage.go_edit_favorites("tmqups","01758505391");
    }

}
