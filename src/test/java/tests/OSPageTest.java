package tests;

import base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OSPage;

public class OSPageTest extends BaseClass {
    OSPage osPage;
    HomePage homePage;
    @BeforeClass
    public void startClass() {
        setup();
        homePage = new HomePage(driver);
        osPage = new OSPage(driver);
    }

    @Test
    public void checkMessaging() throws InterruptedException {
        homePage.getOSElement().click();
        osPage.getMessagingElement().click();
    }

    @AfterClass
    public void afterClass() {
        tearDown();
    }
}
