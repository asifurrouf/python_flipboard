import pytest
import allure
from allure_commons.types import AttachmentType
from Config.config import TestData
from Pages.HomePage import HomePage
from Tests.test_base import BaseTest

class TestHome(BaseTest):
    def test_home_page_title(self):
        self.homepage = HomePage(self.driver)
        title = self.homepage.get_title(TestData.HOME_PAGE_TITLE)
        assert title == TestData.HOME_PAGE_TITLE