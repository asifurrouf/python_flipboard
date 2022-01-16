package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestData;

public class PostPage extends PageBase{
    private By likeBtn =By.xpath("(//android.widget.ImageView[@content-desc=\"Like\"])[2]");
    private By moreBtn =By.xpath("(//android.widget.ImageView[@content-desc=\"More\"])[2]");
    private By showLessBtn =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
    private By mutePostBtn =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]");
    private By flipBtn =By.xpath("(//android.widget.ImageView[@content-desc=\"Flip into Magazine\"])[5]");
    private By createMagazineBtn =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
    private By nameYourMagazineField =By.id("flipboard.app:id/create_magazine_title");
    private By descYourMagazineField =By.id("flipboard.app:id/create_magazine_description");
    private By privateBtn =By.id("flipboard.app:id/create_magazine_privacy_toggle");
    private By shareBtn =By.xpath("(//android.widget.ImageView[@content-desc=\"Share\"])[2]");
    private By shareOnFaceBookBtn =By.xpath("//*[@text='News Feed']");
    private By viewOnWebBtn =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]");
    private By copyLinkBtn =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]");
    private By saveImageToDeviceBtn =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]");
    private By reportBtn =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[6]");
    private By sharePostBtn =By.id("flipboard.app:id/menu_share_system");
    private By flipPostBtn =By.id("flipboard.app:id/menu_flip");
    private By likePostBtn =By.id("flipboard.app:id/menu_like");
    private By commentPostBtn =By.id("flipboard.app:id/menu_comment");
    private By readPostBtn =By.id("flipboard.app:id/menu_reader_view_mode");
    private By commentField =By.id("flipboard.app:id/comments_input");
    private By commentBtn =By.id("flipboard.app:id/comments_input");
    private By morePostBtn =By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
    private By morePostSaveImageBtn =By.xpath("//*[@text='Save Image to Device']");
    private By moreOptionBtn =By.id("flipboard.app:id/package_item_action_bar_overflow");
    private By moreOptionViewWebBtn =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
    private By moreOptionPostBtn =By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
    private By showLessPostBtn =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
    private By reportPostBtn =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
    private By followBtn =By.id("flipboard.app:id/follow_button_internal");
    private By searchBtn =By.xpath("//android.widget.ImageView[@content-desc=\"explore\"]");
    private By searchField =By.id("flipboard.app:id/search_box_place_holder");
    private By searchField2 =By.id("flipboard.app:id/search_view_input");
    private By notificationBtn =By.xpath("//android.widget.ImageView[@content-desc=\"Notifications\"]");
    private By acceptAllCookies =By.xpath("//*[@text='Accept All Cookies']");
    private By profileIcon =By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]");

    public PostPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    public void clickLikeBtn(){
        driver.findElement(likeBtn).click();
    }
    public void clickMoreBtn(){
        driver.findElement(moreBtn).click();
    }
    public void clickShowLessBtn(){
        driver.findElement(showLessBtn).click();
    }
    public void clickMutePostBtn(){
        driver.findElement(mutePostBtn).click();
    }
    public void clickFlipBtn(){
        driver.findElement(flipBtn).click();
    }
    public void clickCreateMagazineBtn(){
        driver.findElement(createMagazineBtn).click();
    }
    public void fillNameYourMagazineField(){
        driver.findElement(nameYourMagazineField).sendKeys(TestData.TITLE);
    }
    public void fillDescYourMagazineField(){
        driver.findElement(descYourMagazineField).sendKeys(TestData.DESC);
    }
    public void clickPrivateBtn(){
        driver.findElement(privateBtn).click();
    }
    public void clickShareBtn(){
        driver.findElement(shareBtn).click();
    }
    public void clickShareOnFaceBookBtn(){
        driver.findElement(shareOnFaceBookBtn).click();
    }
    public void clickViewOnWebBtn(){
        driver.findElement(viewOnWebBtn).click();
    }
    public void clickCopyLinkBtn(){
        driver.findElement(copyLinkBtn).click();
    }
    public void clickSaveImageToDeviceBtn(){
        driver.findElement(saveImageToDeviceBtn).click();
    }
    public void clickReportBtn(){
        driver.findElement(reportBtn).click();
    }
    public void clickSharePostBtn(){
        driver.findElement(sharePostBtn).click();
    }
    public void clickFlipPostBtn(){
        driver.findElement(flipPostBtn).click();
    }
    public void clickLikePostBtn(){
        driver.findElement(likePostBtn).click();
    }
    public void clickCommentPostBtn(){
        driver.findElement(commentPostBtn).click();
    }
    public void clickReadPostBtn(){
        driver.findElement(readPostBtn).click();
    }
    public void FillCommentField(){
        driver.findElement(commentField).sendKeys(TestData.Comment);
    }
    public void clickCommentBtn(){
        driver.findElement(commentBtn).click();
    }
    public void clickMorePostBtn(){
        driver.findElement(morePostBtn).click();
    }
    public void clickMorePostSaveImageBtn(){
        driver.findElement(morePostSaveImageBtn).click();
    }
    public void clickmoreOptionBtn(){
        driver.findElement(moreOptionBtn).click();
    }
    public void clickMoreOptionViewWebBtn(){
        driver.findElement(moreOptionViewWebBtn).click();
    }
    public void clickMoreOptionPostBtn(){
        driver.findElement(moreOptionPostBtn).click();
    }
    public void clickShowLessPostBtn(){
        driver.findElement(showLessPostBtn).click();
    }
    public void clickReportPostBtn(){
        driver.findElement(reportPostBtn).click();
    }
    public void clickFollowBtn(){
        driver.findElement(followBtn).click();
    }
    public void clickSearchBtn(){
        driver.findElement(searchBtn).click();
    }
    public void clickSearchField(){
        driver.findElement(searchField).click();
    }
    public void FillSearchField(){
        driver.findElement(searchField2).sendKeys(TestData.Search);
        driver.findElement(searchField2).sendKeys(String.valueOf(Keys.ENTER));
    }
    public void clickNotificationBtn(){
        driver.findElement(notificationBtn).click();
    }
    public void clickacceptAllCookies(){
        driver.findElement(acceptAllCookies).click();
    }
    public void clickProfileIcon(){
        driver.findElement(profileIcon).click();
    }

}
