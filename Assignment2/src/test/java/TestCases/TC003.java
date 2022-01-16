package TestCases;

import Pages.GetStartedPage;
import Pages.LoginPage;
import Pages.TopicPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC003 extends TestBase{
    TopicPage topicPage;
    GetStartedPage getStartedPage;
    LoginPage loginPage;

    @BeforeTest
    public void beforeTests() throws MalformedURLException, InterruptedException {
        Android_setUp();
        getStartedPage = new GetStartedPage(driver);
        getStartedPage.clickGetStartedBtn();
        topicPage = new TopicPage(driver);
        Thread.sleep(3000);
        topicPage.clickLoginBtn();
    }
    @Test
    public void test_loginByMail() throws MalformedURLException, InterruptedException {
        loginPage = new LoginPage(driver);
        Thread.sleep(3000);
        loginPage.clickLoginMailBtn();
        Thread.sleep(1000);
        loginPage.clickGmailAccount();
        Thread.sleep(1000);
        loginPage.fillPasswordField();
        Thread.sleep(1000);
        loginPage.clickLoginBtn();
        tearDown();
    }
    @Test
    public void test_loginByGoogle() throws MalformedURLException, InterruptedException {
        loginPage = new LoginPage(driver);
        Thread.sleep(1000);
        loginPage.clickLoginGoogleBtn();
        Thread.sleep(1000);
        loginPage.clickGmailAccount();
        Thread.sleep(1000);
        loginPage.ScrollDown();
        Thread.sleep(1000);
        loginPage.ScrollDown();
        Thread.sleep(1000);
        tearDown();
    }
    @Test
    public void test_loginByFaceBook() throws MalformedURLException, InterruptedException {
        loginPage = new LoginPage(driver);
        Thread.sleep(1000);
        loginPage.clickLoginFacebookBtn();
        Thread.sleep(1000);
        tearDown();
    }
    @Test
    public void test_loginByTweeter() throws MalformedURLException, InterruptedException {
        loginPage = new LoginPage(driver);
        Thread.sleep(1000);
        loginPage.clickLoginTwitterBtn();
        Thread.sleep(1000);
        tearDown();
    }


}
