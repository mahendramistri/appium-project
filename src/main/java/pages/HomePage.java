package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private final AppiumDriver driver;
    private final WebDriverWait wait;


    public HomePage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // Locators
    public WebElement getOSElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("OS")));
    }

}
