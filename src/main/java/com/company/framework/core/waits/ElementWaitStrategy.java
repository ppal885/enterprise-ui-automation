
package com.company.framework.core.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ElementWaitStrategy {
    WebElement applyWait(WebDriver driver, By locator);
}
