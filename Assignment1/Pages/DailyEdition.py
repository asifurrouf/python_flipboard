import time
from selenium import webdriver
from Config.config import TestData
from Pages.BasePage import BasePage
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from webdriver_manager.chrome import ChromeDriverManager
class DailyEditionPage(BasePage):

    DAILY_EDITION = (By.XPATH, '//h1[@class="storyboard-header__title content-story-heading--large"]')

    def __init__(self, driver):
        super().__init__(driver)
        self.driver.get(TestData.DAILY_EDITION_URL)

    def go_daily_edition(self):
        DAILY_EDITION_TEXT = self.get_element_text(self.DAILY_EDITION)
        return DAILY_EDITION_TEXT
