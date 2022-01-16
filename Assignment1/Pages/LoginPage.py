import time
from selenium import webdriver
from Config.config import TestData
from Pages.BasePage import BasePage
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.keys import Keys

class LoginPage(BasePage):
    USERNAME_FIELD = (By.NAME, "username")
    PASSWORD_FIELD = (By.NAME, "password")
    SIGNIN_BUTTON = (By.XPATH, '//button[@data-vars-button-name="login__form-submit"]')
    FB_BUTTON = (By.XPATH, '//button[@data-vars-button-name="facebook-login"]')
    APPLE_BUTTON = (By.XPATH, '//div[@class="apple-login__wrapper"]')
    GOOGLE_BUTTON = (By.XPATH, '//button[@data-vars-button-name="google-login"]')
    TWITTER_BUTTON = (By.XPATH, '//button[@data-vars-button-name="twitter-login"]')
    FOR_YOU = (By.XPATH, '//a[@href="/"]//h2[@class="favorites-menu__title"]')
    CYBER_MONDAY = (By.XPATH, '//h1[@class="ui-text--page-title magazine-header__title"]')
    FB_ID = (By.ID, "email")
    FB_Pass = (By.ID, "pass")
    FB_Log_In = (By.ID, "loginbutton")
    GMAIL_ID = (By.NAME, "identifier")
    GMAIL_PASS = (By.NAME, "password")
    SCIENCE_INDIA = (By.XPATH, '//a[@href="/topic/indianscience"]')
    EDIT_FAVORITES = (By.XPATH, '//div[@class="favorites-menu__link favorites-menu__edit-favorites ui-text--title"]')
    ADD_FAVORITES = (By.XPATH, '//button[@data-vars-button-name="manage-favorites-add-favorite"]')
    INPUT_FAVORITES = (By.XPATH, '//input')
    SAVE_FAVORITES = (By.XPATH, '//button[@data-vars-button-name="topic-customization-done"]')
    TITLE_FAVORITES = (By.XPATH, '//a[@href="/topic/indianscience"]//h2')
    PROFILE = (By.XPATH, '//button//div//div//picture//img')
    PROFILE_BUTTON = (By.XPATH, '//a[@href="/profile"]')
    SHARE_BUTTON = (By.XPATH, '//button[@data-vars-button-name="profile-header-share"]')
    SHARE_FACEBOOK = (By.XPATH, '//button[@data-vars-button-name="share-facebook"]')
    SHARE_TW = (By.XPATH, '//button[@data-vars-button-name="share-twitter"]')
    SHARE_LINK = (By.XPATH, '//input')
    SEARCH_BOX = (By.XPATH, '//input')
    SHARE_CANCEL = (By.XPATH, '//button[@data-vars-button-name="create-magazine-dismiss"]')
    POST_FACEBOOK = (By.NAME, "__CONFIRM__")
    SEARCH_ICON = (By.XPATH, '//div/*[name()="svg"][@aria-labelledby="search-icon-title"]')
    FOLLOW_ICON = (By.XPATH, '//a[@ href="/following"]/*[name()="svg"]')
    COMPOSE_ICON = (By.XPATH, '//div/*[name()="svg"][@aria-labelledby="flip-compose-icon-title"]')
    CREATE_MAGAZINE = (By.XPATH, '//div [@class="flip-compose__create-magazine-label"]')
    TITLE_MAGAZINE = (By.XPATH, '//input[@name="title"]')
    DESC_MAGAZINE = (By.XPATH, '//textarea[@ name="description"]')
    SAVE_MAGAZINE = (By.XPATH, '//button[@data-vars-button-name="create-magazine-save"]')
    CANCEL_MAGAZINE = (By.XPATH, '//button[@data-vars-button-name="flip-compose-cancel"]')
    LINK_MAGAZINE = (By.XPATH, '//input[@name="flip-compose-flip-url"]')
    COMMENT_MAGAZINE = (By.XPATH, '//textarea [@class="flip-compose__form-caption"]')
    FLIP_BUTTON = (By.XPATH, '//button [@data-vars-button-name="flip-compose-submit"]')
    LIKE = (By.XPATH, '//article//a[@href="/@axiosnews/axios-1ijujvslz"]/../../../../../..//footer//button/*[name()="svg"][@aria-labelledby="like-icon-title"]')


    def __init__(self, driver):
        super().__init__(driver)
        self.driver.get(TestData.LOGIN_PAGE_lINK)

    def do_log_in_mail(self):
        self.do_send_keys(self.USERNAME_FIELD, TestData.USER_NAME)
        self.do_send_keys(self.PASSWORD_FIELD, TestData.PASSWORD)
        self.do_click(self.SIGNIN_BUTTON)

    def do_log_in_fb(self):
        self.do_click(self.FB_BUTTON)
        time.sleep(2)
        parent_handle = self.driver.current_window_handle
        all_handles = self.driver.window_handles

        for handle in all_handles:
            if handle != parent_handle:
                self.driver.switch_to.window(handle)
                time.sleep(2)
                self.do_send_keys(self.FB_ID, TestData.FB_ID)
                time.sleep(1)
                self.do_send_keys(self.FB_Pass, TestData.FB_Pass)
                time.sleep(2)
                self.do_click(self.FB_Log_In)
                time.sleep(2)
        self.driver.switch_to.window(parent_handle)

    def do_share_on_fb(self):
        self.do_click(self.FB_BUTTON)
        time.sleep(2)
        parent_handle = self.driver.current_window_handle
        all_handles = self.driver.window_handles

        for handle in all_handles:
            if handle != parent_handle:
                self.driver.switch_to.window(handle)
                time.sleep(2)
                self.do_send_keys(self.FB_ID, TestData.FB_ID)
                time.sleep(1)
                self.do_send_keys(self.FB_Pass, TestData.FB_Pass)
                time.sleep(2)
                self.do_click(self.FB_Log_In)
                time.sleep(2)
        self.driver.switch_to.window(parent_handle)
        self.do_click(self.PROFILE)
        self.do_click(self.PROFILE_BUTTON)
        self.do_click(self.SHARE_BUTTON)
        self.do_click(self.SHARE_FACEBOOK)

        parent = self.driver.current_window_handle
        tabs = self.driver.window_handles
        for tab in tabs:
            if tab != parent:
                self.driver.switch_to.window(tab)
                time.sleep(2)
                self.do_click(self.POST_FACEBOOK)
        self.driver.switch_to.window(parent)
        return True

    def do_share_on_tw(self):
        self.do_click(self.FB_BUTTON)
        time.sleep(2)
        parent_handle = self.driver.current_window_handle
        all_handles = self.driver.window_handles

        for handle in all_handles:
            if handle != parent_handle:
                self.driver.switch_to.window(handle)
                time.sleep(2)
                self.do_send_keys(self.FB_ID, TestData.FB_ID)
                time.sleep(1)
                self.do_send_keys(self.FB_Pass, TestData.FB_Pass)
                time.sleep(2)
                self.do_click(self.FB_Log_In)
                time.sleep(2)
        self.driver.switch_to.window(parent_handle)
        self.do_click(self.PROFILE)
        self.do_click(self.PROFILE_BUTTON)
        self.do_click(self.SHARE_BUTTON)
        self.do_click(self.SHARE_TW)

        parent = self.driver.current_window_handle
        tabs = self.driver.window_handles
        for tab in tabs:
            if tab != parent:
                self.driver.switch_to.window(tab)

        self.driver.switch_to.window(parent)
        return True
    def do_share_on_link(self):
        self.do_click(self.FB_BUTTON)
        time.sleep(2)
        parent_handle = self.driver.current_window_handle
        all_handles = self.driver.window_handles

        for handle in all_handles:
            if handle != parent_handle:
                self.driver.switch_to.window(handle)
                time.sleep(2)
                self.do_send_keys(self.FB_ID, TestData.FB_ID)
                time.sleep(1)
                self.do_send_keys(self.FB_Pass, TestData.FB_Pass)
                time.sleep(2)
                self.do_click(self.FB_Log_In)
                time.sleep(2)
        self.driver.switch_to.window(parent_handle)
        self.do_click(self.PROFILE)
        self.do_click(self.PROFILE_BUTTON)
        self.do_click(self.SHARE_BUTTON)
        time.sleep(3)
        self.do_click(self.SHARE_LINK)
        time.sleep(3)
        self.do_click(self.SHARE_CANCEL)
        return True
    def do_sharch_magazine(self):
        self.do_click(self.FB_BUTTON)
        time.sleep(2)
        parent_handle = self.driver.current_window_handle
        all_handles = self.driver.window_handles

        for handle in all_handles:
            if handle != parent_handle:
                self.driver.switch_to.window(handle)
                time.sleep(2)
                self.do_send_keys(self.FB_ID, TestData.FB_ID)
                time.sleep(1)
                self.do_send_keys(self.FB_Pass, TestData.FB_Pass)
                time.sleep(2)
                self.do_click(self.FB_Log_In)
                time.sleep(2)
        self.driver.switch_to.window(parent_handle)
        self.do_click(self.SEARCH_ICON)
        self.do_send_keys(self.SEARCH_BOX, TestData.MAGAZINE_TITLE)
        time.sleep(3)
        return True
    def do_follow(self):
        self.do_click(self.FB_BUTTON)
        time.sleep(2)
        parent_handle = self.driver.current_window_handle
        all_handles = self.driver.window_handles

        for handle in all_handles:
            if handle != parent_handle:
                self.driver.switch_to.window(handle)
                time.sleep(2)
                self.do_send_keys(self.FB_ID, TestData.FB_ID)
                time.sleep(1)
                self.do_send_keys(self.FB_Pass, TestData.FB_Pass)
                time.sleep(2)
                self.do_click(self.FB_Log_In)
                time.sleep(2)
        self.driver.switch_to.window(parent_handle)
        self.do_click(self.FOLLOW_ICON)
        TEXT = self.get_title(TestData.FOLLOWING_PAGE)
        return TEXT


    def do_profile_icon(self):
        self.do_click(self.FB_BUTTON)
        time.sleep(2)
        parent_handle = self.driver.current_window_handle
        all_handles = self.driver.window_handles

        for handle in all_handles:
            if handle != parent_handle:
                self.driver.switch_to.window(handle)
                time.sleep(2)
                self.do_send_keys(self.FB_ID, TestData.FB_ID)
                time.sleep(1)
                self.do_send_keys(self.FB_Pass, TestData.FB_Pass)
                time.sleep(2)
                self.do_click(self.FB_Log_In)
                time.sleep(2)
        self.driver.switch_to.window(parent_handle)
        self.do_click(self.PROFILE)
        self.do_click(self.PROFILE_BUTTON)
        TEXT = self.get_title(TestData.PROFILE_PAGE)
        return TEXT

    def do_create_magazine(self):
        self.do_click(self.FB_BUTTON)
        time.sleep(2)
        parent_handle = self.driver.current_window_handle
        all_handles = self.driver.window_handles

        for handle in all_handles:
            if handle != parent_handle:
                self.driver.switch_to.window(handle)
                time.sleep(2)
                self.do_send_keys(self.FB_ID, TestData.FB_ID)
                time.sleep(1)
                self.do_send_keys(self.FB_Pass, TestData.FB_Pass)
                time.sleep(2)
                self.do_click(self.FB_Log_In)
                time.sleep(2)
        self.driver.switch_to.window(parent_handle)
        time.sleep(1)
        self.do_click(self.COMPOSE_ICON)
        time.sleep(1)
        self.do_click(self.CREATE_MAGAZINE)
        time.sleep(1)
        self.do_send_keys(self.TITLE_MAGAZINE, TestData.TITLE)
        time.sleep(1)
        self.do_send_keys(self.DESC_MAGAZINE, TestData.DESC)
        time.sleep(1)
        self.do_click(self.SAVE_MAGAZINE)
        time.sleep(1)
        self.do_click(self.CANCEL_MAGAZINE)
        time.sleep(3)
        return True
    def do_add_comment(self):
        self.do_click(self.FB_BUTTON)
        time.sleep(2)
        parent_handle = self.driver.current_window_handle
        all_handles = self.driver.window_handles

        for handle in all_handles:
            if handle != parent_handle:
                self.driver.switch_to.window(handle)
                time.sleep(2)
                self.do_send_keys(self.FB_ID, TestData.FB_ID)
                time.sleep(1)
                self.do_send_keys(self.FB_Pass, TestData.FB_Pass)
                time.sleep(2)
                self.do_click(self.FB_Log_In)
                time.sleep(2)
        self.driver.switch_to.window(parent_handle)
        time.sleep(1)
        self.do_click(self.COMPOSE_ICON)
        time.sleep(1)
        self.do_send_keys(self.LINK_MAGAZINE,TestData.FLIP_LINK)
        time.sleep(1)
        self.do_send_keys(self.COMMENT_MAGAZINE, TestData.FLIP_COMMENT)
        self.do_click(self.FLIP_BUTTON)
        time.sleep(3)
        return True

    def do_log_in_apple(self):
        self.do_click(self.APPLE_BUTTON)
        parent_handle = self.driver.current_window_handle
        all_handles = self.driver.window_handles

        for handle in all_handles:
            if handle != parent_handle:
                self.driver.switch_to.window(handle)
                time.sleep(5)
                self.driver.close()
        self.driver.switch_to.window(parent_handle)


    def do_log_in_google(self):
        self.do_click(self.GOOGLE_BUTTON)
        time.sleep(2)
        parent_handle = self.driver.current_window_handle
        all_handles = self.driver.window_handles
        for handle in all_handles:
            if handle != parent_handle:
                self.driver.switch_to.window(handle)
                time.sleep(2)
                self.do_send_keys(self.GMAIL_ID, TestData.EMAIL)
                time.sleep(1)
                self.do_send_keys(self.GMAIL_ID, Keys.ENTER)
        self.driver.switch_to.window(parent_handle)

    def do_log_in_twitter(self):
        self.do_click(self.TWITTER_BUTTON)
        time.sleep(2)

    def go_for_you(self):
        self.do_send_keys(self.USERNAME_FIELD, TestData.USER_NAME)
        self.do_send_keys(self.PASSWORD_FIELD, TestData.PASSWORD)
        self.do_click(self.SIGNIN_BUTTON)
        FOR_YOU_TEXT = self.get_element_text(self.FOR_YOU)
        return FOR_YOU_TEXT
    def go_edit_favorites(self):
        self.do_send_keys(self.USERNAME_FIELD, TestData.USER_NAME)
        self.do_send_keys(self.PASSWORD_FIELD, TestData.PASSWORD)
        self.do_click(self.SIGNIN_BUTTON)
        time.sleep(2)
        self.do_click(self.EDIT_FAVORITES)
        time.sleep(1)
        self.do_click(self.ADD_FAVORITES)
        time.sleep(1)
        self.do_send_keys(self.INPUT_FAVORITES, TestData.FAVORITES)
        time.sleep(1)
        self.do_click(self.SCIENCE_INDIA)
        time.sleep(1)
        self.do_click(self.SAVE_FAVORITES)
        time.sleep(1)
        FAVORITES_TEXT = self.get_element_text(self.TITLE_FAVORITES)
        return FAVORITES_TEXT

    def do_like(self):
        self.do_click(self.FB_BUTTON)
        time.sleep(2)
        parent_handle = self.driver.current_window_handle
        all_handles = self.driver.window_handles

        for handle in all_handles:
            if handle != parent_handle:
                self.driver.switch_to.window(handle)
                time.sleep(2)
                self.do_send_keys(self.FB_ID, TestData.FB_ID)
                time.sleep(1)
                self.do_send_keys(self.FB_Pass, TestData.FB_Pass)
                time.sleep(2)
                self.do_click(self.FB_Log_In)
                time.sleep(2)
        self.driver.switch_to.window(parent_handle)
        time.sleep(2)
        self.do_click(self.LIKE)
        time.sleep(2)


