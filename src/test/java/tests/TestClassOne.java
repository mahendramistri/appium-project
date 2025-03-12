package tests;

import base.BaseClass;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClassOne extends BaseClass {

@BeforeClass
public void startClass()
{
    setup();
}

    @Test
    public void testOne() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("OS")).click();
         /*
         driver.findElement(AppiumBy.accessibilityId("SMS Messaging")).click();

        driver.findElement(AppiumBy.accessibilityId("Enable SMS broadcast receiver")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"io.appium.android.apis:id/sms_recipient\"]")).sendKeys("Hello");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"io.appium.android.apis:id/sms_content\"]")).sendKeys("Hello");
        driver.findElement(AppiumBy.accessibilityId("Send")).click();
        Thread.sleep(3000);
        */
        driver.navigate().back();
        Thread.sleep(3000);
    }

    @Test
    public void testTwo() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("OS")).click();
        driver.navigate().back();
        Thread.sleep(3000);

    }

    @AfterClass
    public void afterClass()
    {
        tearDown();
    }

}



