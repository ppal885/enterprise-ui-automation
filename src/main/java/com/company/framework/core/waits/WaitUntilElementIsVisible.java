
package com.company.framework.core.waits;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class WaitUntilElementIsVisible implements ElementWaitStrategy {
    public WebElement applyWait(WebDriver driver, By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
