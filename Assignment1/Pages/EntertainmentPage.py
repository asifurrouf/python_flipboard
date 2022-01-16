import time
from selenium import webdriver
from Config.config import TestData
from Pages.BasePage import BasePage
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from webdriver_manager.chrome import ChromeDriverManager
class EntertainmentPage(BasePage):

    Entertainment = (By.XPATH, '//h1')

    def __init__(self, driver):
        super().__init__(driver)
        self.driver.get(TestData.ENTERTAINMENT_LINK)

    def go_entertainment(self):
        ENTERTAINMENT_TEXT = self.get_element_text(self.Entertainment)
        return ENTERTAINMENT_TEXT