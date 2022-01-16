import time

import pytest
import allure
from allure_commons.types import AttachmentType
from Config.config import TestData
from Pages.HomePage import HomePage
from Tests.test_base import BaseTest

@allure.severity(allure.severity_level.NORMAL)
class TestSignup(BaseTest):
    @allure.severity(allure.severity_level.CRITICAL)
    def test_sign_up_mail(self):
        self.homepage = HomePage(self.driver)
        self.homepage.do_signup()
        title = self.homepage.get_title(TestData.HOME_PAGE_TITLE)
        assert title == TestData.HOME_PAGE_TITLE
        self.driver.delete_all_cookies()


    @allure.severity(allure.severity_level.CRITICAL)
    def test_sign_up_fb(self):
        self.homepage = HomePage(self.driver)
        self.homepage.do_signup_fb()
        time.sleep(2)
        title = self.homepage.get_title(TestData.HOME_PAGE_TITLE)
        assert title == TestData.HOME_PAGE_TITLE





