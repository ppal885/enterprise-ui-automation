
package com.company.framework.core.actions;

import com.company.framework.core.waits.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class FluentElementInteractionBuilder {

    private WebDriver driver;
    private WebElementActionExecutor executor;
    private final List<Runnable> interactions = new ArrayList<>();

    public static FluentElementInteractionBuilder initialize() {
        return new FluentElementInteractionBuilder();
    }

    public FluentElementInteractionBuilder usingDriver(WebDriver driver) {
        this.driver = driver;
        this.executor = new WebElementActionExecutor(driver);
        return this;
    }

    public FluentElementInteractionBuilder sendText(By locator, String value) {
        interactions.add(() -> executor.sendKeys(locator, value, new WaitUntilElementIsVisible()));
        return this;
    }

    public FluentElementInteractionBuilder clickElement(By locator) {
        interactions.add(() -> executor.click(locator, new WaitUntilElementIsClickable()));
        return this;
    }

    public void execute() {
        for (Runnable action : interactions) {
            action.run();
        }
    }
}
