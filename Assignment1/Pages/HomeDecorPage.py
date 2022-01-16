import time
from selenium import webdriver
from Config.config import TestData
from Pages.BasePage import BasePage
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from webdriver_manager.chrome import ChromeDriverManager
class HomeDecorPage(BasePage):

    HOME_DECOR = (By.XPATH, '//h1 [@class="css-1nfbwaz ewg3qed0"]')

    def __init__(self, driver):
        super().__init__(driver)
        self.driver.get(TestData.HOME_DECOR_URL)

    def go_home_decor(self):
        HOME_DECOR_TEXT = self.get_element_text(self.HOME_DECOR)
        return HOME_DECOR_TEXT
