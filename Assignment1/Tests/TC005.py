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
class TestHome(BaseTest):

    @allure.severity(allure.severity_level.CRITICAL)
    def test_for_you(self):
        self.login = LoginPage(self.driver)
        title = self.login.go_for_you()
        assert title == TestData.FOR_YOU
        self.driver.delete_all_cookies()

    @allure.severity(allure.severity_level.CRITICAL)
    def test_cyber_monday(self):
        self.cyber = CyberMondayPage(self.driver)
        title = self.cyber.go_cyber_monday()
        assert title == TestData.CYBER_MONDAY
        self.driver.delete_all_cookies()

    @allure.severity(allure.severity_level.CRITICAL)
    def test_daily_edition(self):
        self.daily = DailyEditionPage(self.driver)
        title = self.daily.go_daily_edition()
        assert title == TestData.DAILY_EDITION
        self.driver.delete_all_cookies()

    @allure.severity(allure.severity_level.CRITICAL)
    def test_home_decor(self):
        self.home_decor = HomeDecorPage(self.driver)
        title = self.home_decor.go_home_decor()
        assert title == TestData.HOME_DECOR
        self.driver.delete_all_cookies()

    @allure.severity(allure.severity_level.CRITICAL)
    def test_entertainment(self):
        self.entertainment = EntertainmentPage(self.driver)
        title = self.entertainment.go_entertainment()
        assert title == TestData.ENTERTAINMENT
        self.driver.delete_all_cookies()

    @allure.severity(allure.severity_level.CRITICAL)
    def test_edit_favorites(self):
        self.login = LoginPage(self.driver)
        title = self.login.go_edit_favorites()
        assert title == TestData.FAVORITES_TITLE
        self.driver.delete_all_cookies()

