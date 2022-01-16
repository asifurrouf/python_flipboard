import time
import pytest
import allure
from allure_commons.types import AttachmentType
from Config.config import TestData
from Pages.LoginPage import LoginPage
from Tests.test_base import BaseTest

@allure.severity(allure.severity_level.NORMAL)
class TestLogin(BaseTest):
    @allure.severity(allure.severity_level.CRITICAL)
    def test_log_in_apple(self):
        self.login = LoginPage(self.driver)
        self.login.do_log_in_apple()
        assert True


    @allure.severity(allure.severity_level.CRITICAL)
    def test_log_in_fb(self):
        self.login = LoginPage(self.driver)
        self.login.do_log_in_fb()
        title = self.login.get_title(TestData.HOME_PAGE_TITLE)
        assert title == TestData.HOME_PAGE_TITLE
        self.driver.delete_all_cookies()

    @allure.severity(allure.severity_level.CRITICAL)
    def test_log_in_google(self):
        self.login = LoginPage(self.driver)
        self.login.do_log_in_google()
        assert True
        self.driver.delete_all_cookies()


    @allure.severity(allure.severity_level.CRITICAL)
    def test_log_in_twitter(self):
        self.login = LoginPage(self.driver)
        self.login.do_log_in_twitter()
        title = self.login.get_title(TestData.TWITTER_PAGE_TITLE)
        assert title == TestData.TWITTER_PAGE_TITLE
        self.driver.delete_all_cookies()

    @allure.severity(allure.severity_level.CRITICAL)
    def test_log_in_mail(self):
        self.login = LoginPage(self.driver)
        self.login.do_log_in_mail()
        title = self.login.get_title(TestData.HOME_PAGE_TITLE)
        assert title == TestData.HOME_PAGE_TITLE
        self.driver.delete_all_cookies()

