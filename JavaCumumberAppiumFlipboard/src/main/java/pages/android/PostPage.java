package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;


public class PostPage {
    public String likeBtn = "(//android.widget.ImageView[@content-desc=\"Like\"])[2]";
    public String likeBtn2 = "//*[@text='Like']";
    public String moreBtn = "(//android.widget.ImageView[@content-desc=\"More\"])[2]";
    public String showLessBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView";
    public String mutePostBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]";
    public String flipBtn = "(//android.widget.ImageView[@content-desc=\"Flip into Magazine\"])[5]";
    public String flipBtn2 = "//*[@text='Flip into Magazine']";
    public String createMagazineBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]";
    public String createMagazineBtn2 = "//*[@text='Create new magazine']";
    public String nameYourMagazineField = "flipboard.app:id/create_magazine_title";
    public String descYourMagazineField = "flipboard.app:id/create_magazine_description";
    public String privateBtn = "flipboard.app:id/create_magazine_privacy_toggle";
    public String shareBtn = "(//android.widget.ImageView[@content-desc=\"Share\"])[2]";
    public String shareBtn2 = "//*[@text='Share']";
    public String shareOnFaceBookBtn ="//*[@text='News Feed']";
    public String viewOnWebBtn = "//*[@text='View on Web']";
    public String copyLinkBtn = "//*[@text='Copy link']";
    public String saveImageToDeviceBtn = "//*[@text='Save Image to Device']";
    public String reportBtn = "//*[@text='Report']";
    public String sharePostBtn = "flipboard.app:id/menu_share_system";
    public String flipPostBtn = "flipboard.app:id/menu_flip";
    public String likePostBtn ="flipboard.app:id/menu_like";
    public String commentPostBtn ="flipboard.app:id/menu_comment";
    public String readPostBtn ="flipboard.app:id/menu_reader_view_mode";
    public String commentField ="flipboard.app:id/comments_input";
    public String commentBtn ="flipboard.app:id/comments_input";
    public String morePostBtn ="//android.widget.ImageView[@content-desc=\"More options\"]";
    public String morePostSaveImageBtn ="//*[@text='Save Image to Device']";
    public String moreOptionBtn ="flipboard.app:id/package_item_action_bar_overflow";
    public String moreOptionViewWebBtn ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView";
    public String moreOptionPostBtn ="//android.widget.ImageView[@content-desc=\"More options\"]";
    public String showLessPostBtn ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView";
    public String reportPostBtn ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView";
    public String followBtn ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ViewFlipper/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.ViewFlipper/android.widget.TextView";
    public String searchBtn ="//android.widget.ImageView[@content-desc=\"explore\"]";
    public String searchField ="flipboard.app:id/search_box_place_holder";
    public String searchField2 ="flipboard.app:id/search_view_input";
    public String notificationBtn ="//android.widget.ImageView[@content-desc=\"Notifications\"]";
    public String acceptAllCookies ="//*[@text='Accept All Cookies']";
    public String profileIcon ="//android.widget.ImageView[@content-desc=\"Profile\"]";
    public String moreBtn2 ="//android.widget.ImageView[@content-desc=\"More\"]";
    public String PostMoreBtn ="flipboard.app:id/package_item_action_bar_overflow";
    public String DailyEdition ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ViewFlipper/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]";

    public PostPage(Page page) {

    }
    public WebElement clickLikeBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(likeBtn));
    }
    public WebElement clickLikeBtn2(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(likeBtn2));
    }
    public WebElement clickMoreBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(moreBtn));
    }
    public WebElement clickShowLessBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(showLessBtn));
    }
    public WebElement clickMutePostBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(mutePostBtn));
    }
    public WebElement clickFlipBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(flipBtn));
    }
    public WebElement clickFlipBtn2(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(flipBtn2));
    }
    public WebElement clickCreateMagazineBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(createMagazineBtn));
    }
    public WebElement clickCreateMagazineBtn2(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(createMagazineBtn2));
    }
    public WebElement fillNameYourMagazineField(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(nameYourMagazineField));
        //.sendKeys(TestData.TITLE);
    }
    public WebElement fillDescYourMagazineField(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(descYourMagazineField));
        //.sendKeys(TestData.DESC);
    }
    public WebElement clickPrivateBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(privateBtn));
    }
    public WebElement clickShareBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(shareBtn));
    }
    public WebElement clickShareBtn2(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(shareBtn2));
    }
    public WebElement clickShareOnFaceBookBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(shareOnFaceBookBtn));
    }
    public WebElement clickViewOnWebBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(viewOnWebBtn));
    }
    public WebElement clickCopyLinkBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(copyLinkBtn));
    }
    public WebElement clickSaveImageToDeviceBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(saveImageToDeviceBtn));
    }
    public WebElement clickReportBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(reportBtn));
    }
    public WebElement clickSharePostBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(sharePostBtn));
    }
    public WebElement clickFlipPostBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(flipPostBtn));
    }
    public WebElement clickLikePostBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(likePostBtn));
    }
    public WebElement clickCommentPostBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(commentPostBtn));
    }
    public WebElement clickReadPostBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(readPostBtn));
    }
    public WebElement FillCommentField(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(commentField));
        //.sendKeys(TestData.Comment);
    }
    public WebElement clickCommentBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(commentBtn));
    }
    public WebElement clickMorePostBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(morePostBtn));
    }
    public WebElement clickMorePostSaveImageBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(morePostSaveImageBtn));
    }
    public WebElement clickMoreOptionBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(moreOptionBtn));
    }
    public WebElement clickMoreOptionViewWebBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(moreOptionViewWebBtn));
    }
    public WebElement clickMoreOptionPostBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(moreOptionPostBtn));
    }
    public WebElement clickShowLessPostBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(showLessPostBtn));
    }
    public WebElement clickReportPostBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(reportPostBtn));
    }
    public WebElement clickFollowBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(followBtn));
    }
    public WebElement clickSearchBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(searchBtn));
    }
    public WebElement clickSearchField(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(searchField));
    }
    public WebElement FillSearchField(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(searchField2));
        //.sendKeys(TestData.Search);

       // return AndroidDriverSetup.getAndroidDriver().findElement(searchField2).sendKeys(String.valueOf(Keys.ENTER));
    }
    public WebElement clickNotificationBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(notificationBtn));
    }
    public WebElement clickacceptAllCookies(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(acceptAllCookies));
    }
    public WebElement clickProfileIcon(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(profileIcon));
    }
    public WebElement clickMoreBtn2(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(moreBtn2));
    }

    public WebElement clickPostMoreBtn(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(PostMoreBtn));
    }
    public WebElement clickDailyEdition(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(DailyEdition));
    }

}
