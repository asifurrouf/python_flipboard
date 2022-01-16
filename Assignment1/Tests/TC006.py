import time
import pytest
import allure
from allure_commons.types import AttachmentType
from Config.config import TestData
from Pages.LoginPage import LoginPage
from Pages.HomeDecorPage import HomeDecorPage
from Pages.EntertainmentPage import EntertainmentPage
from Pages.CyberMondayPage import CyberMondayPage
from Pages.DailyEdition import DailyEditionPage
from Tests.test_base import BaseTest

@allure.severity(allure.severity_level.NORMAL)
class TestPost(BaseTest):
    @allure.severity(allure.severity_level.CRITICAL)
    def test_share_facebook(self):
        self.login = LoginPage(self.driver)
        result = self.login.do_share_on_fb()
        assert result
        self.driver.delete_all_cookies()

    @allure.severity(allure.severity_level.CRITICAL)
    def test_share_twitter(self):
        self.login = LoginPage(self.driver)
        result = self.login.do_share_on_tw()
        assert result
        self.driver.delete_all_cookies()

    @allure.severity(allure.severity_level.CRITICAL)
    def test_share_link(self):
        self.login = LoginPage(self.driver)
        result = self.login.do_share_on_link()
        assert result
        self.driver.delete_all_cookies()
    @allure.severity(allure.severity_level.CRITICAL)
    def test_search_magazine(self):
        self.login = LoginPage(self.driver)
        result = self.login.do_sharch_magazine()
        assert result
        self.driver.delete_all_cookies()
    @allure.severity(allure.severity_level.CRITICAL)
    def test_create_magazine(self):
        self.login = LoginPage(self.driver)
        result = self.login.do_create_magazine()
        assert result
        self.driver.delete_all_cookies()

    @allure.severity(allure.severity_level.CRITICAL)
    def test_add_comment(self):
        self.login = LoginPage(self.driver)
        result = self.login.do_add_comment()
        assert result
        self.driver.delete_all_cookies()

    # @allure.severity(allure.severity_level.CRITICAL)
    # def test_LIKE_OR_NOT(self):
    #     self.login = LoginPage(self.driver)
    #     result = self.login.do_like()
    #     assert result
    #     self.driver.delete_all_cookies()

    # @allure.severity(allure.severity_level.CRITICAL)
    # def test_follow(self):
    #     self.login = LoginPage(self.driver)
    #     result = self.login.do_follow()
    #     assert result == TestData.FOLLOWING_PAGE
    #     self.driver.delete_all_cookies()

    # @allure.severity(allure.severity_level.CRITICAL)
    # def test_profile_icon(self):
    #     self.login = LoginPage(self.driver)
    #     result = self.login.do_profile_icon()
    #     assert result == TestData.PROFILE_PAGE
    #     self.driver.delete_all_cookies()

