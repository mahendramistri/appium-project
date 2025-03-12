package tests;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import utility.ScreenshotUtils;

public class HomePageTest extends BaseClass {
    HomePage homePage;

    @BeforeClass
    public void startClass() {
        setup();
        homePage = new HomePage(driver);
    }
    @Test
    public void testAssertOSElement() throws InterruptedException {
        Assert.assertEquals(homePage.getOSElement().getText(), "OS");
        //ScreenshotUtils.captureScreenshot(driver,"name");
    }

    @AfterClass
    public void afterClass() {
        tearDown();
    }
}
