package TestCases;

import Pages.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC006 extends TestBase{
    TopicPage topicPage;
    GetStartedPage getStartedPage;
    LoginPage loginPage;
    PostPage postPage;
    NotificationPage notificationPage;
    ProfilePage profilePage;
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
        Thread.sleep(5000);
        loginPage.clickLoginFacebookBtn();

    }
    @Test
    public void test_Home() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollRight();
        Thread.sleep(3000);
        postPage.ScrollRight();
        Thread.sleep(3000);
        postPage.ScrollRight();

    }
    @Test
    public void test_Follow() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollDown();
        Thread.sleep(3000);
        postPage.ScrollDown();
        Thread.sleep(3000);
        postPage.ScrollDown();
        postPage.clickFollowBtn();
        tearDown();
    }
    @Test
    public void test_Search() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.clickSearchBtn();
        postPage.clickSearchField();
        postPage.FillSearchField();
        tearDown();
    }
    @Test
    public void test_Find_friend() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.clickNotificationBtn();
        notificationPage = new NotificationPage(driver);
        Thread.sleep(9000);
       // notificationPage.clickFindFriendBtn();
        tearDown();
    }
    @Test
    public void test_Profile() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.clickProfileIcon();
        Thread.sleep(9000);
        tearDown();
    }
    @Test
    public void test_History() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.clickProfileIcon();
        profilePage=new ProfilePage(driver);
        Thread.sleep(5000);
        profilePage.clickHistoryBtn();
        tearDown();
    }
    @Test
    public void test_Share() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.clickProfileIcon();
        profilePage=new ProfilePage(driver);
        Thread.sleep(5000);
        profilePage.clickShareBtn();
        tearDown();
    }
    @Test
    public void test_AddPeople() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.clickProfileIcon();
        profilePage=new ProfilePage(driver);
        Thread.sleep(5000);
        profilePage.clickFindFriend();
        tearDown();
    }
    @Test
    public void test_Settings() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.clickProfileIcon();
        profilePage=new ProfilePage(driver);
        Thread.sleep(5000);
        profilePage.clickSettingsBtn();
        tearDown();
    }
    @Test
    public void test_Other() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.clickProfileIcon();
        profilePage=new ProfilePage(driver);
        Thread.sleep(5000);
        profilePage.clickFloatActionBtn();
        tearDown();
    }
}
