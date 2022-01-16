package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;
import java.util.Iterator;
import java.util.Set;

public class HomePage {
    private WebDriver driver;
    By SIGNUP_BUTTON = By.xpath("//div//button[@data-vars-button-name=\"main-nav-signup-cta\"]");
    By EMAIL_FIELD = By.xpath("//input[@type=\"email\"]");
    By NAME_FIELD = By.xpath("//input[@type=\"text\"]");
    By PASSWORD_FIELD = By.xpath("//input[@type=\"password\"]");
    By CONTINUE_BUTTON = By.xpath("//button[@type=\"submit\"]");
    By FB_BUTTON = By.xpath("//div[@class=\"signup__social-buttons-wrapper\"]");
    By FB_ID = By.id("email");
    By FB_Pass = By.id("pass");
    By FB_Log_In = By.id("loginbutton");
    By Log_In = By.xpath("//a[@data-vars-button-name=\"main-nav-login\"]");

    By USERNAME_FIELD = By.name("username");
    By PASSWORD_FIELD2 = By.name("password");
    By SIGNIN_BUTTON = By.xpath("//button[@data-vars-button-name=\"login__form-submit\"]");
    By FB_BUTTON2 = By.xpath("//button[@data-vars-button-name=\"facebook-login\"]");
    By APPLE_BUTTON = By.xpath("//div[@class=\"apple-login__wrapper\"]");
    By GOOGLE_BUTTON = By.xpath("//button[@data-vars-button-name=\"google-login\"]");
    By GetLogInLink = By.xpath("//a[@href=\"/request_login_link\"]");
    By Email = By.xpath("//input[@name=\"email\"]");
    By Send = By.xpath("//button[@type=\"submit\"]");

