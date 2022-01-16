import time
from selenium import webdriver
from Config.config import TestData
from Pages.BasePage import BasePage
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from webdriver_manager.chrome import ChromeDriverManager
class CyberMondayPage(BasePage):

    CYBER_MONDAY = (By.XPATH, '//span [@class="breadcrumbs__label css-uhxo7j e1lqgzim1 internal-link"]')

    def __init__(self, driver):
        super().__init__(driver)
        self.driver.get(TestData.CYBER_MONDAY_URL)

    def go_cyber_monday(self):
        CYBER_MONDAY_TEXT = self.get_element_text(self.CYBER_MONDAY)
        return CYBER_MONDAY_TEXT
