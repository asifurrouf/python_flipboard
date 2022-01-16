package TestCases;

import Pages.GetStartedPage;
import Pages.LoginPage;
import Pages.PostPage;
import Pages.TopicPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC004 extends TestBase{
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
    }
    @Test
    public void test_Like() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollDown();
        Thread.sleep(3000);
        postPage.clickLikeBtn();
        tearDown();
    }
    @Test
    public void test_LessHeart() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollDown();
        Thread.sleep(3000);
        postPage.clickMoreBtn();
        Thread.sleep(1000);
        postPage.clickShowLessBtn();
        tearDown();
    }

    @Test
    public void test_Mute_Post() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollDown();
        Thread.sleep(1000);
        postPage.clickMoreBtn();
        Thread.sleep(1000);
        postPage.clickMutePostBtn();
        tearDown();
    }

    @Test
    public void test_Flip() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollDown();
        Thread.sleep(1000);
        postPage.clickFlipBtn();
        Thread.sleep(1000);
        postPage.clickCreateMagazineBtn();
        Thread.sleep(1000);
        postPage.fillNameYourMagazineField();
        Thread.sleep(1000);
        postPage.fillDescYourMagazineField();
        Thread.sleep(1000);
        postPage.clickPrivateBtn();
        tearDown();
    }
    @Test
    public void test_Share() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollDown();
        Thread.sleep(1000);
        postPage.clickShareBtn();
        Thread.sleep(1000);
        postPage.clickShareOnFaceBookBtn();
        tearDown();
    }

    @Test
    public void test_View_On_Web() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollDown();
        Thread.sleep(1000);
        postPage.clickMoreBtn();
        Thread.sleep(1000);
        postPage.clickViewOnWebBtn();
        tearDown();
    }
    @Test
    public void test_copy_link() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollDown();
        Thread.sleep(1000);
        postPage.clickMoreBtn();
        Thread.sleep(1000);
        postPage.clickCopyLinkBtn();
        tearDown();
    }
    @Test
    public void test_Save_Image() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollDown();
        Thread.sleep(1000);
        postPage.clickMoreBtn();
        Thread.sleep(1000);
        postPage.clickSaveImageToDeviceBtn();
        tearDown();
    }
    @Test
    public void test_Report() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollDown();
        Thread.sleep(1000);
        postPage.clickMoreBtn();
        Thread.sleep(1000);
        postPage.clickReportBtn();
        tearDown();
    }
}
