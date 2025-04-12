
package com.company.framework.core.actions;

import com.company.framework.core.waits.ElementWaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementActionExecutor {
    private final WebDriver driver;

    public WebElementActionExecutor(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator, ElementWaitStrategy strategy) {
        strategy.applyWait(driver, locator).click();
    }

    public void sendKeys(By locator, String value, ElementWaitStrategy strategy) {
        WebElement element = strategy.applyWait(driver, locator);
        element.clear();
        element.sendKeys(value);
    }

    public String getText(By locator, ElementWaitStrategy strategy) {
        return strategy.applyWait(driver, locator).getText();
    }
}
