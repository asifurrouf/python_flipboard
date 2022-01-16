package TestCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
public static AppiumDriver driver;

    public static void Android_setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("deviceName", "Toumal Galaxy A71");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.UDID, "R58N75AL36K");
        capabilities.setCapability("app",
                System.getProperty("user.dir") + "/apps/Flipboard Latest News Top Stories Lifestyle_v4.2.89_apkpure.com.apk");
        capabilities.setCapability("appPackage","flipboard.app");
        capabilities.setCapability("appActivity","flipboard.activities.LaunchActivity");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

    }



    public static void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }
}
