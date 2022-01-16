import time
from selenium import webdriver
from Config.config import TestData
from Pages.BasePage import BasePage
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from webdriver_manager.chrome import ChromeDriverManager

class HomePage(BasePage):
    SIGNUP_BUTTON = (By.XPATH, '//div//button[@data-vars-button-name="main-nav-signup-cta"]')
    EMAIL_FIELD = (By.XPATH, '//input[@type="email"]')
    NAME_FIELD = (By.XPATH, '//input[@type="text"]')
    PASSWORD_FIELD = (By.XPATH, '//input[@type="password"]')
    CONTINUE_BUTTON = (By.XPATH, '//button[@type="submit"]')
    FB_BUTTON = (By.XPATH, '//div[@class="signup__social-buttons-wrapper"]')
    FB_ID = (By.ID, "email")
    FB_Pass = (By.ID, "pass")
    FB_Log_In = (By.ID, "loginbutton")
    FB_Continue = (By.XPATH, '//div [@aria-label="Continue as Aahil"]')

    def __init__(self, driver):
        super().__init__(driver)
        self.driver.get(TestData.BASE_URL)

    def do_signup(self):
        time.sleep(2)
        self.do_click(self.SIGNUP_BUTTON)
        time.sleep(2)
        self.do_send_keys(self.EMAIL_FIELD, TestData.EMAIL)
        time.sleep(1)
        self.do_send_keys(self.NAME_FIELD, TestData.FULL_NAME)
        time.sleep(1)
        self.do_send_keys(self.PASSWORD_FIELD, TestData.PASSWORD)
        time.sleep(2)
        self.do_click(self.CONTINUE_BUTTON)

    def do_signup_fb(self):
        time.sleep(1)
        self.do_click(self.SIGNUP_BUTTON)
        time.sleep(2)
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