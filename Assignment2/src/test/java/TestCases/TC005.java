package TestCases;

import Pages.GetStartedPage;
import Pages.LoginPage;
import Pages.PostPage;
import Pages.TopicPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TC005 extends TestBase{
    TopicPage topicPage;
    GetStartedPage getStartedPage;
    LoginPage loginPage;
    PostPage postPage;

    @BeforeTest
    public void beforeTests() throws MalformedURLException, InterruptedException {
        Android_setUp();
        getStartedPage = new GetStartedPage(driver);
        getStartedPage.clickGetStartedBtn();
        topicPage = new TopicPage(driver);
        Thread.sleep(1000);
        topicPage.clickSportsTopicBtn();
        topicPage.clickTechnologyTopicBtn();
        topicPage.clickNewsTopicBtn();
        topicPage.clickContinueBtn();
        loginPage = new LoginPage(driver);
        Thread.sleep(3000);
        loginPage.clickLoginFacebookBtn();
        loginPage.ScrollRight();
    }

    @Test
    public void test_share() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollRight();
        Thread.sleep(3000);
        postPage.Tap();
        Thread.sleep(3000);
        postPage.Tap();
        postPage.clickSharePostBtn();
        postPage.clickShareOnFaceBookBtn();
        tearDown();
    }

    @Test
    public void test_Flip() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollRight();
        Thread.sleep(3000);
        postPage.Tap();
        Thread.sleep(3000);
        postPage.Tap();
        postPage.clickFlipPostBtn();
        postPage.clickCreateMagazineBtn();
        postPage.fillNameYourMagazineField();
        postPage.fillDescYourMagazineField();
        postPage.clickPrivateBtn();
        tearDown();
    }
    @Test
    public void test_Like() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollRight();
        Thread.sleep(3000);
        postPage.Tap();
        Thread.sleep(3000);
        postPage.Tap();
        postPage.clickLikePostBtn();

        tearDown();
    }
    @Test
    public void test_Comment() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollRight();
        Thread.sleep(3000);
        postPage.Tap();
        Thread.sleep(3000);
        postPage.Tap();
        postPage.clickCommentPostBtn();
        postPage.clickCommentBtn();
        postPage.FillCommentField();
        tearDown();
    }
    @Test
    public void test_Read_view() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollRight();
        Thread.sleep(3000);
        postPage.Tap();
        Thread.sleep(3000);
        postPage.Tap();
        Thread.sleep(10000);
        postPage.clickReadPostBtn();
        tearDown();
    }
    @Test
    public void test_Save_Image() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollRight();
        Thread.sleep(3000);
        postPage.Tap();
        Thread.sleep(3000);
        postPage.Tap();
        Thread.sleep(3000);
        postPage.clickMorePostBtn();
        Thread.sleep(1000);
        postPage.clickMorePostSaveImageBtn();

        tearDown();
    }
    @Test
    public void test_View_Web() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollRight();
        Thread.sleep(3000);
        postPage.Tap();
        Thread.sleep(5000);
        postPage.Tap();
        Thread.sleep(5000);
        postPage.clickacceptAllCookies();
        Thread.sleep(3000);
        postPage.clickMoreOptionPostBtn();
        Thread.sleep(1000);
        postPage.clickMoreOptionViewWebBtn();

        tearDown();
    }
    @Test
    public void test_Show_Less() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollRight();
        Thread.sleep(3000);
        postPage.Tap();
        Thread.sleep(5000);
        postPage.Tap();
        Thread.sleep(5000);
        postPage.clickacceptAllCookies();
        Thread.sleep(3000);
        postPage.clickMoreOptionPostBtn();
        Thread.sleep(1000);
        postPage.clickShowLessPostBtn();
        tearDown();
    }
    @Test
    public void test_Report() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollRight();
        Thread.sleep(3000);
        postPage.Tap();
        Thread.sleep(5000);
        postPage.Tap();
        Thread.sleep(5000);
        postPage.clickacceptAllCookies();
        Thread.sleep(3000);
        postPage.clickMoreOptionPostBtn();
        Thread.sleep(1000);
        postPage.clickReportPostBtn();
        tearDown();
    }

}
