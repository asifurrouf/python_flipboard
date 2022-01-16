import time
from selenium import webdriver
from Config.config import TestData
from Pages.BasePage import BasePage
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from webdriver_manager.chrome import ChromeDriverManager

class GooglePlayPage(BasePage):

    GOOGLE_LOGO = (By.XPATH, '//a[@aria-label="Google Play Logo"]')

    def __init__(self, driver):
        super().__init__(driver)
        self.driver.get(TestData.GOOGLE_PLAY_PAGE_LINK)



    def go_google_play(self):
        self.do_click(self.GOOGLE_LOGO)
