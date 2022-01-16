package TestCases;

import Pages.GetStartedPage;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TC001 extends TestBase{
    GetStartedPage getStartedPage;


    @Test
    public void test_get_started() throws MalformedURLException{
        Android_setUp();
        getStartedPage = new GetStartedPage(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        getStartedPage.clickGetStartedBtn();
        tearDown();
    }
}
