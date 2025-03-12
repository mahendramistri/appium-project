package tests;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import io.appium.java_client.AppiumDriver;

public class BaseClass {
    AppiumDriver driver;
    DesiredCapabilities caps;


    public void setup() {
        AppiumServerStart.startServer();
        try {

            caps = new DesiredCapabilities();
            caps.setCapability("platformName", "android");
            caps.setCapability("appium:platformVersion", "13");
            caps.setCapability("appium:deviceName", "192.168.29.197:5555");
            //caps.setCapability("appium:udid", "R9ZR7060NLP");
            caps.setCapability("appium:automationName", "UiAutomator2");
            caps.setCapability("appium:newCommandTimeout", "60");
            caps.setCapability("appium:app", "E:\\android-app-sample\\ApiDemos-debug.apk");
            caps.setCapability("appium:appPackage", "io.appium.android.apis");

            // caps.setCapability("appActivity","io.appium.android.apis.");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver(url, caps);
        } catch (Exception exp) {
            System.out.println("Exception catched!!");
        }
    }

    public void tearDown() {
        driver.quit();
        AppiumServerStart.stopServer();
    }

}
