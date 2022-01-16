import time
import pytest
import allure
from allure_commons.types import AttachmentType
from Config.config import TestData
from Pages.AppStorePage import AppStorePage
from Pages.GooglePlayPage import GooglePlayPage
from Tests.test_base import BaseTest

@allure.severity(allure.severity_level.NORMAL)
class TestAppStore(BaseTest):
    @allure.severity(allure.severity_level.CRITICAL)
    def test_apple_store_page(self):
        self.app_store = AppStorePage(self.driver)
        self.app_store.go_apple()
        title = self.app_store.get_title(TestData.APP_STORE_PAGE_TITLE)
        assert title == TestData.APP_STORE_PAGE_TITLE
    def test_google_play_page(self):
        self.google_play = GooglePlayPage(self.driver)
        self.google_play.go_google_play()
        title = self.google_play.get_title(TestData.GOOGLE_PLAY_PAGE_TITLE)
        assert title == TestData.GOOGLE_PLAY_PAGE_TITLE