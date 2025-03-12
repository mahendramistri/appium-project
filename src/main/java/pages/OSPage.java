package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OSPage {
    private final AppiumDriver driver;
    private final WebDriverWait wait;

    public OSPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // Locators
    public WebElement getMessagingElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("SMS Messaging")));
    }

}
