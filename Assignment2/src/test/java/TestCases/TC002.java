package TestCases;

import Pages.GetStartedPage;
import Pages.TopicPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC002 extends TestBase{
    TopicPage topicPage;
    GetStartedPage getStartedPage;

    @BeforeTest
    public void beforeTests() throws  MalformedURLException{
        Android_setUp();
        getStartedPage = new GetStartedPage(driver);
        getStartedPage.clickGetStartedBtn();
    }

    @Test
    public void test_topic() throws MalformedURLException {
        topicPage = new TopicPage(driver);
        topicPage.clickSportsTopicBtn();
        topicPage.clickTechnologyTopicBtn();
        topicPage.clickNewsTopicBtn();
        topicPage.clickContinueBtn();
        tearDown();
    }
}