    By TWITTER_BUTTON = By.xpath("//button[@data-vars-button-name=\"twitter-login\"]");
    By FOR_YOU = By.xpath("//a[@href=\"/\"]//h2[@class=\"favorites-menu__title\"]");
    By CYBER_MONDAY = By.xpath("//h1[@class=\"ui-text--page-title magazine-header__title\"]");
    By FB_ID2 = By.id("email");
    By FB_Pass2 = By.id("pass");
    By FB_Log_In2 = By.id("loginbutton");
    By GMAIL_ID = By.name("identifier");
    By GMAIL_PASS = By.name("password");
    By SCIENCE_INDIA = By.xpath("//a[@href=\"/topic/indianscience\"]");
    By EDIT_FAVORITES = By.xpath("//div[@class=\"favorites-menu__link favorites-menu__edit-favorites ui-text--title\"]");
    By ADD_FAVORITES = By.xpath("//button[@data-vars-button-name=\"manage-favorites-add-favorite\"]");
    By INPUT_FAVORITES = By.xpath("//input");
    By SAVE_FAVORITES = By.xpath("//button[@data-vars-button-name=\"topic-customization-done\"]");
    By TITLE_FAVORITES = By.xpath("//a[@href=\"/topic/indianscience\"]//h2");
    By PROFILE = By.xpath("//button//div//div//picture//img");
    By PROFILE_BUTTON = By.xpath("//a[@href=\"/profile\"]");
    By SHARE_BUTTON = By.xpath("//button[@data-vars-button-name=\"profile-header-share\"]");
    By SHARE_FACEBOOK = By.xpath("//button[@data-vars-button-name=\"share-facebook\"]");
    By SHARE_TW = By.xpath("//button[@data-vars-button-name=\"share-twitter\"]");
    By SHARE_LINK = By.xpath("//input");
    By SEARCH_BOX = By.xpath("//input");
    By SHARE_CANCEL = By.xpath("//button[@data-vars-button-name=\"create-magazine-dismiss\"]");
    By POST_FACEBOOK = By.name("__CONFIRM__");
    By SEARCH_ICON = By.xpath("//div/*[name()=\"svg\"][@aria-labelledby=\"search-icon-title\"]");
    By FOLLOW_ICON = By.xpath("//a[@ href=\"/following\"]/*[name()=\"svg\"]");
    By COMPOSE_ICON = By.xpath("//div/*[name()=\"svg\"][@aria-labelledby=\"flip-compose-icon-title\"]");
    By CREATE_MAGAZINE = By.xpath("//div [@class=\"flip-compose__create-magazine-label\"]");
    By TITLE_MAGAZINE = By.xpath("//input[@name=\"title\"]");
    By DESC_MAGAZINE = By.xpath("//textarea[@ name=\"description\"]");
    By SAVE_MAGAZINE = By.xpath("//button[@data-vars-button-name=\"create-magazine-save\"]");
    By CANCEL_MAGAZINE = By.xpath("//button[@data-vars-button-name=\"flip-compose-cancel\"]");
    By LINK_MAGAZINE = By.xpath("//input[@name=\"flip-compose-flip-url\"]");
    By COMMENT_MAGAZINE = By.xpath("//textarea [@class=\"flip-compose__form-caption\"]");
    By FLIP_BUTTON = By.xpath("//button [@data-vars-button-name=\"flip-compose-submit\"]");
    By Daily_Edition_BUTTON = By.xpath("//a[@class=\"favorites-menu__link ui-text--title internal-link\"][@href=\"/@news/the-daily-edition-3adc9613z\"]");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickSignUp(){
        driver.findElement(SIGNUP_BUTTON).click();
    }
    public void typeEmail(String email){
        driver.findElement(EMAIL_FIELD).sendKeys(email);
    }
    public void typeName(String name){
        driver.findElement(NAME_FIELD).sendKeys(name);
    }
    public void typePassword(String pass){
        driver.findElement(PASSWORD_FIELD).sendKeys(pass);
    }
    public void clickContinue(){
        driver.findElement(CONTINUE_BUTTON).click();
    }
    public void facebookLogin(String user, String pass){
        // It will return the parent window name as a String
        String parent=driver.getWindowHandle();
        driver.findElement(FB_BUTTON).click();
        Set<String> s=driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                driver.findElement(FB_ID).sendKeys(user);
                driver.findElement(FB_Pass).sendKeys(pass);
                driver.findElement(FB_Log_In).click();
                driver.close();
            }
        }
        //switch to the parent window
        driver.switchTo().window(parent);
    }
    public void clickLogin(){
        driver.findElement(Log_In).click();
    }
    public void log_IN_FB(String user, String pass){
        driver.findElement(FB_BUTTON2).click();
        // It will return the parent window name as a String
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                driver.findElement(FB_ID).sendKeys(user);
                driver.findElement(FB_Pass).sendKeys(pass);
                driver.findElement(FB_Log_In).click();
            }
        }
        //switch to the parent window
        driver.switchTo().window(parent);
    }
    public void log_IN_GOOGLE(String user){
        driver.findElement(GOOGLE_BUTTON).click();
        // It will return the parent window name as a String
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                driver.findElement(GMAIL_ID).sendKeys(user);
                driver.findElement(GMAIL_ID).sendKeys(Keys.ENTER);
            }
        }
        //switch to the parent window
        driver.switchTo().window(parent);
    }
    public void log_IN_Link(String mail){
        driver.findElement(GetLogInLink).click();
        driver.findElement(Email).sendKeys(mail);
        driver.findElement(Send).click();
    }
    public void log_IN_mail(String user,String pass){
        driver.findElement(USERNAME_FIELD).sendKeys(user);
        driver.findElement(PASSWORD_FIELD2).sendKeys(pass);
        driver.findElement(SIGNIN_BUTTON).click();
    }
    public void go_ForYou(String user,String pass){
        driver.findElement(USERNAME_FIELD).sendKeys(user);
        driver.findElement(PASSWORD_FIELD2).sendKeys(pass);
        driver.findElement(SIGNIN_BUTTON).click();
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    public void go_the_daily_edition(String user,String pass){
        driver.findElement(USERNAME_FIELD).sendKeys(user);
        driver.findElement(PASSWORD_FIELD2).sendKeys(pass);
        driver.findElement(SIGNIN_BUTTON).click();
        driver.findElement(Daily_Edition_BUTTON).click();
    }
    public void go_edit_favorites(String user ,String pass){
        driver.findElement(USERNAME_FIELD).sendKeys(user);
        driver.findElement(PASSWORD_FIELD2).sendKeys(pass);
        driver.findElement(SIGNIN_BUTTON).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(EDIT_FAVORITES).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(ADD_FAVORITES).click();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(INPUT_FAVORITES).sendKeys("SCIENCE(INDIA)");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(SCIENCE_INDIA).click();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(SAVE_FAVORITES).click();
    }
    public  void do_share_on_fb(String user, String pass){
        driver.findElement(FB_BUTTON2).click();
        // It will return the parent window name as a String
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                driver.findElement(FB_ID).sendKeys(user);
                driver.findElement(FB_Pass).sendKeys(pass);
                driver.findElement(FB_Log_In2).click();
                try
                {
                    Thread.sleep(5000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
            }
        }
        //switch to the parent window
        driver.switchTo().window(parent);
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(PROFILE).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(PROFILE_BUTTON).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(SHARE_BUTTON).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(SHARE_FACEBOOK).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        String parent2=driver.getWindowHandle();
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> I2= tabs.iterator();
        while(I2.hasNext()){
            String child_window=I2.next();
            if(!parent2.equals(child_window))
            {
                driver.switchTo().window(child_window);
                try
                {
                    Thread.sleep(2000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                driver.findElement(POST_FACEBOOK).click();

            }
        }
        driver.switchTo().window(parent2);
    }

    public  void do_share_on_tw(String user, String pass){
        driver.findElement(FB_BUTTON2).click();
        // It will return the parent window name as a String
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                driver.findElement(FB_ID).sendKeys(user);
                driver.findElement(FB_Pass).sendKeys(pass);
                driver.findElement(FB_Log_In2).click();
                try
                {
                    Thread.sleep(5000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
            }
        }
        //switch to the parent window
        driver.switchTo().window(parent);
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(PROFILE).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(PROFILE_BUTTON).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(SHARE_BUTTON).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(SHARE_TW).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        String parent2=driver.getWindowHandle();
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> I2= tabs.iterator();
        while(I2.hasNext()){
            String child_window=I2.next();
            if(!parent2.equals(child_window))
            {
                driver.switchTo().window(child_window);
            }
        }
        driver.switchTo().window(parent2);
    }
    public  void do_share_on_link(String user, String pass){
        driver.findElement(FB_BUTTON2).click();
        // It will return the parent window name as a String
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                driver.findElement(FB_ID).sendKeys(user);
                driver.findElement(FB_Pass).sendKeys(pass);
                driver.findElement(FB_Log_In2).click();
                try
                {
                    Thread.sleep(5000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
            }
        }
        //switch to the parent window
        driver.switchTo().window(parent);
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(PROFILE).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(PROFILE_BUTTON).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(SHARE_BUTTON).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(SHARE_LINK).click();
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(SHARE_CANCEL).click();
        }
        public  void  do_search_magazine(String user, String pass){
            driver.findElement(FB_BUTTON2).click();
            // It will return the parent window name as a String
            String parent=driver.getWindowHandle();
            Set<String> s=driver.getWindowHandles();
            // Now iterate using Iterator
            Iterator<String> I1= s.iterator();
            while(I1.hasNext())
            {
                String child_window=I1.next();
                if(!parent.equals(child_window))
                {
                    driver.switchTo().window(child_window);
                    driver.findElement(FB_ID).sendKeys(user);
                    driver.findElement(FB_Pass).sendKeys(pass);
                    driver.findElement(FB_Log_In2).click();
                    try
                    {
                        Thread.sleep(5000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            //switch to the parent window
            driver.switchTo().window(parent);
            driver.findElement(SEARCH_ICON).click();
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            driver.findElement(SEARCH_BOX).sendKeys("THE PHOBLOGRAPHER MAGAZINE");
            try
            {
                Thread.sleep(5000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
    public  void  do_create_magazine(String user, String pass){
        driver.findElement(FB_BUTTON2).click();
        // It will return the parent window name as a String
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                driver.findElement(FB_ID).sendKeys(user);
                driver.findElement(FB_Pass).sendKeys(pass);
                driver.findElement(FB_Log_In2).click();
                try
                {
                    Thread.sleep(5000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
            }
        }
        //switch to the parent window
        driver.switchTo().window(parent);
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(COMPOSE_ICON).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(CREATE_MAGAZINE).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(TITLE_MAGAZINE).sendKeys("The Indefinite Article");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(DESC_MAGAZINE).sendKeys("The indefinite article takes two forms. It’s the word a when it precedes a word that begins with a consonant. It’s the word an when it precedes a word that begins with a vowel. The indefinite article indicates that a noun refers to a general idea rather than a particular thing. For example, you might ask your friend, “Should I bring a gift to the party?” Your friend will understand that you are not asking about a specific type of gift or a specific item. “I am going to bring an apple pie,” your friend tells you. Again, the indefinite article indicates that she is not talking about a specific apple pie. Your friend probably doesn’t even have any pie yet. The indefinite article only appears with singular nouns.");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(SAVE_MAGAZINE).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(CANCEL_MAGAZINE).click();
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

    }
    public  void  do_add_comment(String user, String pass){
        driver.findElement(FB_BUTTON2).click();
        // It will return the parent window name as a String
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                driver.findElement(FB_ID).sendKeys(user);
                driver.findElement(FB_Pass).sendKeys(pass);
                driver.findElement(FB_Log_In2).click();
                try
                {
                    Thread.sleep(5000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
            }
        }
        //switch to the parent window
        driver.switchTo().window(parent);
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(COMPOSE_ICON).click();
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(LINK_MAGAZINE).sendKeys("https://www.grammarly.com/blog/articles/");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(COMMENT_MAGAZINE).sendKeys("Flip Comment");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(FLIP_BUTTON).click();
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}


